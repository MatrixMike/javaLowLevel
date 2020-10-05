import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDiff3 {
    public static void main(String[] args) throws ParseException{
        String strDate = "Thu Jun 18 20:56:02 EDT 2009";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dateStr = formatter.parse(strDate);
        String formattedDate = formatter.format(dateStr);
        System.out.println("yyyy-MM-dd date is ==>"+formattedDate);
        Date date1 = formatter.parse(formattedDate);

        formatter = new SimpleDateFormat("dd-MMM-yyyy");
        formattedDate = formatter.format(date1);
        System.out.println("dd-MMM-yyyy date is ==>"+formattedDate);
    }
}
