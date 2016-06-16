/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package tabgen;
/**
 *
 * @author MikeW7
 */
/**
 * @param args the command line arguments
 */
// import java.lang.*;
// import java.util.*;
//import java.lang.Object;
// import java.lang.object;
// 05 October 2011
// mod in Netbeans 16/06/2016
// TabGen.java:28: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
import java.io.File;
import java.text.Format;
import java.util.*;                //Note 1
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TabGen {
// on Tony IBM testing Java 7 ?
    public static void header() {
        System.out.println("<head>");
        System.out.println("<title>Java generated table</title>");
        System.out.println("</head>");
    }

    public static void main(String args[]) throws FileNotFoundException {
        String name;               // Declare a variable to hold the name.
        String names[];
//	Scanner in = new Scanner(System.in);
        //       Scanner scanner = new Scanner(new File("/home/mikeh/javaLowLevel/TabGenIn.txt"));
        Scanner scanner = new Scanner(new File("C:\\Users\\MikeW7\\Documents\\NetBeansProjects\\TabGen\\testInput\\TabGenIn.txt"));
        // C:\Users\MikeW7\Documents\GitHub\javaLowLevel
        // C:\Users\MikeW7\Documents\NetBeansProjects\TabGen\testInput\TabGenIn.txt
// DateFormat df = DateFormat.getDateInstance();
        System.out.println("<html>");    //  header
        header();
        System.out.println("<body>");
        System.out.println("<H1 ALIGN=CENTER>My PIC projects</H1>");
        int n = 1;
        String one = "https://electroteach.com/pics/TabGen.html";
        String two = "Explanation here</A>";

        System.out.println("<TABLE BORDER ALIGN=CENTER>");
        // System.out.println( "<TABLE>") ;

        for (int rows = 1; rows < 10; rows = rows + 1) {
            System.out.print("<TR>");
            for (int cols = 1; cols < 2; cols = cols + 1) {

//	if (n % 3 !=0)  {    // if n div 3 not  eq 3 then
                System.out.println("<TH>");
                name = scanner.nextLine();      // Read one line from the console.
                System.out.println(
                        // this line is split to allow easy commenting out of unwanted parts
                        //		n + " " +
                        name);
                System.out.print("</TH>");
//	}
                n = n + 1;
            }
            System.out.print("</TR>");
        }
        System.out.println("</TABLE>");
        System.out.println("<A HREF=" + one + two);
        System.out.println("</body></html>");
        scanner.close();
    }
}
