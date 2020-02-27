/*
 * Maps1.java
 * 
 * 2017 mikeh <mikeh@mikeh-desktop>
 * 
 */

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
public class Maps1 {
	
	public static void main (String[] args) {
		Map<Integer, String> mapT = new HashMap<>();
        Map<Integer, String> LTP  = new HashMap<>();
        		Stream<Integer> IC4017Q   = Stream.of(3,2,4,7,10,1,5,6,9,11); 
	for (int i = 10; i > 0; i--) {
		mapT.putIfAbsent(i, "val" + i);
	}
	for (int i = 5; i < 15; i++) {
		mapT.putIfAbsent(i, "val" + i);
	}
//	for (int i = 10; i > 0; i--) {
//		LPT.putIfAbsent(i, "val" + i);
//	}
LTP.putIfAbsent(1, "B");
LTP.putIfAbsent(2, "A");
LTP.putIfAbsent(3, "M");
LTP.putIfAbsent(4, "K");
LTP.putIfAbsent(5, "H");
LTP.putIfAbsent(6, "G");
LTP.putIfAbsent(7, "T");
LTP.putIfAbsent(8, "F");
LTP.putIfAbsent(9, "E");
LTP.putIfAbsent(10, "DP");
LTP.putIfAbsent(11, "S");
LTP.putIfAbsent(12, "R");
LTP.putIfAbsent(13, "D");
LTP.putIfAbsent(14, "U");
LTP.putIfAbsent(15, "P");
LTP.putIfAbsent(16, "C");
LTP.putIfAbsent(17, "N");

	mapT.remove(3, "val3");
	mapT.remove(4, "val3");
	mapT.getOrDefault(42, "not found");  // not found
	mapT.computeIfPresent(3, (num, val) -> val + num);
	mapT.get(3);             // val33
	mapT.computeIfAbsent(23, num -> "val" + num);
	mapT.containsKey(23);    // true
	mapT.computeIfAbsent(3, num -> "bam");
	mapT.get(3); 
	mapT.merge(9, "VAL9", (value, newValue) -> value.concat(newValue));
	mapT.merge(9, "VAL9", (value, newValue) -> value.concat(newValue));
	mapT.get(9); 
	mapT.forEach((id1, val) -> System.out.println(val));
	
	LTP.forEach((id1, val) -> System.out.println(val));
	
    System.out.println(); 	
	 	IC4017Q.limit(5).forEach(System.out::println); 
	}
}

