/*
 * MainLocaleMap.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 
 */
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MainLocaleMap {

  public static void main(String[] args) {

    Calendar now = Calendar.getInstance();
    Locale locale = Locale.getDefault();
	//String here = Locale.getDisplayCountry();
	
    // call the getDisplayNames method
    Map<String, Integer> representations = now.getDisplayNames(
        Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
    
    NavigableMap<String, Integer> navMap = new TreeMap<String, Integer>(
        representations);

    // print the results
    System.out.printf("Whole list:%n%s%n", navMap);
  }
}

