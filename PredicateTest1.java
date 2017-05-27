
import java.util.stream.Stream;
//import java.util.stream.Collectors.*;
//import java.util.List;
//import java.util.Arrays;
import java.util.function.Predicate;
// 27 May 2017

public class PredicateTest1 {

	public static void stream_from_function() {
		Predicate <Integer> fizz = 	i -> (i % 3 != 0 );
		Predicate <Integer> buzz = 	i -> (i % 5 != 0 );
		Stream.iterate(0, n -> n + 1)
		.limit(55)
		.filter(fizz)
		.filter(buzz)
	//	.forEach(System.out::println);
				.forEach(System.out::println);
}

	public static void main (String args[]) {
		Predicate <String> gr99 = 	s -> (s.length() > 99);
        stream_from_function();
} }

