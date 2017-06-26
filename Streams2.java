/*
 * Streams2.java
 * 
 *  2017 mikeh <mikeh@mikeh-desktop>
 * 
 * 
 */
import java.util.stream.Stream;

public class Streams2 {
	
	public static void main (String[] args) {
	Stream<Integer> numbers = Stream.iterate(0, n -> n + 10);
	
	numbers.limit(5).forEach(System.out::println); 	
	}
}

