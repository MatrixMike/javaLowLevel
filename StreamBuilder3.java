/*
 * StreamBuilder3.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 *
 * 24.08.2015 16:00:26
 * 
 */
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Date;
import java.util.Calendar;

// this runs but in an infinite loop   use ctrl S and Q to control flow...!

public class StreamBuilder3 {
     public static void main(String[] args){
		 Calendar cldr = Calendar.getInstance();
         Stream<Date> stream = Stream.generate(() -> {  
			// cldr = Calendar.getInstance();
			 return new Date();}
         )
         .limit(9)		// added 20.09.2015 14:21:07
						// looked for ; and () after generate and added .limit(n)
						// note that here the generate() contains actions to create new data 
						//
						// now that we have tamed this example we can doe some useful tests - 
						// this e.g. returns a stream of the same date 
						// something useful for me would be to create the forthcoming dates and test for some feature e.g. second Thursday of the month
						// see Dates1.java
						
         ;
         
         //  limit
         stream.forEach(p -> System.out.println(p));
     }
}
