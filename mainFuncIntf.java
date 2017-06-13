/*
 * mainFuncIntf.java
 * 
 * Copyright 2017 Mike Hewitt <mikeh@mikeh-Inspiron-1501>
 * 
 */


public class mainFuncIntf {
  public static void main(String[] argv) {
    //  w w  w. j  a  v a 2s .  c  o  m
    NonFunction nonFunction = (NonFunction & Calculator) (x,y)-> x + y;
  }  
}

@FunctionalInterface
interface Calculator{
  long calculate(long x, long y);
}

interface  NonFunction{
}

