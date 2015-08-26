/*
 * lambdaTest1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 
 * 24.08.2015 15:28:34
 * 
 */

// package lambda1;

//import java.utils.Arrays;
//import java.utils.Arrays;
//import java.utils.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambdaTest2 {
/*
		  private static void exercise4() throws IOException {
    try (BufferedReader reader = 
        Files.newBufferedReader(Paths.get("SonnetI.txt"))) {
      long lineCount = reader.lines().count();
      System.out.println("Number of lines = " + lineCount);
    }
  }


*/
	

	public static void main (String args[]) {
	   List<String> list = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");


    List<String> newList = list.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

    newList.forEach(System.out::println);
// ========================

/*
    List<String> list1 = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");


*/

System.out.println("++++++++++++one    spacer line");


    List<String> newList1 = list.stream()
        .filter(w -> w.length() % 2 == 1)
        .skip(1)
        .limit(10)
        .distinct()							// unique words
        .sorted()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

    newList1.forEach(System.out::println);
System.out.println("++++++++++++two    spacer line");

    String merged = list.stream()
        .skip(1)
        .limit(3)
          .map(String::toLowerCase)       // try without this line
          // try for unique words
          // try also for CamelCase   i.e. first letter of each word capitalised
        .collect(Collectors.joining("- -"));
    System.out.println(merged);


System.out.println("++++++++++three    spacer line");
// exercise4();

	}
}

