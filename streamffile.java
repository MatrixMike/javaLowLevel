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
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 


import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Date;






// 26.08.2015 20:30:52

public class streamffile {
//	@Test
public static void stream_from_values() {

    Stream<String> stream = Stream.of("java 8 ", "leveluplunch.com","    some messy string    ",
            "examples", "exercises");

    String joined = stream.map(String::trim).collect(
            Collectors.joining(","));

 //   assertEquals("java 8,leveluplunch.com,examples,exercises", joined);
}

public void stream_from_file() throws IOException {

 //   long uniqueWords = java.nio.file.Files
       //     .lines(Paths.get("word-occurrences-in-file.txt")    //,
         //           Charset.defaultCharset())
     //       .flatMap(line -> Arrays.stream(line.split(" ."))).distinct()
        //    .count());

  //  assertEquals(80, uniqueWords);
}

	public static void main (String args[]) {
		    int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };

    int sum = Arrays.stream(numbers)
   // .unique()
    .filter ( p -> (p >3 ))
    .sum();
    
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

