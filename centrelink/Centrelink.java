/*
 * Friday13.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 11 November 2015
 * Aim here is to show a list of dates for Newstart payments merged with a list of Rent dates
 * preferrably do this with streams and maybe lambdas
 * Rent is per calendar month on 28th day and Newstart payment (a.o.t. reporting) is per fortnight
 * Newstart = $ 718.20
 * Rent     = $1173.00
 * start date set at 19Feb2017 -> Newstart credit of $ 718.20 (=day 50)
 * http://www.java2s.com/Tutorials/Java/java.util/Calendar/Java_Calendar_get_int_field_.htm
 * http://javatutorialhq.com/java/util/calendar-class-tutorial/set-method-example/
 */
 /*
 DAY_OF_WEEK was 3 = Tuesday ; 5 =Thursday
 */
// package Friday13;   removed to make compile and run 
import java.text.SimpleDateFormat;
import java.util.*;

public class Centrelink {
private static int daysAhead = 365;	

/**
 * main()
 * @author  (Mike Hewitt)
 * @version (1.1)
 */
public static void main (String args[]) {
	Double balance = 0.0;
	Double newstartFunds = 718.20;
	Double rentMonthly = 1173.00;
	boolean printBalance = false;
	
	Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
	SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");

		cldr.set(Calendar.YEAR, 2017); // set the year
		cldr.set(Calendar.MONTH, 1); // set the month
		cldr.set(Calendar.DAY_OF_MONTH, 19); // set the

//	Calendar cldr = Calendar.set(2017, 1);
	for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  
		{  // add here a check that month is Jan thru Nov -> so don't do weekCheck for December 
//			weekCheck(cldr, dateformatter);
			//System.out.println(NewstartCredit(cldr, dateformatter));
			if (NewstartCredit(cldr, dateformatter)) {
				balance += newstartFunds;
				System.out.format(" balance N= %.2f" , balance);
				printBalance = true;
			}
			if (RentDebit(cldr, dateformatter)) {
				balance -= rentMonthly;
				System.out.format(" balance R= %.2f" , balance);
				printBalance = true;
			}
			if (printBalance) {
				balanceCheck(cldr, dateformatter);
				System.out.format(" %n");
				printBalance = false;
			}
		}
	    cldr.add(Calendar.DAY_OF_YEAR, +1);  //  examine why cldr and Calendar 
	 }
}

/**
 * consider a function to return bool if Rent date and another one to return bool if Newstart payment
 * 
 */
 public static boolean NewstartCredit(Calendar C, SimpleDateFormat S){	 
	 // calculate the recurring Newstart dates 
//	 return   ( C.get(Calendar.DAY_OF_YEAR)  ==   150 ) ;
	 	 return (((
	 	 (C.get(Calendar.DAY_OF_YEAR)) - 50) % 14) == 0 )
	 	  ;
	 //&& (C.get(Calendar.DAY_OF_WEEK)==2) ))	 
 }

 public static boolean RentDebit(Calendar C, SimpleDateFormat S){
	 return    C.get(Calendar.DAY_OF_MONTH)  ==   28 ;
 }

/**
 * weekCheck()
 * @author  (Mike Hewitt)
 * @version (1.1)
 * @param C supply instance(?) of Calendar
 * @param S supply previously organised display format
 */
public static void weekCheck(Calendar C, SimpleDateFormat S){
		String testStr; 
//		    Calendar now = Calendar.getInstance();
	 if (  ( (C.get(Calendar.DAY_OF_WEEK_IN_MONTH)==4) && (C.get(Calendar.DAY_OF_WEEK)==2) )){
	//	System.out.println("found something");
	
	//x	testStr = S.format(C.getTime());
	//x	System.out.println(testStr);
		
		int monthA = C.get(Calendar.MONTH); 
		C.add(C.DAY_OF_YEAR, +7);	
		int monthB = C.get(Calendar.MONTH); 
		if (monthA == monthB) {
		//	System.out.println("same");
		//	System.out.println("<same> "+S.format(C.getTime()));  // "same"
						System.out.println(S.format(C.getTime()));  // "same"
		}
		else { // print derived from monthA
					C.add(C.DAY_OF_YEAR, -7);	
				//	System.out.println("<Not same> "+S.format(C.getTime()));	// "Not same"		
					System.out.println(S.format(C.getTime()));
		}
		/*
		get the month of current date -> Ma
		* add 7 days to date
		* get the month of the new date -> Mb
		* check if they are same
		
		*/

	 // need to get the month and save for a test
    }
}

/**
 * weekCheck()
 * @author  (Mike Hewitt)
 * @version (1.1)
 * @param C supply instance(?) of Calendar
 * @param S supply previously organised display format
 */
public static void balanceCheck(Calendar C, SimpleDateFormat S){
		String testStr; 
//		    Calendar now = Calendar.getInstance();

	//	System.out.println("found something");
		System.out.print(" "+ S.format(C.getTime()));
}
}