/*
 * try2.java
 * 
 * Copyright 2020 Mike <mike@tecra>
 * 
 * 
 * 
 */


public class try2 {
	
	public static void main (String[] args) {
	try
{
    System.out.println("try block");
    throw new NullPointerException("Null occurred");
} 
catch (Exception e) 
{
    System.out.println("catch block");
} 
finally
{
    System.out.println("finally block");
}	
	}
}

