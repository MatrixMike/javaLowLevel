// package com.howtodoinjava.csv.demoSplit;
package wow;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class SplitterExample
{
    public static void main(String[] args)
    {
        //Input file which needs to be parsed
        String fileToParse = "/home/mikeh/WOW/emailList.txt";
        String csvHeader = "First Name,Last Name,Display Name,Nickname,Primary Email,";
        BufferedReader fileReader = null;
  //      System.out.println(csvHeader);
         
        //Delimiter used in CSV file
        final String DELIMITER = ",";
        try
        {
            String line = "";
            Integer count = 0;
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));
             
            //Read the file line by line
            while ((line = fileReader.readLine()) != null) 
            {
                //Get all tokens available in line
                String[] tokens = line.split(DELIMITER);
                count++;
 //               for(String token : tokens)
 //               {
                    //Print all tokens
                    
                 //    System.out.print(tokens[1]);
                 //    System.out.print(", ");
             //robin       System.out.print(tokens[8]+" ");
            //robin        System.out.print(tokens[10]+" ");
                    System.out.println(tokens[0]);
 //               }
                System.out.println("========");
            }
            System.out.println("Lines read :" + count);
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
