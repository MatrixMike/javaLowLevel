/*
 * ListCountry.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * 
https://mkyong.com/java/display-a-list-of-countries-in-java/
 * 
 */



import java.util.Locale;

public class ListCountry {

    public static void main(String[] args) {

	ListCountry obj = new ListCountry();
	obj.run();

    }

    public void run() {

	String[] locales = Locale.getISOCountries();

	for (String countryCode : locales) {

		Locale obj = new Locale("", countryCode);

		System.out.println("Country Code = " + obj.getCountry() 
			+ ", Country Name = " + obj.getDisplayCountry());

	}

	System.out.println("Done");
    }
	
}
