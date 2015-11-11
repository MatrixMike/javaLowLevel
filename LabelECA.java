package LabelECA;

import java.applet.*;
import java.awt.*;
import java.text.SimpleDateFormat;
// import java.util.Date;
import java.util.*;
//public static void main (String args[]) {
// no need to dummy stuff for eclipse - recognizes Applet 
//}

public class LabelECA extends Applet {
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
		   Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
       	   SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");
	 	   String testStr;
		   testStr = "fred";
		   int Xcoord = 45;
		   int Ycoord = 15;
		   int daysAhead = 365;
		   int first_time_through = 0 ;			// change to boolean 
		   Calendar diffnew;
		   Calendar cldr_now;
		   int dateDiff;
		   


//		g.drawString(this.getParameter("text"),50,25);
//		g.drawString(Integer.toString(calender.get(Calendar.YEAR)),45,38);
//		g.drawString(Integer.toString(calender.get(Calendar.DAY_OF_MONTH)),45,48);
//		g.drawString(Integer.toString(calender.get(Calendar.DAY_OF_WEEK)),45,58);
//		g.drawString(Integer.toString(calender.get(Calendar.MINUTE)),45,78);
		   testStr = "Electronics Club Altona";
           System.out.println(testStr);
//		g.drawString(Integer.toString(calender.get(Calendar.SECOND)),45,88);
		   g.setColor(Color.blue);
		   g.drawString(testStr,Xcoord,Ycoord);  Ycoord += 15;
//		calender.get(Calendar.YEAR))
//		Getcalendermethods();



		   for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
// was n<31 above
// was -cldr


			   if (( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2) &&   // Electronics Altona
					   (cldr.get(Calendar.DAY_OF_WEEK)==7) )
					   // was 3 = Tuesday ; 5 =Thursday
//		     &&
// add code to limit to February to December
// January = 0
 //		(( calender.get(Calendar.MONTH)> January)      && (calender.get(Calendar.MONTH) <= december ))
					   )
// loop here produces dates from now until year in future, first one is the one to use to calculate 'days to'

			   {
//mikeOct			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
//		       System.out.println(dateformatter.format(cldr.getTime()));
		       testStr = dateformatter.format(cldr.getTime());  // Nov4 2015
		       System.out.print(" Next meeting will be on " +testStr);
			   cldr_now = Calendar.getInstance(); 
	 //   		 System.out.println("DAY_OF_YEAR: " + cldr.get(Calendar.DAY_OF_YEAR));
	/*    		 System.out.println("days difference " + cldr.get(Calendar.DAY_OF_YEAR) +" zz "+ cldr_now.get(Calendar.DAY_OF_YEAR) );
		      8 nov 2015 -> learnt that doing the calc inside the println causes result to be converted to string. So when done external to println can maniplulate as int.
		       */
		       g.setColor(Color.black);
		       dateDiff = cldr.get(Calendar.DAY_OF_YEAR) - cldr_now.get(Calendar.DAY_OF_YEAR);
		       System.out.println(" which is in "+ dateDiff + " days. ");
		       g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
		 }
			   if (first_time_through == 1){
				   System.out.println("first time through = " + first_time_through );
				   cldr_now = Calendar.getInstance(); 
					// Date	now	= new GregorianCalendar().getTime();
					// diffnew =  cldr_now;  // cldr.getTime() -
				    	//   Date date = Calendar.getInstance().getTime();
/* 	8 nov 2015 			    		 System.out.println("DAY_OF_YEARc: " + cldr.get(Calendar.DAY_OF_YEAR));
				    		 System.out.println("DAY_OF_YEARn: " + cldr_now.get(Calendar.DAY_OF_YEAR));
				    		 */
				   first_time_through++;  // 9/11/15
			   }
			   
			   first_time_through++; 
			   cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
    }
		   cldr = Calendar.getInstance();  // looks like get info for today again
		   Ycoord += 10;
		   first_time_through = 0 ;
 
		   testStr = "Newport Folk Club";
		   System.out.println(testStr);
		   g.setColor(Color.blue);
		   g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
		   for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
	// was n<31 above
	// was -cldr

 //melbpc 	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        if ( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==1) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==6) ) // was 3 = Tuesday ; 5 =Thursday
			     {
//			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
	//		       System.out.println(dateformatter.format(cldr.getTime()));
			       testStr = dateformatter.format(cldr.getTime());
			       		       System.out.println(testStr);
			       		   g.setColor(Color.black);
			       g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
			 }
	        first_time_through++; 
	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        }

		   cldr = Calendar.getInstance();
		   Ycoord += 10;
		   first_time_through = 0 ;
		   testStr = "Newport Folk Club";
		   g.setColor(Color.blue);
		   g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
		   for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
	// was n<31 above
	// was -cldr

//	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        if ( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==1) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==6) ) // was 3 = Tuesday ; 5 =Thursday
	        	{
//mikeOct			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
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
    testStr = "Melbpc Microcontroller practical session";
        			       		   g.setColor(Color.blue);
            g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
            for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
	// was n<31 above
	// was -cldr

//	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        if ( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==4) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==7) ) // was 3 = Tuesday ; 5 =Thursday
			     {
//mike5			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
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
    testStr = "Hobsons Bay Mens Shed Car Torque";
    			       		   g.setColor(Color.blue);
            g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
            for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
	// was n<31 above
	// was -cldr

//	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        if ( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==1) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==1) ) // was 3 = Tuesday ; 5 =Thursday
			     {
//mike4			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
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
    testStr = "DATTA meeting";
    			       		   g.setColor(Color.blue);
            g.drawString(testStr,Xcoord,Ycoord);   Ycoord += 15;
            for (int n= - cldr.get(Calendar.DAY_OF_MONTH); n<daysAhead;  n=n+1) {  // find current first of month
	// was n<31 above
	// was -cldr

//	        cldr.add(Calendar.DAY_OF_YEAR, +1);                             // increment by one day
	        if ( (cldr.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2) &&
			     (cldr.get(Calendar.DAY_OF_WEEK)==4) ) // was 3 = Tuesday ; 5 =Thursday
			     {
//mike3			   System.out.println(SysCount++    +" 2nd w/m and 3rd d/w ");   // NERG unemployed 4th Tuesday
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

   private static void GetCalenderMethods() {

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
