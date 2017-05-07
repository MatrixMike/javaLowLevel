import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import com.electroteach.shapes;

import java.util.*;
public class DrawApplet extends Applet {
	Vector Shapes = new Vector();
	public void init() {
		addMouseListener (new Mousehandler(this));
	}
	public void paint(Graphics g) {
		Square s;
		for (Enumeration e = shapes.elements();
		e.hasMoreElements(); )
		{
			s = (Square)e.nextElement();
			s.draw(this.getGraphics());
		}
	}
class MouseHandler extends MouseAdapter {
	DrawApplet applet;
	public MouseHandler(DrawApplet a){
		applet = a;
	}
	public void mouseReleased(MouseEvent e) {
		applet.Shapes.addElement(new Square(e.getX(), e.getY()));
		applet.repaint();
	}
}
}

