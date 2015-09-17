/*
 * stream1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * this is from Oracle website - and I seem to have broken it
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.

 * 
 * 
 */
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
public class Stream {
	
	public static void main (String args[]) {
	Stream<String> words = Stream.of("Java", "Magazine", "is", 
     "the", "best");

	Map<String, Long> letterToCount =
           words.map(w -> w.split(""))
                                   .flatMap(Arrays::stream)
                                   .collect(groupingBy(identity(), counting()));


		
	}
}

