import java.applet.*;
import java.awt.*;

import java.util.Date;
// import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
// modified 14 september 2013

public class Label1 extends Applet {
	//	   enum DayOfWeek {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}  ;
	   private static void CalendarTimemethod() {
	   Date date = Calendar.getInstance().getTime();
	   System.out.println("Current date and time is: " + date);
	   System.out.println();
	   }

	   private static void SimpleDateFormatmethod() {
	   Calendar date = Calendar.getInstance();
	   SimpleDateFormat dateformatter = new SimpleDateFormat
	   ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	   System.out.println("Current date and time in simple date format: "
	   	+ dateformatter.format(date.getTime()));
	   System.out.println();
   }

    public void paint( Graphics g ) {
		   Calendar calender = Calendar.getInstance();
		   String testStr;
		   testStr = "fred";
		   int Xcoord = 45;
		   int Ycoord = 15;
		   int SysCount = 0;
		   int january = 0;
		   int december = 11;
		   int daysAhead = 195;


//        g.drawString(this.getParameter("text"),50,25);

//         g.drawString(Integer.toString(calender.get(Calendar.YEAR)),45,38);

//         g.drawString(Integer.toString(calender.get(Calendar.DAY_OF_MONTH)),45,48);

//         g.drawString(Integer.toString(calender.get(Calendar.DAY_OF_WEEK)),45,58);


//         g.drawString(Integer.toString(calender.get(Calendar.MINUTE)),45,78);

//        calender.get(Calendar.YEAR))
//           Getcalendermethods();

   Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
   	   SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");

 Ycoord += 10;

 cldr = Calendar.getInstance();
 Ycoord += 10;
    testStr = "Electronics Club Altona";
    			       		   g.setColor(Color.blue);
            g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
            for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
	// was n<31 above
	// was -cldr

//	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        if ( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==1) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==7) ) // was 3 = Tuesday ; 5 =Thursday
			     {
			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
//System.out.println(" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
	//		       System.out.println(dateformatter.format(cldr.getTime()));
			       testStr = dateformatter.format(cldr.getTime());
			       			       		   g.setColor(Color.black);
			       g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
			 }

     cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
    }

 cldr = Calendar.getInstance();

Ycoord += 10;
    testStr = "Electronics Club Altona";
    			       		   g.setColor(Color.blue);
            g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
            for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
	// was n<31 above
	// was -cldr

//	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        if (( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==3) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==7) ) // was 3 = Tuesday ; 5 =Thursday
			      ||
			     ( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==1) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==7) )
			     )
			     {
			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
//System.out.println(" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
	//		       System.out.println(dateformatter.format(cldr.getTime()));
			       testStr = dateformatter.format(cldr.getTime());
			       			       		   g.setColor(Color.black);
			       g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
			 }

     cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
    }

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
   System.out.println("Before two years it was: "
   + dateformatter.format(cldr.getTime()));

   cldr = (Calendar) date.clone();
   cldr.add(Calendar.DAY_OF_YEAR, + 5);
   System.out.println("After five years it will be: "
  + dateformatter.format(cldr.getTime()));

   System.out.println();
   }

   private static void DateDifference() {

   System.out.println("Difference between two dates");
   Date startDate1 = new GregorianCalendar(2005, 02, 25, 14, 00).getTime();
   Date endDate1 = new Date();;

   long diff = endDate1.getTime() - startDate1.getTime();

   System.out.println("  Difference between " + endDate1);
   System.out.println("  and " + startDate1 + " is "
    + (diff /

    (1000L*60L*60L*24L)) + " days.");
   System.out.println();
   }

   private static void Getcalendermethods() {

   System.out.println("Various get methods of the calendar class:");
   Calendar calender = Calendar.getInstance();

   System.out.println("Year : "

+ calender.get(Calendar.YEAR));
   System.out.println("Month  : "

+ calender.get(Calendar.MONTH));
   System.out.println("Day of Month  : "

+ calender.get(Calendar.DAY_OF_MONTH));
   System.out.println("Day of Week  : "

+ calender.get(Calendar.DAY_OF_WEEK));
   System.out.println("Day of Year  : "

+ calender.get(Calendar.DAY_OF_YEAR));
   System.out.println("Week of Year  : "

+ calender.get(Calendar.WEEK_OF_YEAR));
   System.out.println("Week of Month  : "

+ calender.get(Calendar.WEEK_OF_MONTH));
   System.out.println
    ("Day of the Week in Month : "

+ calender.get(Calendar.DAY_OF_WEEK_IN_MONTH));
   System.out.println("Hour: " + calender.get(Calendar.HOUR));
   System.out.println("AM PM: " + calender.get(Calendar.AM_PM));
   System.out.println("Hour of the Day: " + calender.get(Calendar.HOUR_OF_DAY));
   System.out.println("Minute: " + calender.get(Calendar.MINUTE));
   System.out.println("Second: " + calender.get(Calendar.SECOND));
   System.out.println();
   }
/*
   public static void main(String[] args) {
   System.out.println();
   CalendarTimemethod();
   SimpleDateFormatmethod();
   Adddates();
   DateDifference();
   Getcalendermethods();
   }
 }
*/




}
