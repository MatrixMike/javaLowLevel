/*

 * Sun Microsystems, Inc. has intellectual property rights relating
 * to technology embodied in the product that is described in
 * this document.
 * In particular, and without limitation, these intellectual property
 * rights may include one or more of the U.S. patents listed at
 * http://www.sun.com/patents
 * and one or more additional patents or pending patent applications
 * in the U.S. and in other countries.
 *
 * Unpublished - rights reserved under the Copyright Laws of the
 * United States.
 *
 * THIS PRODUCT CONTAINS CONFIDENTIAL INFORMATION AND TRADE SECRETS
 * OF SUN MICROSYSTEMS, INC. USE, DISCLOSURE OR REPRODUCTION IS
 * PROHIBITED WITHOUT THE PRIOR EXPRESS WRITTEN PERMISSION OF SUN
 * MICROSYSTEMS, INC.
 *
 * U.S. Government Rights - Commercial software. Government users are
 * subject to the Sun Microsystems, Inc.
 * standard license agreement and applicable provisions of the FAR and
 * its supplements.Use is subject to license terms.
 * This distribution may include materials developed by third parties.
 *
 * Sun, Sun Microsystems, the Sun logo, Java, Jini and the Java Coffee
 * Cup logo are trademarks or registered trademarks of Sun
 * Microsystems, Inc. in the U.S. and other countries.
 *
 * This product is covered and controlled by U.S. Export Control laws
 * and may be subject to the export or import laws in other countries.
 * Nuclear, missile, chemical biological weapons or nuclear maritime
 * end uses or end users, whether direct or indirect, are strictly
 * prohibited. Export or reexport to countries subject to U.S. embargo
 * or to entities identified on U.S. export exclusion lists, including,
 * but not limited to the denied persons and specially designated
 * nationals lists is strictly prohibited.
 * 
 * 
 * 23.09.2015 14:52:27
 * Note in     private void startMeasuring()  use of  }.start();
 * does not compile yet - MIDlet code 
 */


package examples.sensor;

import java.io.IOException;

import javax.microedition.io.Connector;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;
import javax.microedition.sensor.*;

/**
 * The SensorBrowser demo displays a list of all sensors. User can select sensor
 * and click detail for detailed informations about sensor name, type, channels,
 * etc.
 */
