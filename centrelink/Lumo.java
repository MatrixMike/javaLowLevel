import java.text.SimpleDateFormat;
import java.util.*;
import java.text.Format;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

/*
 * here need to allow for value to be added / subtracted
 * date range for which that should apply
 * algorithm (day of month) for which change needs to take place
 *
 * so method is called : test the date range is in scope and returns a boolean
 * whereupon the caller adds the value already provided by the getter
 * --
 * inject the start date into the system
 * inject the end   date into the system
 */


public class Lumo {
    public static boolean LumoInstalment(Calendar C, SimpleDateFormat S){
        Integer Instalments = 14;           // loop control
        Integer SDOY, FDOY, TDOY;

        SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");
        Calendar cldrT = Calendar.getInstance();
        TDOY = C.get(Calendar.DAY_OF_YEAR);

        Calendar cldrS = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
        cldrS.set(Calendar.YEAR, 2017);         // set the year (start date for repayment) 11/09/2017
        cldrS.set(Calendar.MONTH, 8);           // set the month September
        cldrS.set(Calendar.DAY_OF_MONTH, 11);
        SDOY = cldrS.get(Calendar.DAY_OF_YEAR);

        Calendar cldrF = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
        cldrF.set(Calendar.YEAR, 2018);         // set the year (start date for repayment) 11/09/2017
        cldrF.set(Calendar.MONTH, 1);           // set the month September
        cldrF.set(Calendar.DAY_OF_MONTH, 26);
        FDOY =  + cldrF.get(Calendar.DAY_OF_YEAR);   //   was + 365
 //       System.out.printf("interval =  %3d%n",  FDOY - SDOY );
                     // 14 here is for days in fortnight
                                                       // but what is 50 doing?
        return    (((C.get(Calendar.DAY_OF_YEAR) - TDOY ) % 14) == 0 );
        //C.get(Calendar.DAY_OF_MONTH)  ==   27 ;   //   was C.get(Calendar.DAY_OF_MONTH)  ==   28 ;
    }
   }

