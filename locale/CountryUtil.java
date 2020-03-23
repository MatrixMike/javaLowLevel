/*
 * CountryUtil.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;

public class CountryUtil {

  public static List<Country> getCountries(final Locale inLocale) {

    String[] countryCodes = Locale.getISOCountries();

    List<Country> countries = new ArrayList<Country>(countryCodes.length);

    for (String countryCode : countryCodes) {

      countries.add(new Country(countryCode, new Locale("", countryCode).getDisplayCountry(inLocale)));

    }

    Collections.sort(countries, new Comparator<Country>() {

      public int compare(Country c1, Country c2) {

        return c1.getName().compareTo(c2.getName());

      }

    });

    return countries;

  }

  public static Map<String, String> getCountriesMap(final Locale inLocale) {

    List<Country> countries = getCountries(inLocale);

    Map<String, String> countriesMap = new LinkedHashMap<String, String>(countries.size());

    for (Country country : countries) {

      countriesMap.put(country.getCountryCode(), country.getName());

    }

    return countriesMap;

  }

  public static void printCounties(List<Country> countries) {

    for (Country country : countries) {

      System.out.println(country);

    }

  }

  public static void main(String[] args) {

    // Get list of countries in US English

    System.out.println("---- List of countries in English ----");

    List<Country> countries = getCountries(Locale.US);

    printCounties(countries);

    System.out.println("---- List of countries in Japanese ----");

    // Get list of countries in Japanese

    countries = getCountries(Locale.JAPANESE);

    printCounties(countries);

  }

}
