// package com.howtodoinjava.csv.demoSplit;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 // https://docs.oracle.com/javase/8/docs/api/
public class SplitterExample2
{
    public static void main(String[] args)
    {
        //Input file which needs to be parsed
        String fileToParse = "/home/mikeh/WOW/emailList.txt";
        BufferedReader fileReader = null;
         
        //Delimiter used in CSV file
        final String DELIMITER = ", ";
        try
        {
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));
             
            //Read the file line by line
            while ((line = fileReader.readLine()) != null) 
            {
                //Get all tokens available in line
                String[] tokens = line.split(DELIMITER);
 //               for(String token : tokens)
 //               {
                    //Print all tokens
 //                   System.out.print(tokens[1]);
 //                   System.out.print(", ");
                    System.out.println(tokens[0]);
 //               }
                System.out.println("========");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
