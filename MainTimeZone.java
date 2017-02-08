/*
 * MainTimeZone.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
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


import java.util.Calendar;
import java.util.TimeZone;

public class MainTimeZone {

   public static void main(String[] args) {

      // create a calendar
      Calendar cal = Calendar.getInstance();

      // get the time zone
      TimeZone tz = cal.getTimeZone();

      // print the time zone name for this calendar
      System.out.println("The time zone is :" + tz.getDisplayName());

   }
}

