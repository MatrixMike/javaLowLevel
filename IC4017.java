/*
 * IC4017.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;

public class IC4017 {
	

			  /**
   * Exercise 5
   *(3,2,4,7,10,1,5,6,9,11); 
   * Create a new thread that prints the numbers from the list.
   */
  private static void exercise6() {
	StringBuilder sb1 = new StringBuilder();
    List<Integer> IC4017    = Arrays.asList(3,2,4,7,10,1,5,6,9,11);
 //   List<String>  LTP537G   = Arrays.asList("B","A","M","k","h","g","t","f","e","dp","S","R","D","U","P","c","N");
      List<String> LTP537G = new ArrayList<>(Arrays.asList("B","A","M","k","h","g","t","f","e","dp","S","R","D","U","P","c","N"));
    // make filter do some work - like only letting through the squares of x that are in range 50 to 70
	//	list.skip(3);
//        list.forEach(s -> sb1.append(s +"q"));
    IC4017.forEach(s -> sb1.append(s +"v"));
	LTP537G.replaceAll(String::toUpperCase);	
	//	list.removeIf(s -> (s > 5) );	// change 99
	// sb1.append(s +"X");
    new Thread(() ->
    //				list.removeIf(s -> (s.length() & 1) == 0);  // odd or even
    	//			.removeIf(s -> (s & 1) == 0)  // odd or even
 //    IC4017.forEach(System.out::println)).start();
    LTP537G.forEach(System.out::println)).start();
    System.out.println("MJH test 1 " +sb1);
  }
	
	public static void main (String[] args) {
		exercise6();
	}	
}

