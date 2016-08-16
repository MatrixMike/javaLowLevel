/*
 * @(#)GraphApplet.java	1.7 03/01/23
 * 
 * Not expected to execute really well but the result of a session to add documentation
 * 16.08.2016
 * So to get the effect need to run javadoc on this source
 * this was worked on using geany 1.23.1 with javadoc Standard Doclet version 1.8.0_11
 */
package mikeApplet;
import java.awt.Graphics;
/**
 * An Applet to generate and display values as a function of x
 * @author Mike Hewitt
 * @version 1.1
 */
public class GraphApplet extends java.applet.Applet {
	
/**
 * generate values as a function of x
 * @param x value to process
 * @return double multiple trigonometric function
 */
public double f(double x) {   // was without the public -> added for javadoc purpose
	return (Math.cos(x/5) + Math.sin(x/7) + 2) * getSize().height / 4;
}

/**
 * Render the effect
 * @param g environment to paint on
 */
public void paint(Graphics g) {
        for (int x = 0 ; x < getSize().width ; x++) {
	    g.drawLine(x, (int)f(x), x + 1, (int)f(x + 1));
        }
}

/**
 * supply some info about the Applet
 * @return info about Applet
 */
public String getAppletInfo() {
    return "Draws a sin graph.";
  }
}
// aid to reading this: method <function> f on line 43 is called twice on line 49
// also try javap -c on this for insight into code generation
