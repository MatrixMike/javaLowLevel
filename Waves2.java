
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Waves2 extends Applet {
// make it read the variables from either the html or the applet self
int cosv = 5;
int sinv = 19;
int paintcount = 0;

    double f(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqa) + Math.sin(x/fqb) + 2) * getSize().height / 4;

    }
    double f1(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqa) + 2) * getSize().height / 4;

    }

    double f2(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqb) + 2) * getSize().height / 4;

    }
    double f3(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqa) * Math.sin(x/fqb) + 2) * getSize().height / 4;

    }
    public void paint(Graphics g) {
// set colour for combined waves
g.setColor(Color.white);
g.fillRect(0,0,getSize().width, getSize().width);

           g.setColor(Color.blue);
//       for (int x = 0 ; x < getSize().width ; x++) {
//	    g.drawLine(x, (int)f(x), x + 1, (int)f(x + 1));
//        }
// set colour for f1

           g.setColor(Color.red);
     for (int x = 0 ; x < getSize().width ; x++) {
	    g.drawLine(x, (int)f1(x), x + 1, (int)f1(x + 1));
        }

           g.setColor(Color.green);
        for (int x = 0 ; x < getSize().width ; x++) {
	    g.drawLine(x, (int)f2(x), x + 1, (int)f2(x + 1));
        }

          g.setColor(Color.black);
       for (int x = 0 ; x < getSize().width ; x++) {
	    g.drawLine(x, (int)f3(x), x + 1, (int)f3(x + 1));
       }


        System.out.println("MJH(paint)  "+paintcount); paintcount ++ ;
    }
    private int fqa,fqb;
    public void init() {
        String Fa = getParameter("freqa");
        String Fb = getParameter("freqb");
        fqa = Integer.parseInt(Fa);

        fqb = Integer.parseInt(Fb);

        System.out.println("MJH(init) freqa= "+Fa+" freqb= "+Fb);
 //       System.out.println("MJH freqb= "+Fb);
    }

  public String getAppletInfo() {
    return "Draws a sin graph.";
  }
    public String[][] getParameterInfo() {
        String pinfo[][] = {
            {"freqa", "", "Frequency A"},
            {"freqb", "", "Frequency B"},
        };
        return pinfo;
    }

}

