
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 

/*
 * September 12 2015
 *
 */

public class waves2 extends Applet {
// make it read the variables from either the html or the applet self
int cosv = 5;
int sinv = 19;
int paintcount = 0;
/**
 * @param x double input value
 * @return double this value gets plotted against x
 */
    double f(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqa) + Math.sin(x/fqb) + 2) * getSize().height / 4;

    }
    /**
 * @param x double input value
 * @return double this value gets plotted against x
 */
    double f1(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqa) + 2) * getSize().height / 4;

    }
/**
 * @param x double input value
 * @return double this value gets plotted against x
 */
    double f2(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqb) + 2) * getSize().height / 4;

    }
    /**
 * @param x double input value
 * @return double this value gets plotted against x
 */
    double f3(double x) {
// nearly original	return (Math.cos(x/cosv) + Math.sin(x/sinv) + 2) * getSize().height / 4;
// use sin and cos to change phase
	return (Math.sin(x/fqa) * Math.sin(x/fqb) + 2) * getSize().height / 4;

    }
    /*
    	public  void stream_from_function() {
		Stream.iterate(0, n -> n + 1)
		.limit(getSize().width)
	//	.skip(2)
	//	.filter(w -> (w % 5) == 0)
		.forEach(System.out::println);
		//  .forEach(	x ->    g.drawLine(x, (int)f1(x), x + 1, (int)f1(x + 1)));
		    // 				list.forEach( v -> System.out.println("value is "+ v));
	}
	* */
/**
 * @param g Graphics to render image upon
 * @return double this value gets plotted against x
 */	
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
	Stream.iterate(0, n -> n + 3)   // was n+1
		.limit(getSize().width)
		.parallel()
					//	.skip(2)
					//	.filter(w -> (w % 5) == 0)
					//	.forEach(System.out::println);
		.forEach(	x ->    g.drawLine(x, (int)f(x), x + 1, (int)f1(x + 1)));



	g.setColor(Color.blue);
	Stream.iterate(0, n -> n + 3)   // was n+1
		.limit(getSize().width)
		.parallel()
					//	.skip(2)
					//	.filter(w -> (w % 5) == 0)
					//	.forEach(System.out::println);
		.forEach(	x ->    g.drawLine(x, (int)f1(x), x + 1, (int)f1(x + 1)));
		
  //r   for (int x = 0 ; x < getSize().width ; x++) {
	//r    g.drawLine(x, (int)f1(x), x + 1, (int)f1(x + 1));
   //r     }

	g.setColor(Color.green);
	Stream.iterate(0, n -> n + 3)   // was n+1
		.limit(getSize().width)
		.parallel()
					//	.skip(2)
					//	.filter(w -> (w % 5) == 0)
					//	.forEach(System.out::println);
		.forEach(	x ->    g.drawLine(x, (int)f2(x), x + 1, (int)f2(x + 1)));

 /*       for (int x = 0 ; x < getSize().width ; x++) {
	    g.drawLine(x, (int)f2(x), x + 1, (int)f2(x + 1));
        }
*/
	g.setColor(Color.black);
	Stream.iterate(0, n -> n + 2)   // was n+1
		.limit(getSize().width)
		.parallel()
					//	.skip(2)
					//	.filter(w -> (w % 5) == 0)
					//	.forEach(System.out::println);
		.forEach(	x ->    g.drawLine(x, (int)f3(x), x + 1, (int)f3(x + 1)));
         
 /*      for (int x = 0 ; x < getSize().width ; x++) {
	    g.drawLine(x, (int)f3(x), x + 1, (int)f3(x + 1));
       }
*/

	System.out.println("MJH(paint)  "+paintcount); paintcount ++ ;
    }
    private int fqa,fqb;
    public void init() {
        String Fa = getParameter("freqa");
        String Fb = getParameter("freqb");
        fqa = Integer.parseInt(Fa);

        fqb = Integer.parseInt(Fb);

        System.out.println("MJH(init) freqa= "+Fa+" freqb= "+Fb);
     //   stream_from_function();
 //       System.out.println("MJH freqb= "+Fb);
    }
/**
 * @param null
 * @return string
 */
  public String getAppletInfo() {
    return "Draws a sin graph. Now using Lambdas and Streams  - 25-08-2015";
  }
  /**
 * @param 
 * @return 
 */
    public String[][] getParameterInfo() {
        String pinfo[][] = {
            {"freqa", "", "Frequency A"},
            {"freqb", "", "Frequency B"},
        };
        return pinfo;
    }
/**
 * @param color function
 * @return 
 */    
/*public void plotFunction() {
// pass in the color and the function 
	g.setColor(Color.red);
	Stream.iterate(0, n -> n + 3)   // was n+1
		.limit(getSize().width)
		.parallel()
					//	.skip(2)
					//	.filter(w -> (w % 5) == 0)
					//	.forEach(System.out::println);
		.forEach(	x ->    g.drawLine(x, (int)f(x), x + 1, (int)f1(x + 1)));

}
*/
}

