


import java.util.function.Predicate;


public class PredicateTest1 {

	public static void main (String args[]) {
		Predicate <String> gr99 = 	s -> (s.length() > 99);
		Predicate <Integer> fizz = 	i -> (i / 3 == 0 );
		Predicate <Integer> buzz = 	i -> (i / 5 == 0 );
//		exercise3();

	}
	}
