// package Friday13;   removed to make compile and run 
import java.util.stream.LongStream;
import java.text.SimpleDateFormat;
import java.util.*;
public class LongTest {
public static void main (String args[]) {

String personalLoan = new String("cheap personal loans");
String homeLoan     = new String("cheap personal loans");
     
//since two strings are different object result should be false
boolean result = personalLoan == homeLoan;
System.out.println("Comparing two strings with == operator: " + result);
     
//since strings contains same content , equals() should return true
result = personalLoan.equals(homeLoan);
System.out.println("Comparing two Strings with same content using equals method: " + result);

}
}
