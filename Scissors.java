/*
 * Scissors.java
 * 
 * Michael Hewitt <mikeh@electroteach.com>
 */
import java.util.*;

class Scissors {
public Scissors(){
}
public void cutUp(String s) //throws IOExceptional 
{
	StringTokenizer st = new    StringTokenizer(s);  // StringTokenizer(s);
	System.out.println("No. of words = "+ st.countTokens());
	while (st.hasMoreTokens())
	{
		System.out.println(st.nextToken() + "\n");
		// System.in.read();
	}
		
}
}


