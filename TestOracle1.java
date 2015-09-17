/*
 * TestOracle1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
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

public class TestOracle1 {
	
	public static void main (String args[]) {
		int sumExpensive = 
       transactions.stream()
       .filter(t -> t.getValue() > 1000)
       .map(Transaction::getValue)
       .reduce(0, Integer::sum);
	}
}

