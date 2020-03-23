/*
 * LocaleBuild1.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * 
 * https://docs.oracle.com/javase/tutorial/i18n/locale/create.html
 * https://docs.oracle.com/javase/tutorial/i18n/locale/matching.html
 */
import java.util.Locale;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
public class LocaleBuild1 {
	
	public static void main (String[] args) {
		Locale aLocale = new Locale.Builder().setLanguage("fr").setRegion("CA").build();
		Locale bLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
		Locale dLocale = new Locale("ru");
		Locale j1Locale;
		Locale j2Locale;
		Locale j3Locale;				
		aLocale = new Locale("fr", "CA");
		bLocale = new Locale("en", "US");
		cLocale = new Locale("en", "GB");
//		dLocale = new Locale("ru");
		aLocale = Locale.forLanguageTag("en-US");
		bLocale = Locale.forLanguageTag("ja-JP-u-ca-japanese");
		cLocale = Locale.JAPAN;
		dLocale = Locale.CANADA_FRENCH;
		j1Locale = Locale.JAPANESE;
		j2Locale = new Locale.Builder().setLanguage("ja").build();
		j3Locale = new Locale("ja");
		System.out.println(bLocale);
		System.out.println(cLocale);
		System.out.println(j2Locale);
		test1();
		test2();
		test3();
	}
	public static void  test1(){
	        // Create a collection of Locale objects to search
        Collection<Locale> locales = new ArrayList<>();
        locales.add(Locale.forLanguageTag("en-GB"));
        locales.add(Locale.forLanguageTag("ja"));
        locales.add(Locale.forLanguageTag("zh-cmn-Hans-CN"));
        locales.add(Locale.forLanguageTag("en-US"));

        // Express the user's preferences with a Language Priority List
        String ranges = "en-US;q=1.0,en-GB;q=0.5,fr-FR;q=0.0";
        List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

        // Find the BEST match, and return just one result
        Locale result = Locale.lookup(languageRanges,locales);
        System.out.println("***");
        System.out.println(result.toString());
	}
	public static void test2(){
	// Create a collection of String objects to match against
        Collection<String> tags = new ArrayList<>();
        tags.add("en-GB");
        tags.add("ja");
        tags.add("zh-cmn-Hans-CN");
        tags.add("en-US");

    // Express user's preferences with a Language Priority List
        String ranges = "en-US;q=1.0,en-GB;q=0.5,fr-FR;q=0.0";
        List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

    // Find the BEST match, and return just one result
        String result = Locale.lookupTag(languageRanges, tags);
        System.out.println("%%%");
        System.out.println(result);
	}
	public static void test3(){
	// Create a collection of String objects to match against
        Collection<String> tags = new ArrayList<>();
        tags.add("en-GB");
        tags.add("ja");
        tags.add("zh-cmn-Hans-CN");
        tags.add("en-US");

    // Express user's preferences with a Language Priority List
        String ranges = "en-US;q=1.0,en-GB;q=0.5,fr-FR;q=0.0";
        List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

    // Now search the locales for the best match
        List<String> results = Locale.filterTags(languageRanges,tags);
        System.out.println("&&&");
    // Print out the matches
        for(String s : results){
            System.out.println(s);	
		}	
	}
}

