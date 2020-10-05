/*
 * timeEx2.java
 * 
 * Copyright 2020 Mike <mikeh@mikeh-OptiPlex-745> 
 * LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
	LocalTime anotherTime = LocalTime.of(13, 12, 45);
	ZonedDateTime zonedDateTime = ZonedDateTime.of(anotherSummerDay, anotherTime, ZoneId.of("Europe/Helsinki"));
 */
import java.time.LocalTime;  // Import the LocalDateTime class
import java.time.LocalDate;  // Import the LocalDateTime class
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.time.ZonedDateTime;
import java.time.format.*;
// https://www.baeldung.com/java-datetimeformatter
public class timeEx2 {
	
	public static void main (String[] args) {
	LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
	LocalTime anotherTime = LocalTime.of(13, 12, 45);
//	LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
	System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
//	ZonedDateTime zonedDateTime = ZonedDateTime.of(anotherSummerDay, anotherTime, ZoneId.of("Europe/Helsinki"));	
//	LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
	System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	}
}

