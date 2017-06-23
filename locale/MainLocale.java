/*
 * MainLocale.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 
 * 
 */


import java.util.Locale;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class MainLocale {
/**
 * demo some APIs for Locale
 * @param args Strings from command line 
 */
   public static void main(String args[]) {
	   Predicate <Integer> badPrint = bp -> !((bp == 10) | (bp == 12) | (bp == 43)) ; // add 1,2,3
   //     Stream.iterate(1, n -> n + 1)
      // create an object of locale class 
      Locale[] array = Locale.getAvailableLocales();
//		System.out.println("size = " + array.size());   // how to access size
      // print the results
      //System.out.println( Locale[].size());
      for (int i = 55; i < 159; i++) {
		  System.out.print("<" + i + ">");
         System.out.print(array[i].getISO3Country());
         System.out.print(" ");
         System.out.println(array[i].getDisplayLanguage());
         //                .forEach(System.out::println); 
      }
   }
}

