/*
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 11 November 2015
 * Aim here is to show a list of dates for Newstart payments merged with a list of Rent dates
 * preferrably do this with streams and maybe lambdas
 * Rent is per calendar month on 28th day and Newstart payment (a.o.t. reporting) is per fortnight
 * Newstart = $ 718.20
 * Rent     = $1173.00
 * Rent changes to $1217.00 on 28 November 2017 
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
import java.text.Format;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class Centrelink {
    private static int daysAhead = 365;	
    /**
     * main()
     * @author  (Mike Hewitt)
     * @version (1.1)
     */
    public static boolean newstart, rent, lumo = false; 


    public static void main (String args[]) {
        Double balance = 0.0;
        Double newstartFunds = 718.20;
        Double rentMonthly = 1173.00;
        Double lumoInstalment = 75.00;
        
        boolean printBalance = true;

        int i = 120;

        Locale[] localesN = DecimalFormat.getAvailableLocales(); // appears same as NumberFormat
        // double myNumber = -1234.56789;
        NumberFormat form;
        NumberFormat nf = NumberFormat.getInstance();

        form = NumberFormat.getCurrencyInstance(localesN[i]);

        Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
        Calendar today = Calendar.getInstance(); 
                
        SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");

        cldr.set(Calendar.YEAR, 2017); // set the year
        cldr.set(Calendar.MONTH, 1); // set the month
        cldr.set(Calendar.DAY_OF_MONTH, 17); // set the

        //	Calendar cldr = Calendar.set(2017, 1);
        for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {
/*
 *   if  ((cldr.get(Calendar.YEAR)  == today.get(Calendar.YEAR)) && 
 */
 			
			if (cldr.get(Calendar.DAY_OF_YEAR) <= (7 + today.get(Calendar.DAY_OF_YEAR)))
			{System.out.printf(">"); // %n for newline
			}
			
            newstart = false;
            rent     = false;
            lumo     = false;
            {  // add here a check that month is Jan thru Nov -> so don't do weekCheck for December 
                //			weekCheck(cldr, dateformatter);
                //System.out.println(NewstartCredit(cldr, dateformatter));
                //			balanceCheck(cldr, dateformatter);
                if (NewstartCredit(cldr, dateformatter)) {
                    newstart = true;
                    balance += newstartFunds;
                    //				System.out.format(" balance R= $%8.2f" , balance);
                    //				System.out.print("N=");
                    printBalance = true;
                }
                if (Rent.RentDebit(cldr, dateformatter)) {
                    rent = true;
                    balance -= rentMonthly;
                    //				System.out.format(" balance R= %8.2f%n" , balance);
                    //				System.out.printf(" balance R= $%8.2f" , balance);
                    //				System.out.print("R=");
                    printBalance = true;
                }
                if (Lumo.LumoInstalment(cldr, dateformatter)) {
                    lumo = true;
                    balance -= lumoInstalment;		//fudge for now but use a getter later
                    //				System.out.format(" balance R= %8.2f%n" , balance);
                    //				System.out.printf(" balance R= $%8.2f" , balance);
                    //				System.out.print("R=");
                    printBalance = true;
                }
                
                if (printBalance) {
                    balanceCheck(cldr, dateformatter);
                    /* swapping to new system
                    if (rent     == true) System.out.print("R");
                    if (newstart == true) System.out.print("N");
                     */
                    printNR();
                    //				System.out.format(" balance N= %8.2f%n" , balance);
                    printBalance = false;
                    System.out.printf(" balance T= $%8.2f%n" , balance);
// https://stackoverflow.com/questions/13791409/java-format-double-value-as-dollar-amount
                    //				System.out.print(" -> " + form.format(balance));
                }
            }
            cldr.add(Calendar.DAY_OF_YEAR, +1);  //  examine why cldr and Calendar 
        }
    }

    public static void balanceCheck(Calendar C, SimpleDateFormat S){
        String testStr; 
        //		Calendar now = Calendar.getInstance();

        //	System.out.println("found something");
        System.out.print(" "+ S.format(C.getTime())+" ");
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

    public static void printNR (){
        if (rent     == true) System.out.print("R"); else System.out.print(" ");
        if (newstart == true) System.out.print("N"); else System.out.print(" ");
        if (lumo     == true) System.out.print("L"); else System.out.print(" "); // intermediate code 
												// to provide framework to add lumo as an afterthought
    }
/*
    public static boolean RentDebit(Calendar C, SimpleDateFormat S){
        return    C.get(Calendar.DAY_OF_MONTH)  ==   28 ;
    }
*/

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
}

