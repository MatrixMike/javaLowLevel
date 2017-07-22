/*
 * Check.java
 * http://stackoverflow.com/questions/9698359/setbackgroundnew-color-in-java-does-not-understand-the-given-rgb-value
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Font;
import java.awt.Graphics;

public class Check extends JFrame {

    private static final long serialVersionUID = 1L;
/**
 * makeUI
 * 
 */
    public void makeUI() {
		    int fontSize = 20;
//		        Dimension d = this.getPreferredSize();
//       JFrame f = new JFrame();
        JFrame frame = new JFrame("myanmar text");
        frame.getContentPane().setBackground(new Color(255, 255, 000));
    //        f.setColor(255, 000, 255);  
		String s = "www.electroteach.com";
		JLabel label = new JLabel(s);
		    label.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
//		        frame.setColor(Color.black);
//		label.setFont(new java.awt.Font("Myanmar3", 0, 20));// font insert here, Myanmar Text, Padauk, Myanmar3, Tharlon
		frame.getContentPane().add(label);
		frame.pack();
 //  f.drawString(s, 10, 80);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 200));
        frame.setVisible(true);
    }
/**
 * 
 * 
 * 
 * @param args command line input
 */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Check().makeUI();
            }
        });
    }
}

