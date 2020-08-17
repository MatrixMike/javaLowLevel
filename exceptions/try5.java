/*
 * try5.java
 * 
 * Copyright 2020 Mike <mike@tecra>
 * 
 */
public class try5 {
	
	public static void main (String[] args) {
	try
{
    System.out.println("try block");
     
    throw new NullPointerException("NullPointerException occured");
} 
catch (NullPointerException e) 
{
    System.out.println("catch block 1");
     
    throw new NumberFormatException("NumberFormatException occurred");
}
catch (Exception e) 
{
    System.out.println("catch block 2");
} 
finally
{
    System.out.println("finally block");
}	
	}
}

