/*
 * ArrayStuff.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 28.08.2015 15:08:49
 * 
 * http://stackoverflow.com/questions/9297899/where-is-arrays-length-property-defined
 * http://stackoverflow.com/questions/10477628/arraylist-of-int-array-in-java
 * http://stackoverflow.com/questions/1018750/how-to-convert-object-array-to-string-array-in-java
 */

import java.util.ArrayList;
public class ArrayStuff {
	
	public static void main (String args[]) {
		int x = args.length;
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
// For adding elements, just use the add function:
arl.add(1);  
arl.add(22);
arl.add(-2);
		
		String[] str = new String[10];
		int size1 =  str.length;
		
		ArrayList<Integer> arr = new ArrayList<Integer>(10);
		int size = arr.size(); 
		System.out.println("Array info = " + arr.size() +" " + str.length+" " + args.length);
		System.out.println("Arraylist contains: " + arl.toString()); 
		 
		int i = 0; // Index 0 is of the first element
System.out.println("The first element is: " + arl.get(i));
//	for(Object o : array){
//		
//		}
	}
}
/*
javac "ArrayStuff.java" (in directory: /home/mike/javaLowLevel)
Note: ArrayStuff.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Compilation finished successfully.


*/

