/*
 * 
 * To print the dates of the installments for the payment plan
 * $75 each fortnight until terminating condition :: accumulated value >= $x
 * 
 */
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
import java.text.SimpleDateFormat;
import java.util.*;


public class Lumo {
	
	public static void main (String[] args) {
	Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
	SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);	
    list.forEach(System.out::println);		
    list.forEach(n -> cldr.add(Calendar.DAY_OF_YEAR, + (n+14)));  //  examine why cldr and Calendar 
//  list.forEach(balanceCheck(cldr, dateformatter));
/*		Stream.iterate(0, n -> n + 1)   // was n+1
		.limit(getSize().width)
		.parallel()
					//	.skip(2)
					//	.filter(w -> (w % 5) == 0)
					//	.forEach(System.out::println);
		.forEach(	x ->    g.drawLine(x, (int)f2(x), x + 1, (int)f2(x + 1)));
*/		
		
		
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
public static void balanceCheck(Calendar C, SimpleDateFormat S){
		String testStr; 
//		    Calendar now = Calendar.getInstance();

	//	System.out.println("found something");
		System.out.print(" "+ S.format(C.getTime()));
	}
}

