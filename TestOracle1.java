/*
 * TestOracle1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
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
import static java.util.function.Function.identity;

// check if this is from Raoul - mentioned something about creating transactions class
// 22.09.2015 22:50:47

public class TestOracle1 {
	
	public static void main (String args[]) {
		int sumExpensive = 
       transactions.stream()
       .filter(t -> t.getValue() > 1000)
       .map(Transaction::getValue)
       .reduce(0, Integer::sum);
	}
}

