/*
 * ListTest1.java
 * 
 * Copyright 2020 Michael <mikeh@mikeh-K52N>
06.10.2020 23:52:04
 * 
 * 
 */
import java.util.Collections;
import java.util.ArrayList;

public class ListTest1 {
	
	public static void main (String[] args) {
		final ArrayList<Double> drealv = new ArrayList<>();
        drealv.add(2.1);
        drealv.add(-3.4);
        drealv.add(3.1);
        Collections.sort(drealv);
        System.out.println(drealv);
	}
}

