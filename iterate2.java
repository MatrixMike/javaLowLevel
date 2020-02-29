/*
 * iterate2.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * 
https://www.techiedelight.com/iterate-over-characters-string-java/
 * 
 * 
 */


public class iterate2 {
	
import com.google.common.collect.Lists;

class StringUtil
{
	// Iterate over characters of a String
	public static void main (String[] args)
	{
		String s = "Techie Delight";

		// using for-each loop
		for (Character ch : Lists.charactersOf(s)) {
			System.out.print(ch);
		}

		// Java 8 - listIterator
		Lists.charactersOf(s)	   // List<Characters>
				.listIterator()	 // or iterator()
				.forEachRemaining(System.out::print);

	}
}
}

