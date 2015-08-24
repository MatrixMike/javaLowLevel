/*
 * page27.java
 * 
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 
 * 24.08.2015 15:33:47
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
