/*
 * CBfreq.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
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
 * program to display frequencies of CB (Marine radio) channels 
 * i.e. convert to frequencies that Amateur (and other) radio users appreciate
 * 
 */


public class CBfreq {
	
	public static void main (String args[]) {
		int ch = 1;
		
		String palindrome = "Dot saw I was Tod";
         
        StringBuilder sb = new StringBuilder(palindrome);

		sb.append("Greetings");
		System.out.println(" length = " + sb.length() + " "+  sb.reverse() + sb);
		
		for (int x = 156050; x < 157350+1; x=x+50) {
			sb.append("\nM ch ");
			sb.append(ch);
			sb.append(" F = ");
			sb.append(x/1000);
			sb.append(".");
			sb.append(x%1000);
			sb.append("MHz");
			System.out.println(sb);
			// System.out.println("\nM ch "+ ch + " F = " + x/1000 + "." + x%1000 +"MHz");
			// now reset to blank
			ch = ch + 1;
		}
			System.out.println("\n===M ch 28 F = 157.5MHz===");	
			
		ch = 60;
		for (int x = 156025; x < 157425+1; x=x+50) {
			System.out.println("\nM ch "+ ch + " F = " + x/1000 + "." + x%1000 +"MHz");
			ch = ch + 1;
		}
	}
}

