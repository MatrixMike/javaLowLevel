/*
 * Tennis1.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 24.08.2015 15:36:23
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tennis1 {
	
	public static void main (String args[]) {
		String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
		
	List<String> players =  Arrays.asList(atp);
       
// Old looping
//for (String player : players) {
//     System.out.print(player + "; ");
//}
       
// Using lambda expression and functional operations
players.forEach((player) -> System.out.print(player + "; "));
 
// Using double colon operator in Java 8
players.forEach(System.out::println);

	}
}
