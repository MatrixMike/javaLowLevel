/*
 * ZonedDate2.java
 * 
 * Copyright 2020 Michael <mikeh@mikeh-K52N>
 * 
 * 
 */
import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;

import java.time.OffsetDateTime;

import java.time.OffsetTime;

import java.time.ZonedDateTime;

import java.time.format.DateTimeFormatter;
import java.lang.Object;
import java.time.ZoneId;
//  https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
//  https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
// 03.09.2020 13:03:40
public class ZonedDate2 {
	
	public static void main (String[] args) {
		System.out.println(LocalDate.now( ZoneId.of( "Asia/Kolkata" ) )
		.with( TemporalAdjusters.next( DayOfWeek.MONDAY ) )  // note next
		.format( DateTimeFormatter.BASIC_ISO_DATE ));
		
		System.out.println(LocalDate.now( ZoneId.of( "Australia/Melbourne" ) )
		.with( TemporalAdjusters.next( DayOfWeek.TUESDAY ) )
		.format( DateTimeFormatter.BASIC_ISO_DATE ));	
		
				System.out.println(LocalDate.now( ZoneId.of( "Australia/Melbourne" ) )
		.with( TemporalAdjusters.next( DayOfWeek.SATURDAY ) )
		.format( DateTimeFormatter.BASIC_ISO_DATE ));
			
	ZonedDateTime nextFriday = LocalDateTime.now()
	  .plusHours(1)
	  .with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
	  .atZone(ZoneId.of("UTC"));   // was PST  // was GMT  //  try AEST  or AET
	  System.out.println(nextFriday);
	  
	}
}

