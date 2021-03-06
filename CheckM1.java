/*
 * Check.java
 * http://stackoverflow.com/questions/9698359/setbackgroundnew-color-in-java-does-not-understand-the-given-rgb-value
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 
 * 17.08.2016  
 * this compile and executes - check out EXIT_ON_CLOSE 
 * used javadoc to display the inheritence tree
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CheckM1 extends JFrame {

    private static final long serialVersionUID = 1L;
/**
 * makeUI
 * 
 */
    public void makeUI() {
        JFrame f = new JFrame("Mike test text");
        f.getContentPane().setBackground(new Color(255, 255, 000));
 //           f.setColor(Color.red);  
 //   f.drawString("www.electroteach.com", 10, 80);

        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setSize(new Dimension(300, 200));
        f.setVisible(true);
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

