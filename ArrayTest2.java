/*
 * ArrayTest2.java
 * 03.09.2015 21:32:10
 * 
 */


import java.util.Collections;
import java.util.ArrayList;

public class ArrayTest2 {
    public static void main(String[] args) {

	ArrayList<String> list = new ArrayList<>();
	list.add("cat");
	list.add("bird");
	list.add("ant");
	list.add("dog");

	// Sort the elements alphabetically.
	Collections.sort(list);

	for (String value : list) {
	    System.out.println(value);
	}
    }
}

