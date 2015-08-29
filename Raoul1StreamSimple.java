/*
 * Raoul1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 

 * 
 */
import java.util.stream.Stream;

public class Raoul1StreamSimple {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(2, 4, 7, 9);

        numbers.map(n -> n * 2)
               .forEach(System.out::println);
    }
}


