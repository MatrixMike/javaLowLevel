/*
 * CalendarSetExample.java
 * 
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

//package com.javatutorialhq.java.examples;

import java.util.Calendar;
import java.util.Date;

/*
 * This example source code demonstrates the use of  
 * set() method of Calendar class
 */

public class CalendarSetExample {

	public static void main(String[] args) throws InterruptedException {

		Calendar cal = Calendar.getInstance();
		// Printing the current time
		System.out.println("Current time:" + cal.getTime());

		// set the time using the 1st overloaded method
		cal.set(Calendar.YEAR, 2019); // set the year
		cal.set(Calendar.MONTH, 2); // set the month
		cal.set(Calendar.DAY_OF_MONTH, 23); // set the day
		// print the date after setting
		System.out.println("Time after setting:" + cal.getTime());

		// clear calendar
		cal.clear();
		System.out.println("Time after clearing:"+cal.getTime());
		
		//set again the time using the 1st overloaded method
		cal.set(Calendar.YEAR, 2019); // set the year
		cal.set(Calendar.MONTH, 2); // set the month
		cal.set(Calendar.DAY_OF_MONTH, 23); // set the day
		System.out.println("Time after clear and set:"+cal.getTime());
		
		// set the time using the second overloaded method
		cal.set(2020, 11, 14);
		System.out.println("Time of 2nd overloaded method:"+cal.getTime());
		
		// set the time using the third overloaded method
		cal.set(2018, 6, 17, 23, 15);
		System.out.println("Time of 3rd overloaded method:"+cal.getTime());
		
		//set the time using the 4th overloaded method
		cal.set(2007, 8, 12, 10, 12, 42);
		System.out.println("Time of 4th overloaded method:"+cal.getTime());
		
	}

}
