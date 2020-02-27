/*
 * Raoul1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 

 * 
 */
import java.util.stream.Stream;

public class Raoul1StreamSimple {

    public static void main(String[] args) {
		Stream<Integer> IC4017Q   = Stream.of(3,2,4,7,10,1,5,6,9,11); 
        Stream<Integer> numbers   = Stream.of(2, 4, 7, 9);
        // Stream<Character> xcvx = 
		Stream<String> LTP537G   = Stream.of("B","A","M","k","h","g","t","f","e","dp","S","R","D","U","P","c","N"); 
/*        numbers.map(n -> n * 2)
               .forEach(System.out::println);
*/        
/*IC4017Q.map(n -> n + 0)
               .forEach(System.out::println);
 */
               
          System.out.println();
          LTP537G.map(n -> n + 0)    
                .forEach((s) -> System.out.printf(" %s ",s)); 
                
  //              forEach((s) -> System.out.printf("%s ", s))
//		          LTP537G.map(n = 3)    
//                .forEach((s) -> System.out.printf(" %s ",s)); 
 //             LTP537G.get(3); 
           System.out.println(); 
 	IC4017Q.limit(5).forEach(System.out::println); 	
    }
}


