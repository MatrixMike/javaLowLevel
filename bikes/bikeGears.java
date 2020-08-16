/*
 * bikeGears.java
 * 28.02.2017
 * 12.04.2018

 * aim was to create a program that has a main calling a class.method that returns a List
 * 09.05.2017  execute with java from one directory level outside (above) 
 * javac bikes/bikeGears.java
 * java bikes.bikeGears 
 */
// package bikes;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class b1gears   {
  static List getFront() {
	 StringBuilder sb1 = new StringBuilder();
	 List<Integer> list = Arrays.asList(24, 28, 21, 18, 16, 14, 13);
     list.forEach(s -> sb1.append(s +"q")); 
     return list;
	}
	  static List getRear() {
	 StringBuilder sb1 = new StringBuilder();
	 List<Integer> list = Arrays.asList(38, 48, 28);
     list.forEach(s -> sb1.append(s +"q")); 
     return list;
	}
}

public class bikeGears {	
	public static void main (String[] args) {
		System.out.println("start");
		System.out.println(b1gears.getFront());
	//	System.out.println(b1gears.getFront().length());
		System.out.println(b1gears.getRear());
		// divide all front by rear, sort and print
		// maybe convert back to array and do nested for loops OR ...
	}
}

