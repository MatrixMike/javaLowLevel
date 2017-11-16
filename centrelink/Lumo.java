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
 */
 

public class Lumo {
    public static boolean LumoInstalment(Calendar C, SimpleDateFormat S){
        return    C.get(Calendar.DAY_OF_MONTH)  ==   27 ;   //   was C.get(Calendar.DAY_OF_MONTH)  ==   28 ;
    }
    }
    
