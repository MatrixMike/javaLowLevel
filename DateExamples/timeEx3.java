import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
public class timeEx3 {
// https://beginnersbook.com/2017/10/java-display-time-in-12-hour-format-with-ampm/
    public static void main(String[] args)
    {	
    	//Displaying current time in 12 hour format with AM/PM
    	DateFormat dateFormat = new SimpleDateFormat("hh.mm a");
    	String dateString = dateFormat.format(new Date()).toString();
    	System.out.println("Current time in AM/PM: "+dateString);
    	
    	//Displaying current date and time in 12 hour format with AM/PM
    	DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
    	String dateString2 = dateFormat2.format(new Date()).toString();
    	System.out.println("Current date and time in AM/PM: "+dateString2);
    }
}
