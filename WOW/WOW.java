/*
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 02.11.2017
 *
 * http://www.java2s.com/Tutorials/Java/java.util/Calendar/Java_Calendar_get_int_field_.htm
 */
/*
DAY_OF_WEEK was 3 = Tuesday ; 5 =Thursday
 */
// package Friday13;   removed to make compile and run 
import java.text.SimpleDateFormat;
import java.util.*;

public class WOW {
    private static int daysAhead = 365;	
    //    Calendar cldr = Calendar.getInstance(); 
    /**
     * main()
     * @author  (Mike Hewitt)
     * @version (1.1)
     */
    public static void main (String args[]) {
        Double LumoInstallments = 75.00;
        Integer Installments = 5;
        Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
        SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");

        //        cldr.set(Calendar.YEAR, 2017);			// set the year (start date for repayment) 11/09/2017
        //        cldr.set(Calendar.MONTH, 10);			// set the month September
        //        cldr.set(Calendar.DAY_OF_MONTH, 1);	// set the date - today - a Friday
        System.out.printf("WOW Food Days%n%n");

        while((cldr.get(Calendar.MONTH) < 12) &&  (cldr.get(Calendar.YEAR) <= 2017) || December162017Check(cldr, dateformatter) ) {
            // Statements: month less than December (when we know the actual final date we can code for that)

            balanceCheck(cldr, dateformatter);
            System.out.printf("    %n");
            cldr.add(Calendar.DAY_OF_YEAR, +14);
        }
        System.out.printf("done while%n");

        for (int n= 1; n<Installments;  n=n+1) {  
            {
                balanceCheck(cldr, dateformatter);
                //               System.out.printf("Installment "+ n + "%n");
                System.out.printf("%n");
                if (LumoFortnight(cldr, dateformatter)) {

                    System.out.println("Installments" + Installments);
                    //				                    balanceCheck(cldr, dateformatter));
                }
            }
            cldr.add(Calendar.DAY_OF_YEAR, +14);  //  examine why cldr and Calendar 
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
        //		Calendar now = Calendar.getInstance();

        //	System.out.println("found something");
        System.out.print(" "+ S.format(C.getTime())+" ");
    }   
     
    /**
     * weekCheck()
     * @author  (Mike Hewitt)
     * @version (1.1)
     * @param C supply instance(?) of Calendar
     * @param S supply previously organised display format
     */
    public static boolean December162017Check(Calendar C, SimpleDateFormat S){
        String testStr; 
        //		Calendar now = Calendar.getInstance();
        return ((C.get(Calendar.MONTH) == 12) &&  (C.get(Calendar.YEAR) == 2017) &&  (C.get(Calendar.DAY_OF_MONTH) <= 16)) ;

        //	System.out.println("found something");
     //   System.out.print(" "+ S.format(C.getTime())+" ");
    } 
    /**
     * consider a function to return bool if Rent date and another one to return bool if Newstart payment
     * 
     */
    public static boolean LumoFortnight(Calendar C, SimpleDateFormat S){	 
        return (((
                    (C.get(Calendar.DAY_OF_YEAR)) - 50) % 14) == 0 )
        ;
        //&& (C.get(Calendar.DAY_OF_WEEK)==2) ))	 
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

        }
    }
}
