/*
 * printTest1.java
 * 
 * Copyright 2020 Mike <mike@tecra>
 * 18.08.2020 16:22:21
 */

public class printTest1 {
	
	public static void main (String[] args) {
		double clickedItem = 6.9;
		clickedItem = 2.0/3;
		System.out.println(String.format(" %.3f ",
                                clickedItem));
	}
}

