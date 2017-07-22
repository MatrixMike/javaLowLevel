/*
 * ArrayTest2.java
 * 03.09.2015 21:32:10
 * 
 */
import java.util.Collections;
import java.util.ArrayList;

public class ArrayTest2 {
    public static void main(String[] args) {

	ArrayList<String> listm = new ArrayList<>();	// initialise ?! listm
	listm.add("cat");								// add values to listm
	listm.add("bird");
	listm.add("ant");
	listm.add("dog");

	// Sort the elements alphabetically.
	Collections.sort(listm);

	for (String valuexxx : listm) {
	    System.out.println(valuexxx);
	}
    }
}

