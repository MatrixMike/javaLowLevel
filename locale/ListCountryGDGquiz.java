/*
 * ListCountryGDGquiz.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * 
https://mkyong.com/java/display-a-list-of-countries-in-java/
 * 
 */



import java.util.Locale;

public class ListCountryGDGquiz {
/* open letters   in uppercase - CEFGHIJKLMNSTUVWXYZ
 * closed letters in uppercase - ABDOPQR
 */
 
    public static void main(String[] args) {
String open = "CEFGHIJKLMNSTUVWXYZ";
String closed = "ABDOPQR";

	ListCountry obj = new ListCountry();
	obj.run();

    }

    public void run() {
String country = "";
	String[] locales = Locale.getISOCountries();

	for (String countryCode : locales) {

		Locale obj = new Locale("", countryCode);

		System.out.println("Country Code = " + obj.getCountry() 
			+ ", Country Name = " );
		country = 	obj.getDisplayCountry();
		System.out.println(country);
	}

	System.out.println("Done");
    }
	
}
