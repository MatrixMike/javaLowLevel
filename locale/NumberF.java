/*
 * NumberF.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 17.08.2016
 * curious about :
 * why so many import statements needed,
 * 
 * 
 * lesson for me here is: use the https://docs.oracle.com/javase/8/docs/api/
 * 
 */
import java.text.Format;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class NumberF {
	
	public static void main (String args[]) {
// Print out a number using the localized number, integer, currency,
// and percent format for each locale</strong>
 Locale[] locales = NumberFormat.getAvailableLocales();
 double myNumber = -1234.56;
 NumberFormat form;
 
 
 NumberFormat nf = NumberFormat.getInstance();
 /*for (int i = 0; i < myNumber.length; ++i) {
     output.println(nf.format(myNumber[i]) + "; ");
 }
 */
 
 for (int j = 0; j < 4; ++j) {
     System.out.println("<<<<< FORMAT >>>>>");
     for (int i = 0; i < locales.length; ++i) {
		 /*
         if (locales[i].getCountry().length() == 0) {
            continue; // Skip language-only locales
         }
         */
         System.out.print(locales[i].getDisplayName());
         switch (j) {
         case 0:
             form = NumberFormat.getInstance(locales[i]); break;
         case 1:
             form = NumberFormat.getIntegerInstance(locales[i]); break;
         case 2:
             form = NumberFormat.getCurrencyInstance(locales[i]); break;
         default:
             form = NumberFormat.getPercentInstance(locales[i]); break;
         }
         if (form instanceof DecimalFormat) {
             System.out.print(": " + ((DecimalFormat) form).toPattern());
         }
         System.out.print(" -> " + form.format(myNumber));
         System.out.println();
         /*
         try {
             System.out.println(" -> " + form.parse(form.format(myNumber)));
         } catch (ParseException e) {}
         */
     }
 }
	}
	

}

