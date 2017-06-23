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
import java.util.stream.Stream;
import java.util.function.Predicate;


public class Streams1 {
	
	public static void main (String[] args) {
		Predicate<String> strc = s -> s.startsWith("c");
		Predicate<Integer> multip5 = w -> (w % 5) > 0;
		Predicate<Integer> pred2 = s -> {
        System.out.println("filter: " + s);
        return true;
    };
	List<String> myList =
    Arrays.asList("a1", "a2", "b1", "c2", "c1");

myList
    .stream()
    .filter(strc)
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
//++++
Stream.of("d2", "a2", "b1", "b3", "c")
    .filter(s -> {
        System.out.println("filter: " + s);
        return true;
    })
    .forEach(s -> System.out.println("forEach: " + s));
//++++	
	Stream.of("d2", "a2", "b1", "b3", "c")
    .filter(s -> {
        System.out.println("filter: " + s);
        return s.startsWith("a");
    })
    .map(s -> {
        System.out.println("map: " + s);
        return s.toUpperCase();
    })
    .forEach(s -> System.out.println("forEach: " + s));
	
	}
}

