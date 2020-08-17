/*
 * try4.java
 * 
 * Copyright 2020 Mike <mike@tecra> 
 * 
 */
// https://howtodoinjava.com/java/exception-handling/try-catch-finally/

public class try4 {
	
	public static void main (String[] args) {
	try
{
    System.out.println("try block");
     
    throw new NullPointerException("null occurred");
} 
catch (NumberFormatException e) 
{
    System.out.println("catch block 1");
}
catch (NullPointerException e) 
{
    System.out.println("catch block 2");
}
catch (Exception e) 
{
    System.out.println("catch block 3");
} 
finally
{
    System.out.println("finally block");
}	
	}
}

