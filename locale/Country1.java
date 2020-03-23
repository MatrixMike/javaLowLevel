/*
 * country1.java
 * 
 * Copyright 2020 Mike <mikeh@mikeh-OptiPlex-745>
 * 
 * https://mkyong.com/java/display-a-list-of-countries-in-java/
 * 
 */


//package com.tutorialspoint;

import java.util.*;

public class Country1 {
   public static void main(String[] args) {

      // create a new locale
      Locale locale = new Locale("ENGLISH", "US");

      // print this locale
      System.out.println("Locale1:" + locale);

      // print the country of this locale
      System.out.println("Country:" + locale.getCountry());
   }
}
