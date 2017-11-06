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
import java.util.stream.LongStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.LongPredicate;

public class Friday13 {
//	Predicate<Integer> multip5 = w -> (w % 5) > 0;	
public static void main (String args[]) {
	Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
	Calendar cldr_now;
	SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");
	String testStr;	
	long next13th = 99;
//	testStr = "fred";
	int daysAhead = 1000;
	int first_time_through = 0 ;			// change to boolean 
	boolean first_time = true;
	int dateDiff;
//	System.out.println(" " +EventsWithStreams(100));		// means what ? check reduce
	System.out.println("Next Friday the thirteenth is on");
	for (long n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // n was int now long
		// find current first of month       
		// F13 -> 13, 6
		// Monday 9 -> 9, 2        
		if ( (cldr.get(Calendar.DAY_OF_MONTH)==13) &&
		(cldr.get(Calendar.DAY_OF_WEEK)==6) ) 
		{
			testStr = dateformatter.format(cldr.getTime());
			System.out.print(testStr);
			if (first_time){
				cldr_now = Calendar.getInstance(); 
				dateDiff = -(cldr.get(Calendar.DAY_OF_YEAR) - cldr_now.get(Calendar.DAY_OF_YEAR));
				System.out.print(" which is in "+ dateDiff + " days. ");
	        	first_time = false ; 
	        	// save n and calculate difference between n and today -> i.e. n 
	        	// display as a 
	        	next13th = n;
	        	System.out.println(" next 13 is " + next13th + " DOM "+ cldr.get(Calendar.DAY_OF_MONTH));
				}
			System.out.println();
		}
	    cldr.add(Calendar.DAY_OF_YEAR, +1);
	 }
//	 System.out.println("Number of dates found is "+first_time_through);  // wrong - bug
//	System.out.println(factorialStreamsMJH(16));
//	System.out.println(EventsWithStreams(300));
}

    public static long factorialStreamsMJH(long n){
	//	StringBuilder sb = new StringBuilder;
        return LongStream.rangeClosed(1, n)   //  was (1,31)
     
	//	.filter( w -> (w % 2) ==1  )  // filter out those numbers from the modulus 
		.filter( w -> (w % 3) ==0  )  // pass through  Fizz 3
		.filter( w -> (w % 5) > 0 )  // pass through  Buzz 5  thus together finds FizzBuzz
//		.collect(Collector.toList());
        //.skip(3)
        .reduce(0, (long a, long b) -> a + b);
      //  System.out.print( "number " + n);
    }

/*    public static long EventsWithStreams(long n){
		LongPredicate<long> multip5 = w -> (w % 5) > 0;
	//	StringBuilder sb = new StringBuilder;
        return LongStream.rangeClosed(1, n)   //  was (1,31)
     
	//	.filter( w -> (w % 2) ==1  )  // filter out those numbers from the modulus 
		.filter( w -> (w % 3) ==0  )  // pass through  Fizz 3
		.filter( multip5  )  // pass through  Buzz 5  thus together finds FizzBuzz
//		.collect(Collector.toList());
        //.skip(3)
        .reduce(0, (long a, long b) -> a + b);
      //  System.out.print( "number " + n);
    }
*/
}
