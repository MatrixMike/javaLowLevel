/*
 * Dates1.java
 * 
 * Copyright 2015 Mike <mhewitt@theiet.org>
 * 
 * 
 * 
 */
import java.util.Date;
// import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
// modified 14 september 2013
/*
23.08.2015 16:05:44
example to calculate number of days to birthday
27.08.2015 10:14:57  systematic change of println to print with extra formatting
*/


public class Dates1 {
  private static void DateDifference() {

   System.out.println("Difference between two dates");
   Date startDate1 = new GregorianCalendar(2005, 02, 25, 9, 00).getTime();
   Date startDate2 = new GregorianCalendar(2015, 10,  1, 9, 00).getTime();
   Date startDate3 = new GregorianCalendar(2015,  8,  1, 9, 00).getTime();
   Date endDate1   = new Date();

   long diff1 = endDate1.getTime() - startDate1.getTime();
   long diff2 =   startDate2.getTime() - endDate1.getTime();
   long diff3 =   startDate3.getTime() - endDate1.getTime();
      
   System.out.println("  Difference between " + endDate1);
   System.out.println("  and " + startDate1 + " is "  + (diff1 / (1000L*60L*60L*24L)) + " days.");
   System.out.println("  and " + startDate2 + " is "  + (diff2 / (1000L*60L*60L*24L)) + " days.");
   System.out.println("  and " + startDate3 + " is "  + (diff3 / (1000L*60L*60L*24L)) + " days.");
   System.out.println();
   }
	  private static void Adddates() {

   System.out.println("Performing operations on calendar dates.");

   // Get today's date
   Calendar date = Calendar.getInstance();
   Calendar cldr;
   SimpleDateFormat dateformatter = new SimpleDateFormat
   ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

   cldr = (Calendar) date.clone();
   cldr.add(Calendar.DAY_OF_YEAR, - (365 * 2));
   System.out.println("two years ago it was    : "
   + dateformatter.format(cldr.getTime()));

   cldr = (Calendar) date.clone();
   cldr.add(Calendar.DAY_OF_YEAR, + 5);
   System.out.println("In five years it will be: "
  + dateformatter.format(cldr.getTime()));

   System.out.println();
   }
   private static void Getcalendermethods() {

   System.out.println("Various get methods of the calendar class:");
   Calendar calender = Calendar.getInstance();

   System.out.print("Year : "+ calender.get(Calendar.YEAR)+" == ");
   System.out.print("Month  : "+ calender.get(Calendar.MONTH)+" == ");
   System.out.print("Day of Month  : "+ calender.get(Calendar.DAY_OF_MONTH)+" == ");
   System.out.print("Day of Week  : "+ calender.get(Calendar.DAY_OF_WEEK)+" == ");
   System.out.print("Day of Year  : "+ calender.get(Calendar.DAY_OF_YEAR)+" == ");
   System.out.print("Week of Year  : "+ calender.get(Calendar.WEEK_OF_YEAR)+" == ");
   System.out.print("Week of Month  : "+ calender.get(Calendar.WEEK_OF_MONTH)+" == ");
   System.out.println
    ("Day of the Week in Month : "+ calender.get(Calendar.DAY_OF_WEEK_IN_MONTH)+" == ");
   System.out.print("Hour: " + calender.get(Calendar.HOUR)+" == ");
   System.out.print("AM PM: " + calender.get(Calendar.AM_PM)+" == ");
   System.out.print("Hour of the Day: " + calender.get(Calendar.HOUR_OF_DAY)+" == ");
   System.out.print("Minute: " + calender.get(Calendar.MINUTE)+" == ");
   System.out.println("Second: " + calender.get(Calendar.SECOND)+" == ");
   System.out.println();
   }
	
	
	public static void main (String args[]) {
		DateDifference();
		Adddates();
		Getcalendermethods();
	}
}

