/*
 * stream1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class stream1 {
	
	public static void main (String args[]) {
	Stream<String> words = Stream.of("Java", "Magazine", "is", "the", "best");

	Map<String, Long> letterToCount =
           words.map(w -> w.split(""))
                                   .flatMap(Arrays::stream)
                                   .collect(groupingBy(identity(), counting()));


		
	}
}

