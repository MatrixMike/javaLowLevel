/*
 * ArrayTest1.java
 * 
 * 
 * http://www.dotnetperls.com/arraylist-java
 * 
 * I use this example to illustrate that ArrayList and Collections pre-date lambdas and streams
 * 
 */


import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest1 {
    public static void main(String[] args) {

	ArrayList<Integer> values = new ArrayList<>();
	Integer[] array = { 30, 20, 10 };

	// Add all elements in array to ArrayList.
	Collections.addAll(values, array);

	// Display.
	for (int value : values) {
	    System.out.print(value + " ");
	 //   System.out.print(" ");
	}
	System.out.println();

	// Add more elements.
	Collections.addAll(values, 15, 40, 50, -10);
	Collections.sort(values);
	// Display.
	for (int value : values) {
	    System.out.print(value);
	    System.out.print(" ");
	}
    }
}

