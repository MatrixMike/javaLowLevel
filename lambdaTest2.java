/*
 * lambdaTest1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 16.08.2016
 */

 //package lambda1;

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

spaceLine();
ex1();
spaceLine();

    String merged = list.stream()
        .skip(1)
        .limit(3)
        .collect(Collectors.joining("-"));
    System.out.println(merged);

spaceLine();

List<String> listn = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
ex2(listn);
spaceLine();
	}
	
/**
 * 
 * 
 */
	 public static void ex1() {
		 	   List<String> list = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
        
	     List<String> newList1 = list.stream()
        .filter(w -> w.length() % 2 == 1)
        .map(String::toLowerCase)
        .collect(Collectors.toList());

    newList1.forEach(System.out::println);
}
public static void spaceLine() {
	System.out.println("+++++++++++++++    spacer line");
}

/**
 * 
 * @param list of strings
 */
	 public static void ex2(List<String> list) {
		 	   List<String> lista = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
        
	     List<String> newList1 = lista.stream()
        .filter(w -> w.length() % 3 == 1)
        .map(String::toUpperCase)
        .collect(Collectors.toList());

    newList1.forEach(System.out::println);
}


}

