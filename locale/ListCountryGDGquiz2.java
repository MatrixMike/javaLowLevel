/*
 * ListCountryGDGquiz.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * https://www.techiedelight.com/iterate-over-characters-string-java/
https://mkyong.com/java/display-a-list-of-countries-in-java/
* https://docs.oracle.com/javase/8/docs/api/java/text/CharacterIterator.html
 * 
 */


import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Locale;

public class ListCountryGDGquiz2 {
/* open letters   in uppercase - CEFGHIJKLMNSTUVWXYZ
 * closed letters in uppercase - ABDOPQR
 */
 
    public static void main(String[] args) {


/*	ListCountry obj = new ListCountry();  // explanation needed here
	obj.run();

    }

    public void run() {
*/		
		char c = 'E';
	String country = "";
	String open = "CEFGHIJKLMNSTUVWXYZ";
	String closed = "ABDOPQR";

	String france = "FRANCE";
	CharacterIterator it = new StringCharacterIterator(closed);
	CharacterIterator fr = new StringCharacterIterator(france);
	String[] locales = Locale.getISOCountries();

/*	for (String countryCode : locales) {

		Locale obj = new Locale("", countryCode);

		System.out.println("Country Code = " + obj.getCountry() 
			+ ", Country Name = " );
		country = 	obj.getDisplayCountry();
		System.out.println(country);
	}
	*/
	while (fr.current() !=  c ) {  // test current  ; was CharacterIterator.DONE  // "R"
		// 
		System.out.print(fr.current()+" X ");
		fr.next();
		}
	System.out.println("Done");
    }
	
}
