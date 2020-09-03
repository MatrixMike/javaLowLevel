/*
 * ZonedDate2.java
 * 
 * Copyright 2020 Michael <mikeh@mikeh-K52N>
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
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
// 03.09.2020 13:03:40
public class ZonedDate2 {
	
	public static void main (String[] args) {
	ZonedDateTime nextFriday = LocalDateTime.now()
	  .plusHours(1)
	  .with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
	  .atZone(ZoneId.of("GMT"));   // was PST  // was GMT  //  try AEST
	  System.out.println(nextFriday);
	  
	}
}

