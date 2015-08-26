/*
 * streamfv.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 
 * http://www.leveluplunch.com/java/examples/how-to-build-java-util-stream/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 26.08.2015 20:30:52

public class streamfv {
//	@Test
public static void stream_from_values() {

    Stream<String> stream = Stream.of("java 8 ", "leveluplunch.com","    some messy string    ",
            "examples", "exercises");

    String joined = stream.map(String::trim).collect(
            Collectors.joining(","));

 //   assertEquals("java 8,leveluplunch.com,examples,exercises", joined);
}
	public static void main (String args[]) {
		    int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };

    int sum = Arrays.stream(numbers).sum();
    
    Stream<String> stream = Stream.of("java 8 ", "leveluplunch.com","    some messy string    ",
            "examples", "exercises");

    String joined = stream.map(String::trim)
			.collect(
            Collectors.joining(","));
            
		stream_from_values();
		System.out.println("Mike");
		System.out.println(joined);
		System.out.println(numbers);
		System.out.println(sum);		
	}
}

