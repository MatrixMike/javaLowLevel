/*
 * StreamBuilder3.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 *
 * 24.08.2015 16:00:26
 * 
 */
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Date;

// this runs but in an infinite loop   use ctrl S and Q to control flow...!

public class StreamBuilder3 {
     public static void main(String[] args){
         Stream<Date> stream = Stream.generate(() -> { return new Date();});
         stream.forEach(p -> System.out.println(p));
     }
}
