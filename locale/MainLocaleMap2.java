/*
 * MainLocaleMap.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 
 */
//package localeDemo;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
//import java.util.*;
import java.util.function.Predicate;

public class MainLocaleMap2 {

  public static void main(String[] args) {

		// filter out 10,12,43
			Predicate <Integer> badPrint = bp -> !((bp == 10) | (bp == 12) | (bp == 43)) ;
    Calendar now = Calendar.getInstance();
// create an object of locale class 
    Locale[] arrayN    =       Locale.getAvailableLocales();
    Locale[] localesN = NumberFormat.getAvailableLocales();
    
    Locale locale = Locale.getDefault();
         locale = Locale.FRANCE;

	//String here = Locale.getDisplayCountry();
	for (int i = 0; i < localesN.length; i ++) {  
		locale = arrayN[i];
    // call the getDisplayNames method
    if (i != 53){// (i != 53)
// https://stackoverflow.com/questions/13612710/java-util-missingresourceexception-couldnt-find-3-letter-country-code-for-cs
         Map<String, Integer> representations1 = now.getDisplayNames(
               Calendar.DAY_OF_WEEK, Calendar.LONG, locale);

         Map<String, Integer> representations2 = now.getDisplayNames(
               Calendar.MONTH, Calendar.LONG, locale);
    
         NavigableMap<String, Integer> navMap1 = new TreeMap<String, Integer>(   // TreeMap
             representations1);
         NavigableMap<String, Integer> navMap2 = new TreeMap<String, Integer>(   // TreeMap
             representations2);
         // print the results
         //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
         System.out.printf("<%3d> ",i);  // change to field of 3 for neater grep sorting
         System.out.print(localesN[i].getDisplayName());
         System.out.print("{"+arrayN[i].getISO3Country()+ "} ");
         System.out.print("<"+arrayN[i].getISO3Language()+ "> ");
         
         if (localesN[i].getDisplayName()  == "Vietnamese"  ) //arrayN[i].getDisplayLanguage())
             System.out.println("same");  // investigate the comparison facilities 
             
   //mx      System.out.print(arrayN[i].getDisplayLanguage());
//         System.out.print("{"+arrayN[i].getISO3Country()+ "} ");
         System.out.print("/"+localesN[i].getDisplayLanguage()+"/");
         System.out.printf(" %s %s %n", navMap1, navMap2);  // sorted alphabetically
//         System.out.printf("%n%s %n", navMap2);  // sorted alphabetically
  //  System.out.printf("%n%s %n", navMap);  // sorted alphabetically
		System.out.println();
    /* Whole list:
{Friday=6, Monday=2, Saturday=7, Sunday=1, Thursday=5, Tuesday=3, Wednesday=4}
 */}
}

  }
}
//08.03.2020 10:42:44  add checks : if country == language or country not equal to language  : 
