/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 2 homework
 */
// package lesson2a;  // works OK when no package defined - needs more investigation 
// 02.08.2015 22:40:54
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Speakjava (simon.ritter@oracle.com)
 */
public class Lesson2a {
 // private static final String WORD_REGEXP = "[- .:,]+";
  
public static void main(String[] args) 
// throws IOException 
{
  //  Lesson2a lesson = new Lesson2a();
 //   lesson.runExercises();
  
  
  //  exercise1() {
  
  List<Integer> list2 = Arrays.asList(1,2,3,4,5,6) ; 
  
    List<String> list = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

    List<String> newList = list.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

    newList.forEach(System.out::println);
 // }
     List<String> list1 = Arrays.asList(
        "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

    String merged = list1.stream()
        .skip(1)
        .limit(3)
        .skip(1)
      //  .limit(3)
        .collect(Collectors.joining("=mike="));
    System.out.println(merged);
    
    
  List<Integer> newIntList = list2.stream() 
  // in here remove odd numbers and maybe square the remaining 
		.skip(2)
		.limit(2)
		.skip(2)
		.limit(2)
//		.max()
	//	.sum()
         .collect(Collectors.toList()); 
     newIntList.forEach(System.out::println);
     
  //   int biggest = list2.stream()
  //   .filter(s -> s = 3)
  // .mapToInt()
  //   .max();
 
  //   String merged1 = list2.stream();
  //      .skip(1)
 //       .limit(3)
//        .collect(Collectors.joining("-"));
 //    System.out.println(merged1);
  }
}

