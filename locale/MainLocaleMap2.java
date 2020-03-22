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
	System.out.println("length= "+ localesN.length);
	String viet = "Vietnamese";
	System.out.println(viet);
	for (int i = 0; i < localesN.length; i ++) {  
		// omit 58,62,67,83,400,441,475,493,511,595,611,614,619,691,747,746
		locale = arrayN[i];

    // call the getDisplayNames method
    if (i !=57 & i != 67 & i!= 83 & i!=62 & i != 400 & i!=437 & i!=441 & 
    i!=475 & i!=493 & i!=511 & i!=595 & i!=611 & i!=614 & i!=619 )
    {
		// (i != 53)
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
 //        System.out.print("{"+arrayN[i].getISO3Country()+ "} ");
         System.out.print("<"+arrayN[i].getISO3Language()+ "> ");
			System.out.println("*"+localesN[i].getDisplayName().toString()+"*");         
         if (localesN[i].getDisplayName().toString().equals(viet)  ) //arrayN[i].getDisplayLanguage())
			System.out.println("Tsame");  // investigate the comparison facilities - // extra as same found in samedi

          System.out.println( ">>> "+ localesN[i].getDisplayName().toString()  );
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
