import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

// https://www.oracle.com/technical-resources/articles/java/serializationapi.html
public class InflateTime
{
public static void main(String [] args)
{
String filename = "time.ser";
     if(args.length > 0)
     {
       filename = args[0];
     }
   PersistentTime time = null;
   FileInputStream fis = null;
   ObjectInputStream in = null;
   try
   {
     fis = new FileInputStream(filename);
     in = new ObjectInputStream(fis);
     time = (PersistentTime)in.readObject();
     in.close();
   }
   catch(IOException ex)
   {
     ex.printStackTrace();
   }
   catch(ClassNotFoundException ex)
   {
     ex.printStackTrace();
   }
   // print out restored time
   System.out.println("Flattened time: " + time.getTime());
   System.out.println();
      // print out the current time
   System.out.println("Current time: " + Calendar.getInstance().getTime());
 }
}
