/*
 * lambdaTest3.java
 * 
 
 * 

 * 
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors.*;

public class lambdaTest3 {
	
	public static void main (String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		strList.stream().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));
	}
}

