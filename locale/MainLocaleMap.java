/*
 * MainLocaleMap.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 
 */
//package localeDemo;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
//import java.util.*;
import java.util.function.Predicate;

public class MainLocaleMap {

  public static void main(String[] args) {

		// filter out 10,12,43
			Predicate <Integer> badPrint = bp -> !((bp == 10) | (bp == 12) | (bp == 43)) ;
    Calendar now = Calendar.getInstance();
// create an object of locale class 
    Locale[] array = Locale.getAvailableLocales();
    
    Locale locale = Locale.getDefault();

	//String here = Locale.getDisplayCountry();
	for (int i = 1; i < 160; i ++) {    // changed to max before exception, until I fix for max / size of array
		locale = array[i];
    // call the getDisplayNames method
         Map<String, Integer> representations1 = now.getDisplayNames(
               Calendar.DAY_OF_WEEK, Calendar.LONG, locale);

         Map<String, Integer> representations2 = now.getDisplayNames(
               Calendar.MONTH, Calendar.LONG, locale);
    
         NavigableMap<String, Integer> navMap1 = new TreeMap<String, Integer>(   // TreeMap
             representations1);
         NavigableMap<String, Integer> navMap2 = new TreeMap<String, Integer>(   // TreeMap
             representations2);
         // print the results
         System.out.print("<"+i+ "> ");
         System.out.printf("%n%s %n%n%s %n", navMap1, navMap2);  // sorted alphabetically
//         System.out.printf("%n%s %n", navMap2);  // sorted alphabetically
  //  System.out.printf("%n%s %n", navMap);  // sorted alphabetically

    /* Whole list:
{Friday=6, Monday=2, Saturday=7, Sunday=1, Thursday=5, Tuesday=3, Wednesday=4}
 */
}

  }
}

