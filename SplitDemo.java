
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SplitDemo {

    private static final String REGEX = "e:";
    private static final String INPUT =
        "one:two:three:four:five";
    
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        String[] items = p.split(INPUT);
        System.out.println("Input string is " + INPUT);
        for(String s : items) {
            System.out.println(s);
        }
    }
}

