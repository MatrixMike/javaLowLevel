import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
//import java.time.Locale;
public class timeEx1 {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM HH:mm"); 
     
/*    DateTimeFormatter fmt = new DateTimeFormatterBuilder()
        .parseCaseInsensitive()
        .appendPattern("EEE MMM dd, yyyy h:mma z")
        .toFormatter(Locale.US);
*/    
    //     DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After formatting: " + formattedDate); 
//    System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime)); 
  }  
} 
