/*
 * TimeDiff1.java
 * 
 * Copyright 2020 Michael <mikeh@mikeh-K52N>
 * 
 * 
 */
import java.time.Duration;
import java.time.Instant;

public class TimeDiff1 {
	
	public static void main (String[] args) {


Instant start = Instant.now();
//your code
Instant end = Instant.now();
Duration timeElapsed = Duration.between(start, end);
System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
	}
}

