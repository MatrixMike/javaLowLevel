/*
 * page27.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
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




 class page27{
	
	public static void main (String args[]) {
		
/*
		if (args.length > 0) // safety feature
		System.out.println("Hello, " + args[0]);
		else
		System.out.println("Hello, someone - you didn't give me your name");
		
*/
	page27 a = new  page27();	
	ClassB b = new ClassB();
	page27 a2 = b;
	System.out.println("test() for a is: " + a.test());
	System.out.println("test() for a2 is: " + a2.test());	
	}
	
	String test() {
		return "ClassA";
	}

	
}
// another class

class ClassB extends page27 {
	String test() {
		 return "ClasssB";
		}

	}
