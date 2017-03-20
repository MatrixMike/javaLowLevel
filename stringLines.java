// 01 September  2004
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// import javax.swing.*;


// fifty pence piece school maths problem, to compute the area.

public class stringLines extends Applet {

	public void paint(Graphics g)
	{  
// can re-size window when drawn - try for effect
int  ymax = getSize().height;   // reads the size as set in GuiDisplay
int  xmax = getSize().width;
// int  xmax = 400;
// int  ymax = 400;
//int     x = xmax;
//int     y = ymax;
int xstep = xmax /30;
int ystep = ymax /30;
int ytemp = ymax;
int xtemp = xmax;

g.setColor(Color.white);
g.fillRect(0,0,getSize().width, getSize().height);


//		g.drawString(words, xmax/2, ymax/2); // put words in centre
            g.setColor(Color.green);

// now generate points from y=0 in x steps of xstep

            for ( int px = 0 ; px <= xmax ; px = px + xstep) {            
              g.drawLine (px, 0 , 0, ytemp );
              ytemp = ytemp - ystep;
	      }

            g.setColor(Color.red);
            ytemp = ymax ;
            for ( int px = 0 ; px <= xmax ; px = px + xstep) {            
              g.drawLine (px, ymax , xmax, ytemp );
              ytemp = ytemp - ystep;
	      }

            g.setColor(Color.blue);
            xtemp = 0 ;
            for ( int py = 0 ; py <= ymax ; py = py + ystep) {            
              g.drawLine (xmax, py , xtemp, 0 );
              xtemp = xtemp + xstep;
	      }

            g.setColor(Color.gray);
            xtemp = 0 ;
            for ( int py = 0 ; py <= ymax ; py = py + ystep) {            
              g.drawLine (0, py , xtemp, ymax );
              xtemp = xtemp + xstep;  
// consider the effect if instead of x going up, start high and work down
	      }

	}
    private String labelString;       // The label for the window
    private int faces;                // number of faces on polygon

    public void init() {
        String polygonSides = getParameter("sides");
        faces = (polygonSides == null) ? 5 : (Integer.parseInt(polygonSides));
                                faces = (faces < 3) ? 5 : faces;
                                faces = (faces > 11) ? 5 : faces;
  //    faces = 6;
        labelString = getParameter("lbl");
        if (labelString == null)
            labelString = "Blink";
        Font font = new java.awt.Font("Serif", Font.PLAIN, 24);
        setFont(font);
    }

    public String[][] getParameterInfo() {
        String pinfo[][] = {
            {"sides", "", "Number of sides of Polygon"},
            {"lbl", "string", "The text to blink."},
        };
        return pinfo;
    }


}
