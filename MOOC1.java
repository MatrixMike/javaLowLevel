/*
 * MOOC1.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com> 
 */
import java.util.ArrayList;   // where from 
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
// folding fitted sheets
// 16.08.2015 12:45:13

public class MOOC1 {
	  /**
   * Exercise 5
   *
   * Create a new thread that prints the numbers from the list.
   */
  private static void exercise5() {
	StringBuilder sb1 = new StringBuilder();
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,100);
    // make filter do some work - like only letting through the squares of x that are in range 50 to 70 
	//	list.skip(3);
        list.forEach(s -> sb1.append(s +"q")); 
        list.forEach(s -> sb1.append(s +"v")); 
	//	list.removeIf(s -> (s > 5) );	// change 99 
	// sb1.append(s +"X");
    new Thread(() -> 
    //				list.removeIf(s -> (s.length() & 1) == 0);  // odd or even
    	//			.removeIf(s -> (s & 1) == 0)  // odd or even
    list.forEach(System.out::println)).start();
    System.out.println("MJH test 1 " +sb1);
  }
	
	 /**
   * Exercise 4
   *
   * Convert every key-value pair of the map into a string and append them all
   * into a single string, in iteration order.
   */
  private static void exercise4() {  			// added static to enable compilation - find out why
    Map<String, Integer> map = new TreeMap<>();
    map.put("c", 3);
    map.put("b", 2);
    map.put("a", 1);

    StringBuilder sb = new StringBuilder();
    map.forEach((k, v) -> sb.append(String.format("%s%s", k, v)));
    String result = sb.toString();
    System.out.println("Exercise 4 result = " + result);
    System.out.println("Exercise 4 result = " + sb.toString());
  }

	
	
		  private static void exercise3() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot","a","bb","ccc"));
 // want to capitalise the first letter of word
 // also try CamelCase - concatentate words where non-first have capital first letters
        
				StringBuilder sb = new StringBuilder();
				StringBuilder sb1 = new StringBuilder();
//				list.removeIf(s -> (s.length() & 1) == 0);  // odd or even
				list.removeIf(s -> (s.length() > 99) );	// change 99 
                list.forEach(s -> sb.append(s.charAt(0)));  // select a char() from word - can still get error null 
//	list.removeIf(s -> (s.length() & 1) == 1);               
                String result = sb.toString();
				System.out.println("Exercise 1 result = " + result);
				  //      list.removeIf(s -> (s.length() & 1) == 1);
				  sb1.append("one");
				  
			//	  sb1.append(toUpperCase("two"));
				list.replaceAll(String::toUpperCase);		//Z  similar structures - how to read what it means
			//	list.forEach(System.out::println);			//Z print length and count of occurrence 
				list.forEach( v -> System.out.println("value is "+ v));
				// also join all together but with designated separator 
				System.out.println(sb1);
	}	
/*
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 1
	at java.lang.String.charAt(String.java:646)
	at MOOC1.lambda$exercise3$0(MOOC1.java:36)
	at MOOC1$$Lambda$1/424058530.accept(Unknown Source)
	at java.util.ArrayList.forEach(ArrayList.java:1249)
	at MOOC1.exercise3(MOOC1.java:36)
	at MOOC1.main(MOOC1.java:47)
*/
// change first char of word to upper case



	
	public static void main (String args[]) {
		exercise3();
		exercise4();
		exercise5();
	}
}
/*
Exercise 1 result = lrheco
ALPHA
BRAVO
CHARLIE
DELTA
ECHO
FOXTROT





*/

