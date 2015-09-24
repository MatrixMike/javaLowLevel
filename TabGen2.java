// import java.lang.*;
// import java.util.*;
//import java.lang.Object;
// import java.lang.object;
// 05 October 2011
// Wednesday, 11 January 2012
// latest 25.09.2015 08:57:07


import java.text.Format;
import java.util.*;                //Note 1
public class TabGen2 {

// on Tony IBM testing Java 7 ?

public static void main (String args[]) {
	        String name;               // Declare a variable to hold the name.

        String names[] ;




        Scanner in = new Scanner(System.in);
// DateFormat df = DateFormat.getDateInstance();



  System.out.println( "<html>") ;    //  header
  System.out.println( "<head>") ;
  System.out.println( "<title>PIC projects summary table</title>") ;
  System.out.println( "</head>") ;
  System.out.println( "<body>") ;
  System.out.println( "<H1 ALIGN=CENTER>My PIC projects</H1>") ;
  System.out.println( "<H2 ALIGN=CENTER>Wednesday, 11 January 2012</H2>") ;
  System.out.println( "<H3 ALIGN=CENTER>colour & background coming soon</H3>") ;

  // Monday, 9 January 2012   - ctrl shift right click

int n = 1;
String one = "http://www.electroteach.com/pics/TabGen.html";
String two = "Explanation here</A>";


System.out.println( "<TABLE BORDER ALIGN=CENTER>") ;
 // System.out.println( "<TABLE>") ;


for ( int rows = 0; rows < 22-1; rows = rows +1 ) {
  System.out.println( "<TR>") ;


  		//first the item number (ordinal or cardinal)
  	System.out.print( "<TH>") ;   // rows tested twice in same loop as cols thf prints twice
  	if (rows == 0) System.out.print( " " ) ;      else           System.out.print( rows ) ;
	System.out.println( "</TH>") ;


	for ( int cols = 1; cols < 4; cols=cols+1 ) {     // was 3
	//  now added a column so increase cols by 1 to cope

// e.g. URL for 3rd column http://groups.melbpc.org.au/#micro

//	if (n % 3 !=0)  {    // if n div 3 not  eq 3 then
	System.out.println( "<TH>") ;
	        name = in.nextLine();      // Read one line from the console.


	System.out.println(
// this line is split to allow easy commenting out of unwanted parts
//		n + " " +
		 name) ;

	System.out.println( "</TH>") ;
//	}
	n=n+1;
}

  System.out.println( "</TR>") ;
}

	System.out.println( "</TABLE>") ;

	   System.out.println("<A HREF=" + one +" "+ two);

  System.out.println( "</body></html>") ;
     in.close();
}
}
