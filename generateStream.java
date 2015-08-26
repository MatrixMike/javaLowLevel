/*
 * generateStream.java
 * 24.08.2015 22:40:01
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 

//	private static class 4parms(int a, int b,int c,int d) {		
//	}

public class generateStream {
	

	
	
	
	public static void stream_from_function() {
		Stream.iterate(0, n -> n + 3)
		.limit(35)
		.skip(2)
		.filter(w -> (w % 5) == 0)
		.forEach(System.out::println);
	}
	public static void main (String args[]) {
		stream_from_function();
	}
}

