
// import java.lang.*;
// import java.util.*;
//import java.lang.Object;
// import java.lang.object;
// 05 October 2011
// Wednesday, 11 January 2012
// latest 25.09.2015 08:57:07

/*
 * Recent requirement is to create a webpage that directs users to the photos 
 * Consider use on local computer:
 * Needs to read the directory and create URLs to each photo
 * The date of generation needs to be displayed -> thus the user can see approx age
 * name: Mike
 * @param
 * @return
 * This really early version was a test of some features of Java. Now need to use some of 
 * the stuff learned.  Line 58 has a hard coded 22 - need to read until EOF
 * 
 * 25.09.2015 10:04:49
 */



import java.text.Format;
import java.util.*;                //Note 1
public class TabGen2old {

// on Tony IBM testing Java 7 ?

public static void main (String args[]) {
	String name;               // Declare a variable to hold the name.
//	String names[] ;

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
	String one = "https://www.electroteach.com/pics/TabGen.html";
	String two = "Explanation here</A>";

	System.out.println( "<TABLE BORDER ALIGN=CENTER>") ;
 // System.out.println( "<TABLE>") ;


	for ( int rows = 0; rows < 22-1; rows = rows +1 ) {		// was 22-1
		System.out.println( "<TR>") ;


  		//first the item number (ordinal or cardinal)
		System.out.print( "<TH>") ;   // rows tested twice in same loop as cols thf prints twice
		if (rows == 0) System.out.print( " " ) ;      else           System.out.print( rows ) ;
		System.out.println( "</TH>") ;

		for ( int cols = 1; cols < 4; cols=cols+1 ) {     // was 3
			// we wrap each element read from input with <TH>     25.09.2015 10:16:30 
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
}	//main
}	//class
