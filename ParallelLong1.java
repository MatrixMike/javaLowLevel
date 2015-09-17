/*
 * ParallelLong1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 
 * 29.08.2015 11:33:13
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
import static java.util.stream.Collectors.*;
import static java.util.function.Function.identity;
import java.util.stream.LongStream;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class ParallelLong1 {
	
	public static long rangedSum(long n) {
		return LongStream.rangeClosed(1,n).parallel()
			.reduce(Long::sum).getAsLong();
}	
	public static void main (String args[]) {
		System.out.println(" rangedSum " + rangedSum(6000));

	}
}

