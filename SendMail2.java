// This example is from _Java Examples in a Nutshell_. (http://www.oreilly.com)
// Copyright (c) 1997 by David Flanagan
// This example is provided WITHOUT ANY WARRANTY either expressed or implied.
// You may study, use, modify, and distribute it for non-commercial purposes.
// For any commercial use, see http://www.davidflanagan.com/javaexamples

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * used by mikeh 16.09.2015 17:40:15
 * learned quite a few things - needs authentication for smtp etc 
 * methinks - how to add that
 * 
 server402.webhostingpad.com
 */
 
 /*
  * find out about PrintWriter  
  * 
 */
 
/**
 * This program sends e-mail using a mailto: URL
 **/
public class SendMail2 {
  public static void main(String[] args) {
	          List<String> list = new ArrayList<>(Arrays.asList(
        "From: ", "To: ", "Subject: "));
        list.forEach(   v -> System.out.println("value is "+ v)    );
    try {
      // If the user specified a mailhost, tell the system about it.
      System.out.println(args[0]);
      if (args.length >= 1) System.getProperties().put("mail.host", args[0]);
System.out.println("debug1");
      // A Reader stream to read from the console
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(
                  System.getProperty("user.name") + "@" + 
                  InetAddress.getLocalHost().getHostName() + ">");
     System.out.println("user.name "+ 
                  System.getProperty("user.name") + "@" + 
                  InetAddress.getLocalHost());
                 
      // Ask the user for the from, to, and subject lines

        
      System.out.print("From: ");
      String from = in.readLine();
      System.out.print("To: ");
      String to = in.readLine();
      System.out.print("Subject: ");
      String subject = in.readLine();

      // Establish a network connection for sending mail
      URL u = new URL("mailto:" + to);      // Create a mailto: URL 
      URLConnection c = u.openConnection(); // Create a URLConnection for it          c 
      c.setDoInput(false);                  // Specify no input from this URL
      c.setDoOutput(true);                  // Specify we'll do output
      System.out.println("Connecting...");  // Tell the user what's happening
         PrintWriter out =                     // Get output stream to mail host
        new PrintWriter(new OutputStreamWriter(c.getOutputStream()));   
        out.println("From: \"" + from + "\" <" +
                  System.getProperty("user.name") + "@" + 
                  InetAddress.getLocalHost().getHostName() + ">");   
        
      System.out.flush();                   // Tell them right now
      c.connect();                          // Connect to mail host


      // Write out mail headers.  Don't let users fake the From address
      out.println("From: \"" + from + "\" <" +
                  System.getProperty("user.name") + "@" + 
                  InetAddress.getLocalHost().getHostName() + ">");
      out.println("To: " + to);
      out.println("Subject: " + subject);
      out.println();  // blank line to end the list of headers

      // Now ask the user to enter the body of the message
      System.out.println("Enter the message. " + 
                         "End with a '.' on a line by itself.");
      // Read message line by line and send it out.
      String line;
      for(;;) {
        line = in.readLine();
        if ((line == null) || line.equals(".")) break;
        out.println(line);
      }

      // Close the stream to terminate the message 
      out.close();
      // Tell the user it was successfully sent.
      System.out.println("Message sent.");
      System.out.flush();
    }
    catch (Exception e) {  // Handle any exceptions, print error message.
      System.err.println(e);
      System.err.println("Usage: java SendMail [<mailhost>]");
    }
  }
}
