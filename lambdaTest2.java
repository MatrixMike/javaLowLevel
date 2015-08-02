/*
 * lambdaTest1.java
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

// package lambda1;

//import java.utils.Arrays;
//import java.utils.Arrays;
//import java.utils.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambdaTest2 {
/*
		  private static void exercise4() throws IOException {
    try (BufferedReader reader = 
        Files.newBufferedReader(Paths.get("SonnetI.txt"))) {
      long lineCount = reader.lines().count();
      System.out.println("Number of lines = " + lineCount);
    }
  }


*/
	

	public static void main (String args[]) {
	   List<String> list = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");


    List<String> newList = list.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

    newList.forEach(System.out::println);
// ========================

/*
    List<String> list1 = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");


*/

System.out.println("+++++++++++++++    spacer line");


    List<String> newList1 = list.stream()
        .filter(w -> w.length() % 2 == 1)
        .map(String::toLowerCase)
        .collect(Collectors.toList());

    newList1.forEach(System.out::println);
System.out.println("+++++++++++++++    spacer line");

    String merged = list.stream()
        .skip(1)
        .limit(3)
        .collect(Collectors.joining("-"));
    System.out.println(merged);


System.out.println("+++++++++++++++    spacer line");
// exercise4();

	}
}

