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
 * @return String 
 */
   static String weekCheck(Calendar C, SimpleDateFormat S){
		String testStr; 
//		    Calendar now = Calendar.getInstance();
	 if (  ( (C.get(Calendar.DAY_OF_WEEK_IN_MONTH)==1) && (C.get(Calendar.DAY_OF_WEEK)==7) )){
	//	System.out.println("found something");
	
	//x	testStr = S.format(C.getTime());
	//x	System.out.println(testStr);
		
		int monthA = C.get(Calendar.MONTH); 
		C.add(C.DAY_OF_YEAR, +7);	
		int monthB = C.get(Calendar.MONTH); 
		if (monthA == monthB) {
		//	System.out.println("same");
		//	System.out.println("<same> "+S.format(C.getTime()));  // "same"
						// System.out.println(S.format(C.getTime()));  // "same"
					return S.format(C.getTime());
		}
		else { // print derived from monthA
					C.add(C.DAY_OF_YEAR, -7);	
				//	System.out.println("<Not same> "+S.format(C.getTime()));	// "Not same"		
					// System.out.println(S.format(C.getTime()));
					return S.format(C.getTime());
		}
		/*
		get the month of current date -> Ma
		* add 7 days to date
		* get the month of the new date -> Mb
		* check if they are same
		
		*/
		/*
    if(monthA == C.AUGUST){
      System.out.println("AUGUST");
      C.add(C.DAY_OF_YEAR, +7);			// look ahead for the following month
      	     System.out.println("B "+S.format(C.getTime()));	
   //   int month2 = C.get(C.MONTH);
         C.add(C.DAY_OF_YEAR, +7);	
      if(C.get(C.MONTH) == C.SEPTEMBER){
	     System.out.println("SEPTEMBER");	  
      }
	 }
	 * */
	 // need to get the month and save for a test
    }
	return S.format(C.getTime());
}
}
