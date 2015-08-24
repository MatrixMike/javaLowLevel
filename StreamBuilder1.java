/*
 * StreamBuilder1.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 24.08.2015 15:57:26
 * 
 */
 
// import static java.util.stream.Collectors.*;
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 
import java.util.List;
import java.util.Arrays;
// import java.

public class StreamBuilder1 {
     public static void main(String[] args){
		 /*
		 List<String> memberNames = new ArrayList<>();
		 
memberNames.add("Amitabh");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("Rahul");
memberNames.add("Shahrukh");
memberNames.add("Salman");
memberNames.add("Yana");
memberNames.add("Lokesh");
	*/	 
	//         List<Integer> list = new ArrayList<Integer>();
    /*     for(int i = 1; i< 10; i++){
             lista.add(i);
         }
         Stream<Integer> stream = lista.stream();
         stream.forEach(p -> System.out.println(p));
	*/
         Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,14,13,12,11);
     //
     
         stream.forEach(p -> System.out.println(" "+ p + " " + p*p));
         // want for filter out the odd numbers 
      //   stream.forEach(p -> System.out.println(p));
     }
}
/*
Count is a terminal operation returning the number of elements in the stream as a long.
long totalMatched = memberNames.stream()
                    .filter((s) -> s.startsWith("A"))
                    .count();
 
System.out.println(totalMatched);
 
Output: 2
*/
