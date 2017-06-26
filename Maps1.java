/*
 * Maps1.java
 * 
 * 2017 mikeh <mikeh@mikeh-desktop>
 * 
 */

import java.util.Map;
import java.util.HashMap;
public class Maps1 {
	
	public static void main (String[] args) {
		Map<Integer, String> map = new HashMap<>();

	for (int i = 10; i > 0; i--) {
		map.putIfAbsent(i, "val" + i);
	}
	for (int i = 5; i < 15; i++) {
		map.putIfAbsent(i, "val" + i);
	}
	map.remove(3, "val3");
	map.remove(4, "val3");
	map.getOrDefault(42, "not found");  // not found
	map.computeIfPresent(3, (num, val) -> val + num);
	map.get(3);             // val33
	map.computeIfAbsent(23, num -> "val" + num);
	map.containsKey(23);    // true
	map.computeIfAbsent(3, num -> "bam");
	map.get(3); 
	map.merge(9, "VAL9", (value, newValue) -> value.concat(newValue));
	map.get(9); 
	map.forEach((id, val) -> System.out.println(val));
	}
}

