// import java.lang.*;
// import java.util.*;
//import java.lang.Object;
// import java.lang.object;
// 05 October 2011

import java.text.Format;
import java.util.*;                //Note 1



public class TabGen {

// on Tony IBM testing Java 7 ?

public static  void header() {
	  
  System.out.println( "<head>") ;
    System.out.println( "<title>Java generated table</title>") ;
  System.out.println( "</head>") ;
 
}
public static void main (String args[]) {
	String name;               // Declare a variable to hold the name.
	String names[] ;
	Scanner in = new Scanner(System.in);
// DateFormat df = DateFormat.getDateInstance();
  System.out.println( "<html>") ;    //  header
 header();
  System.out.println( "<body>") ;
  System.out.println( "<H1 ALIGN=CENTER>My PIC projects</H1>") ;
int n = 1;
String one = "http://www.electroteach.com/pics/TabGen.html";
String two = "Explanation here</A>";


System.out.println( "<TABLE BORDER ALIGN=CENTER>") ;
 // System.out.println( "<TABLE>") ;


for ( int rows = 1; rows < 4; rows = rows +1 ) {
  System.out.print( "<TR>") ;
	for ( int cols = 1; cols < 3; cols=cols+1 ) {

//	if (n % 3 !=0)  {    // if n div 3 not  eq 3 then
	System.out.println( "<TH>") ;
	        name = in.nextLine();      // Read one line from the console.


	System.out.println(
// this line is split to allow easy commenting out of unwanted parts
//		n + " " +
		 name) ;




	System.out.print("</TH>") ;
//	}
	n=n+1;
}

  System.out.print( "</TR>") ;
}

	System.out.println( "</TABLE>") ;

	   System.out.println("<A HREF=" + one + two);

  System.out.println( "</body></html>") ;
     in.close();
}
}


