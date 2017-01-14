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
 * http://uhfcb.com.au/80-Channel-UHF-Information.php
 */


public class CBfreqUHF {
	private static int spacing = 250;
	public static void main (String args[]) {
		int ch = 1;
		for (int x = 4764250; x < 4774000+1; x=x+spacing) {
//			System.out.println("M ch "+ ch + " F = " + x/10000 + "." + x%10000 +"MHz");
			System.out.println(strCreate.make1(ch,x));
			ch = ch + 1;
		}
	System.out.println("\n===");	
			
		ch = 41;
		for (int x = 4764375; x < 4769125+1; x=x+spacing) {
//			System.out.println("M ch "+ ch + " F = " + x/10000 + "." + x%10000 +"MHz");
			System.out.println(strCreate.make1(ch,x));
			ch = ch + 1;
		}
	System.out.println("\n===");
			ch = 64;
		for (int x = 4770125; x < 4774125+1; x=x+spacing) {
//			System.out.println("M ch "+ ch + " F = " + x/10000 + "." + x%10000 +"MHz");
			System.out.println(strCreate.make1(ch,x));
			ch = ch + 1;
		}	
		
	}
		static class strCreate  {
		static String make1 (int chn, int f ){
			String message1 = "";
			//int f = 156025;
			StringBuilder sb1 = new StringBuilder(message1);
			sb1.append("M ch ");
			sb1.append(chn);
			sb1.append(" F = ");
			sb1.append(f/10000);
			sb1.append(".");
			sb1.append(f%10000);
			sb1.append("MHz\n");
			//return message1; // return sb1;   work done to create sb1  
			return sb1.toString();
		}
	}
	
}

