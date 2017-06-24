//  package example1;

import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;

/**
 *
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Predicate <String> playerP = (player) -> System.out.print(player + ";PB "); 
// oops it is a lambda expression a.o.t. filter


   List<String> list = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

    List<String> newList = list.stream()
        .map(String::toLowerCase)
    //    .map(String::toUpperCase)
        .collect(Collectors.toList());
   //             .collect(Collectors.joining("-"));
		newList.forEach(System.out::print);
		
        System.out.println("");
//============
   List<String> list1 = Arrays.asList(
        "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

    String merged = list1.stream()
        .skip(1)
        .limit(4)
        .collect(Collectors.joining("-"));
    System.out.println(merged);
//============
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};
        List<String> players =  Arrays.asList(atp);

        // Old looping
        for (String player : players) {
            System.out.print(player + "; ");
        }

        System.out.println("");

        // Using lambda expression and functional operations
        players.forEach((player) -> System.out.print(player + ";PB "));

        System.out.println("");

        // Using double colon operator in Java 8
        players.forEach(System.out::println);

        System.out.println("");

        // Using anonymous innerclass
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world ! Four");
            }
        }).start();

        // Using lambda expression
        new Thread(() -> System.out.println("Hello world ! Three")).start();

        // Using anonymous innerclass
        Runnable race1 = new Runnable() {
            @Override   // compiles with or w/o this so what is the point
            public void run() {
                System.out.println("Hello world ! Two   Annonymous Inner class");
            }
        };

        // Using lambda expression
        Runnable race2 = () -> System.out.println("Hello world ! One");

        // Run em!
        race1.run();
        race2.run();
    }

}
