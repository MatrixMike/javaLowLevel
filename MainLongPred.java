/*
 * MainLongPred.java
 * 
 * Copyright 2017 Mike Hewitt <mikeh@mikeh-Inspiron-1501>
 * 
 * This program is free software; you can redistribute it and/or modify

 */


import java.util.function.LongPredicate;
/*  w ww  . j a  v  a 2s. co m*/
public class MainLongPred {

  public static void main(String[] args) {
    LongPredicate i = (l) -> l>0;
    
    System.out.println(i.test(Long.MAX_VALUE));
  }
}
