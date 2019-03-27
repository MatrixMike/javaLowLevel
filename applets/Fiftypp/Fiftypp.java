// 01 September  2004
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// import javax.swing.*;


// fifty pence piece school maths problem, to compute the area.

public class Fiftypp extends Applet {
  public void paint(Graphics g) {
// private Color handColor;
  double [] xArray = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f  };  // put float values in table and fill correctly
// added value at high end to allow to compile
  double [] yArray = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f  };  // with real co-ords by for loop later

 // int sides = 7;      // for a fifty Pence piece sides = 7
  int sides =  faces ;
//  int maxx = 320;     // getSize().width;
//  int maxy = 320;     // getSize().height;
  int from;           // drawing lines FROM
  int to;             // drawing lines TO
// handColor = Color.blue;

int maxy = getSize().height;
int maxx = getSize().width;

  double theta = 360/sides;
  // double mpi = 3.1417232f;           //replace with real java value
  double halfangle = theta/2.0f;

   for (int index = 1; index < (sides+1); index++ ){
    xArray[index] =Math.cos((index*theta*Math.PI   +  halfangle)/180  ) ; // values in radians
    yArray[index] =Math.sin((index*theta*Math.PI   +  halfangle)/180  ) ;
   //   =COS((F1*PI())/180)
   }
//  here need to scale values up to be centre of display area
//  better to get the min of the X and Y to make the shape undistorted

   for (int index = 1; index < (sides+1); index++ ){
    xArray[index] = (xArray[index] * maxx/2) + maxx/2;
    yArray[index] = (yArray[index] * maxy/2) + maxy/2;
   }

// may have to go through the array and create INT values

 // g.fillPolygon(xArray, yArray, 5);   // why 5

for (int index = 1; index < sides+1 ; index ++){
// needs a MOD operation = to link last point with first
  from = index;
  to   = index+1;
  g.setColor(Color.blue);

  if ( index == sides ) {
     to = 1;
  }
  g.drawLine( (int) xArray[from],(int)  yArray[from] ,(int)  xArray[to] ,(int)  yArray[to]);

}

// now experimenting :
for (int index = 1; index < sides+1 ; index ++){
 to = index;
  g.setColor(Color.red);
 g.drawLine( maxx, maxy/3, (int)  xArray[to] ,(int)  yArray[to]);
  g.setColor(Color.green);
 g.drawLine( maxx/2 ,maxy/2 , (int)  xArray[to] ,(int)  yArray[to]);

}


//  g.drawArc(20,20,150,50,0,90);

  }
    private String labelString;       // The label for the window
    private int faces;                // number of faces on polygon

    public void init() {
        String polygonSides = getParameter("sides");
        faces = (polygonSides == null) ? 5 : (Integer.parseInt(polygonSides));
                                faces = (faces < 3) ? 5 : faces;
                                faces = (faces > 15) ? 5 : faces;					//mjh 13/9/09
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
