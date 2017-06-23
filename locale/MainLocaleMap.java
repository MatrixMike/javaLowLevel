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
import java.util.*;

public class MainLocaleMap {

  public static void main(String[] args) {

    Calendar now = Calendar.getInstance();
// create an object of locale class 
    Locale[] array = Locale.getAvailableLocales();
    
    Locale locale = Locale.getDefault();

	//String here = Locale.getDisplayCountry();
	for (int i = 1; i < 159; i ++) {    // changed to max before exception, until I fix for max / size of array
		locale = array[i];
    // call the getDisplayNames method
         Map<String, Integer> representations = now.getDisplayNames(
               Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
    
         NavigableMap<String, Integer> navMap = new TreeMap<String, Integer>(   // TreeMap
             representations);

    // print the results

    System.out.printf("%n%s%n", navMap, i);  // sorted alphabetically
    System.out.print("<"+i+ "> ");
    /* Whole list:
{Friday=6, Monday=2, Saturday=7, Sunday=1, Thursday=5, Tuesday=3, Wednesday=4}
 */
}

  }
}

