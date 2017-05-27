

import java.util.stream.Stream;
import java.util.stream.Collectors.*;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;


public class PredicateTest1 {

		public static void stream_from_function() {
		Stream.iterate(0, n -> n + 1)
		.limit(15)
	//	.skip(2)
	//	.filter(w -> (w % 5) == 0)
	//	.forEach(System.out::println);
				.forEach(System.out::print);
	}

	public static void main (String args[]) {
		Predicate <String> gr99 = 	s -> (s.length() > 99);
		Predicate <Integer> fizz = 	i -> (i / 3 == 0 );
		Predicate <Integer> buzz = 	i -> (i / 5 == 0 );
         stream_from_function();

	}
	}

