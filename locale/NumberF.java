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
 Locale[] localesN = DecimalFormat.getAvailableLocales(); // appears same as NumberFormat
 double myNumber = -1234.56789;
 NumberFormat form;


 NumberFormat nf = NumberFormat.getInstance();
 /*for (int i = 0; i < myNumber.length; ++i) {
     output.println(nf.format(myNumber[i]) + "; ");
 }
 */

 for (int j = 0; j < 4; ++j) {
	 System.out.println();
     System.out.println("<<<<< FORMAT >>>"+j+">>");
     System.out.println();
     for (int i = 0; i < localesN.length; ++i) {
		 /*
         if (localesN[i].getCountry().length() == 0) {
            continue; // Skip language-only locales
         }
         */

         System.out.format("%3d ",i);
         System.out.print( localesN[i].getDisplayName());    // "<"+i+"> "+
         switch (j) {
         case 0:
             form = NumberFormat.getInstance(localesN[i]); break;
         case 1:
             form = NumberFormat.getIntegerInstance(localesN[i]); break;
         case 2:
             form = NumberFormat.getCurrencyInstance(localesN[i]); break;
         default:
             form = NumberFormat.getPercentInstance(localesN[i]); break;
         }
         if (form instanceof DecimalFormat) {
// see http://docs.oracle.com/cd/E26806_01/wlp.1034/e14255/com/bea/p13n/expression/operator/Instanceof.html
             System.out.print(":: " + ((DecimalFormat) form).toPattern());
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

