/*
 * Lambda1.java
 * 
 * 2017 mikeh <mikeh@mikeh-desktop>
 * 
 * 
 */
//import 

public class Lambda1 {
	
	public static void main (String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;
//	class Lambda1 {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
//}	
	}
}

