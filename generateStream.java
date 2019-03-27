/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package generatestream;
/**
 * @version 1.1
 * @author Mike Hewitt
 */
/**
 * @param args the command line arguments
 */
/* public static void main(String[] args) {
 System.out.println("test");
 // TODO code application logic here
 }
 */
/*
 * generateStream.java
 * 24.08.2015 22:40:01
 * 16.06.2016   moved in from geany to Netbeans on Win7
compiled, execute and source/format (pretty print)
 *
 */
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
*/
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.LongPredicate;
/*
import java.util.stream.Collectors.*;
*/
//	private static class 4parms(int a, int b,int c,int d) {
//	}
 public class generateStream {  // was NOT a public class
/**
 * print from stream and lambda
 */
public static void stream_from_function() {
		Predicate<Integer> multip5 = w -> (w % 5) > 0;

			Predicate <Integer> badPrint = bp -> !((bp == 10) | (bp == 12) | (bp == 43)) ; // add 1,2,3
			// add 62,78,83,139,145,146,153
            Predicate <Integer> periodic = vl -> ((vl % 3) == 0);
        Stream.iterate(1, n -> n + 1)
                .limit(35)
                .skip(2)
               // .filter(n mod 3 == 0)
                .filter (badPrint)
                .filter (multip5)
             //   .filter(periodic)		//seems to filter in a.o.t. filter out SO negate predicate above
                .limit(160)
                .forEach(System.out::println);  // change to print w/o a new line but a space between integers
                // println or print 
               // .forEach(System.out::print(" ")); 
    }
/**
 * 
 * @param args info from command line
 * 
 */
public static void main(String args[]) {
        stream_from_function();
    }
}