public class SensorBrowser extends MIDlet implements CommandListener,
        ItemStateListener, DataListener {

    private static final Command CMD_LIST_DETAIL =
            new Command("DetailX", Command.ITEM, 1);
    private static final Command CMD_EXIT =
            new Command("Exit", Command.EXIT, 1);
    private static final Command CMD_BACK =
            new Command("Back", Command.BACK, 1);

    private SensorInfo[] sensorInfos;

    private Display display;
    private List sensorsList;
    private Form sensorDetail;
    private ChoiceGroup channelsChoiceGroup;
    private int currentSensorId;
    private int channelIndex;
    private StringItem currentChannelValue;
    private SensorConnection sensorConnection;

    public SensorBrowser() {
        display = Display.getDisplay(this);

        sensorsList = new List("Sensors list MJH:", List.EXCLUSIVE);
        sensorInfos = SensorManager.findSensors(null, null);
        for (int i = 0; i < sensorInfos.length; i++) {
            sensorsList
                    .append(constructVisibleSensorName(sensorInfos[i]), null);
        }
        sensorsList.addCommand(CMD_LIST_DETAIL);
        sensorsList.addCommand(CMD_EXIT);
        sensorsList.setCommandListener(this);
    }

    protected void destroyApp(boolean unconditional) {
    }

    protected void pauseApp() {
    }

    protected void startApp() {
        display.setCurrent(sensorsList);
    }

    public void commandAction(Command c, Displayable d) {
        if (d.equals(sensorsList)) {
            if (CMD_LIST_DETAIL == c) {
                currentSensorId = sensorsList.getSelectedIndex();
                createSensorDetail();
                display.setCurrent(sensorDetail);
                startMeasuring();
            } else if (CMD_EXIT == c) {
                destroyApp(false);
                notifyDestroyed();
            }
        } else if (d.equals(sensorDetail)) {
            if (CMD_BACK == c) {
                stopMeasuring();
                display.setCurrent(sensorsList);
            }
        }
    }

    private void startMeasuring() {
        new Thread() {
            public void run() {
                synchronized (SensorBrowser.this) {
                    try {
                        sensorConnection =
                                (SensorConnection) Connector
                                        .open(sensorInfos[currentSensorId]
                                                .getUrl());
                        sensorConnection.setDataListener(SensorBrowser.this, 1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    private void stopMeasuring() {

   	 	new Thread() {
            public void run() {
                synchronized (SensorBrowser.this) {
                    try {
				        if (sensorConnection != null) {
				            try {
				                sensorConnection.removeDataListener();
				                sensorConnection.close();
				            } catch (IOException e) {
				                e.printStackTrace();
				            }
				            sensorConnection = null;
				        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    public void itemStateChanged(Item item) {
        if (item.equals(channelsChoiceGroup)) {
            channelIndex = channelsChoiceGroup.getSelectedIndex();
            deleteChannelInfoForm();
            insertChannelInfoForm(sensorInfos[currentSensorId]
                    .getChannelInfos()[channelIndex]);
        }
    }

    private void createSensorDetail() {
        SensorInfo sensorInfo = sensorInfos[currentSensorId];
        sensorDetail =
                new Form("Sensor detail: "
                        + constructVisibleSensorName(sensorInfo));
        sensorDetail.append(new StringItem("Quantity:", sensorInfo
                .getQuantity(), StringItem.LAYOUT_LEFT));
        sensorDetail.append(new StringItem("Model:", sensorInfo.getModel(),
                StringItem.LAYOUT_LEFT));
        sensorDetail.append(new StringItem("Context type:", sensorInfo
                .getContextType(), StringItem.LAYOUT_LEFT));
        sensorDetail.append(new StringItem("Connection type:",
                connectionTypeToString(sensorInfo.getConnectionType())));
        sensorDetail.append(new StringItem("URL:", sensorInfo.getUrl(),
                StringItem.LAYOUT_LEFT));
        sensorDetail.append(new StringItem("Description:", sensorInfo
                .getDescription(), StringItem.LAYOUT_LEFT));

        String[] properties = sensorInfo.getPropertyNames();
        for (int i = 0; i < properties.length; i++) {
            Object value = sensorInfo.getProperty(properties[i]);
            sensorDetail.append(new StringItem(properties[i] + ":", value
                    .toString(), StringItem.LAYOUT_LEFT));
        }

        channelsChoiceGroup = new ChoiceGroup("Channel:", Choice.POPUP);
        sensorDetail.append(channelsChoiceGroup);
        sensorDetail.setItemStateListener(this);

        ChannelInfo[] channelInfos = sensorInfo.getChannelInfos();
        for (int i = 0; i < channelInfos.length; i++) {
            channelsChoiceGroup.append(channelInfos[i].getName(), null);
        }
        channelIndex = 0;
        ChannelInfo channelInfo = channelInfos[channelIndex];
        insertChannelInfoForm(channelInfo);

        sensorDetail.addCommand(CMD_BACK);
        sensorDetail.setCommandListener(this);
    }

    private String connectionTypeToString(int connectionType) {
        switch (connectionType) {
        case SensorInfo.CONN_EMBEDDED:
            return "embedded";
        case SensorInfo.CONN_REMOTE:
            return "remote";
        case SensorInfo.CONN_SHORT_RANGE_WIRELESS:
            return "short range wireless";
        case SensorInfo.CONN_WIRED:
            return "wired";
        default:
            return "unknown";
        }
    }

    private String dataTypeToString(int dataType) {
        switch (dataType) {
        case ChannelInfo.TYPE_DOUBLE:
            return "double";
        case ChannelInfo.TYPE_INT:
            return "integer";
        case ChannelInfo.TYPE_OBJECT:
            return "object";
        default:
            return "unknown";
        }
    }

    private String constructVisibleSensorName(SensorInfo sensorInfo) {
        return sensorInfo.getQuantity() + " (" + sensorInfo.getModel() + ";"
                + sensorInfo.getContextType() + ")";
    }

    private void deleteChannelInfoForm() {
        int idx;
        for (idx = 0; idx < sensorDetail.size(); idx++) {
            if (channelsChoiceGroup.equals(sensorDetail.get(idx))) {
                break;
            }
        }
        for (idx++; idx < sensorDetail.size();) {
            sensorDetail.delete(idx);
        }
    }

    private void insertChannelInfoForm(ChannelInfo channelInfo) {
        currentChannelValue =
                new StringItem("Current Value:", "unknown",
                        StringItem.LAYOUT_LEFT);
        sensorDetail.append(currentChannelValue);
        sensorDetail.append(new StringItem("   Unit:", channelInfo.getUnit()
                .toString(), StringItem.LAYOUT_LEFT));
        sensorDetail.append(new StringItem("Scale:", String.valueOf(channelInfo
                .getScale()), StringItem.LAYOUT_LEFT));
        sensorDetail.append(new StringItem("Data type:",
                dataTypeToString(channelInfo.getDataType()),
                StringItem.LAYOUT_LEFT));
        sensorDetail.append(new StringItem("Accuracy:", String
                .valueOf(channelInfo.getAccuracy()), StringItem.LAYOUT_LEFT));

        MeasurementRange[] measurementRanges =
                channelInfo.getMeasurementRanges();
        for (int i = 0; i < measurementRanges.length; i++) {
            sensorDetail.append(new StringItem("Range[" + i + "]:", "<"
                    + String.valueOf(measurementRanges[i].getSmallestValue())
                    + "; "
                    + String.valueOf(measurementRanges[i].getLargestValue())
                    + "> resolution:" + measurementRanges[i].getResolution(),
                    StringItem.LAYOUT_LEFT));
        }
    }

    public void dataReceived(SensorConnection sensor, Data[] data,
            boolean isDataLost) {
        int dataType = data[channelIndex].getChannelInfo().getDataType();
        if (ChannelInfo.TYPE_DOUBLE == dataType) {
            currentChannelValue.setText(String.valueOf(data[channelIndex]
                    .getDoubleValues()[0]));
        } else if (ChannelInfo.TYPE_INT == dataType) {
            currentChannelValue.setText(String.valueOf(data[channelIndex]
                    .getIntValues()[0]));
        } else if (ChannelInfo.TYPE_OBJECT == dataType) {
            currentChannelValue.setText("object");
        }
    }
}
