/*
 * Friday13.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 11 November 2015
 * 
 * 
 */
 /*
 DAY_OF_WEEK was 3 = Tuesday ; 5 =Thursday
 */
// package Friday13;   removed to make compile and run 
import java.text.SimpleDateFormat;
import java.util.*;
public class ECA1 {
	private static int daysAhead = 365;	
public static void main (String args[]) {
	Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
	SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");
	String testStr;


	for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  
		if (( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2) &&   // Electronics Altona
		(cldr.get(Calendar.DAY_OF_WEEK)==7) ))
		{
			testStr = dateformatter.format(cldr.getTime());
			System.out.println(testStr);
		}
	    cldr.add(Calendar.DAY_OF_YEAR, +1);
	 }
}
}
