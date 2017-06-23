/*
 * Streams1.java
 * 
 * Copyright 2017 mikeh <mikeh@mikeh-desktop>
 * 
 * 
 */
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class Streams1 {
	
	public static void main (String[] args) {
	List<String> myList =
    Arrays.asList("a1", "a2", "b1", "c2", "c1");

myList
    .stream()
    .filter(s -> s.startsWith("c"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);


	
	}
}

