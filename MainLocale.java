/*
 * MainLocale.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 
 * 
 */


import java.util.Locale;

public class MainLocale {
/**
 * demo some APIs for Locale
 * @param args Strings from command line 
 */
   public static void main(String args[]) {

      // create an object of locale class 
      Locale[] array = Locale.getAvailableLocales();

      // print the results
      //System.out.println( Locale[].size());
      for (int i = 0; i < 30; i++) {
         System.out.println(array[i].getISO3Country());
         System.out.println(array[i].getDisplayLanguage());
      }
   }
}

