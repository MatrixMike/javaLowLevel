/*
 * Friday13.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 11 November 2015
 * mod for mlug 04.08.2016 11:10:30   mlug.java
 * http://www.java2s.com/Tutorials/Java/java.util/Calendar/Java_Calendar_get_int_field_.htm
 */
 /*
 DAY_OF_WEEK was 3 = Tuesday ; 5 =Thursday
 */
// package Friday13;   removed to make compile and run 
import java.text.SimpleDateFormat;
import java.util.*;

public class dermpav {
private static int daysAhead = 365;	

public static void main (String args[]) {
	Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
	SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");

	for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  
		{
			System.out.println(weekCheck(cldr, dateformatter));		
		}
	    cldr.add(Calendar.DAY_OF_YEAR, +1);  //  examine why cldr and Calendar 
	 }
}

 /**
 * weekCheck()
 * @author  (Mike Hewitt)
 * @version (1.1)
 * @param C supply instance(?) of Calendar
 * @param S supply previously organised display format
 * @return String 
 * @see mlug.java 
 */
   static String weekCheck(Calendar C, SimpleDateFormat S){
		String testStr; 
//		    Calendar now = Calendar.getInstance();
	 if (  ( (C.get(Calendar.DAY_OF_WEEK_IN_MONTH)==1) && (C.get(Calendar.DAY_OF_WEEK)==7) )){
		
		int monthA = C.get(Calendar.MONTH); 
		C.add(C.DAY_OF_YEAR, +7);	
		int monthB = C.get(Calendar.MONTH); 
		if (monthA == monthB) {
		}
		else { // print derived from monthA
		C.add(C.DAY_OF_YEAR, -7);	
		}
		return S.format(C.getTime());


	 // now that I am returning a value I need to refactor to only return the desired dates
	 // called from a FOR loop so this demands that a return happens each loop
    }
	return S.format(C.getTime());
}
}
