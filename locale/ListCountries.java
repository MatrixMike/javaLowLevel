/*
 * country2.java
 * 
 * Copyright 2020 Mike <mikeh@mikeh-OptiPlex-745>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
// https://memorynotfound.com/java-display-list-countries-using-locale-getisocountries/
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Locale;
class Country {

    private String countryCode;

    private String name;

    public Country(String countryCode, String name)

    {

        this.countryCode = countryCode;

        this.name = name;

    }

    public String getCountryCode() {

        return countryCode;

    }

    public void setCountryCode(String countryCode) {

        this.countryCode = countryCode;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String toString()

    {

        return countryCode + ", " + name;

    }

}
public class ListCountries {

    public static void main(String... args){

        // Create a collection of all available countries
        List<Country> countries = new ArrayList<Country>();

        // Map ISO countries to custom country object
        String[] countryCodes = Locale.getISOCountries();
        for (String countryCode : countryCodes){

            Locale locale = new Locale("", countryCode);
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();

            countries.add(new Country(iso, code, name));
        }

        // Sort countries
        Collections.sort(countries);

        // Loop over collection of countries and print to console
        countries.forEach((System.out::println));

        // print total number of countries
        System.out.println("found: " + countries.size() + " countries");

    }

}
