/*
 * bikeGears.java
 * 28.02.2017

 * aim was to create a program that has a main calling a class.method that returns a List
 * 
 */
package bikes;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class b1gears   {
  static List getFront() {
	 StringBuilder sb1 = new StringBuilder();
	 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     list.forEach(s -> sb1.append(s +"q")); 
     return list;
	}
	  static List getRear() {
	 StringBuilder sb1 = new StringBuilder();
	 List<Integer> list = Arrays.asList(17, 20 , 23);
     list.forEach(s -> sb1.append(s +"q")); 
     return list;
	}
}

public class bikeGears {	
	public static void main (String[] args) {
		System.out.println(b1gears.getFront());
	//	System.out.println(b1gears.getFront().length());
		System.out.println(b1gears.getRear());
		// divide all front by rear, sort and print
		// maybe convert back to array and do nested for loops OR ...
	}
}

