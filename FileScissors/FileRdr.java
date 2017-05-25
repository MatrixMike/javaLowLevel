/*
 * FileRdr.java
 * 
 * Copyright 2016 Michael Hewitt <mikeh@electroteach.com>
 * 
 */
package FileScissors;
import java.io.*;
import java.util.*;

public class FileRdr {
	
	public static void main (String args[])   throws IOException {
		String fname = null;
		String fcontents = null;
		
		FileNameReader fnrObj = new FileNameReader();
		fname = fnrObj.getFileName();						// step 1 
		
		FileInputReader firObj = new FileInputReader();
		fcontents = firObj.readFile(fname);					// step 2 
		
		// System.in.read();  // optional wait for return 
		// keypress to keep window open		
		Scissors sciObj = new Scissors();
		sciObj.cutUp(fcontents);							
	}
}
/**
 * 
 */
class FileNameReader
{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String fileName = null;
	
	public FileNameReader()		// constructor
	{
	}
	public String getFileName()
	{
		System.out.println("please enter filename ");
		while (true)
		{
			try
			{
				fileName = br.readLine();
			}
			catch (IOException ioe)
			{
				// ioe print stack trace
				// 
			}
			System.out.println("The file you are trying to read is "+fileName);
			return fileName;
		}
	}
	
}
/**
 * 
 */
class FileInputReader
{
	public FileInputReader()	// constructor
	{
	}
	public String readFile(String fName) throws IOException
	{
		String text = null;
		StringBuffer sBuf = new StringBuffer();
		BufferedReader brdr = null;
		try
		{
			FileReader fr = new FileReader(fName);// this could throw an exception
			brdr = new BufferedReader(fr);
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File not found");
		}
		while ((text = brdr.readLine()) != null)
		{
			sBuf.append(text);
			System.out.println("Read : "+ text);
		}
		text = sBuf.toString();
		System.out.println(text);
		return(text);
	}
	
}

