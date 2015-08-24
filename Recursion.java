//package lambdasinaction.chap13;

import java.util.stream.LongStream;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));
        System.out.println("mjh "+ factorialStreamsMJH(5));
        System.out.println(factorialTailRecursive(5));
        
                System.out.println(factorialStreamsB(5));
    }

    public static int factorialIterative(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r*=i;
        }
        return r;
    }

    public static long factorialRecursive(long n) {
        return n == 1 ? 1 : n*factorialRecursive(n-1);
    }
    
    public static long factorialStreamsMJH(long n){
	//	StringBuilder sb = new StringBuilder;
        return LongStream.rangeClosed(1, 31)
     
	//	.filter( w -> (w % 2) ==1  )  // filter out those numbers from the modulus 
		.filter( w -> (w % 3) ==0  )  // pass through  Fizz 3
		.filter( w -> (w % 5) ==0  )  // pass through  Buzz 5  thus together finds FizzBuzz
//		.collect(Collector.toList());
        //.skip(3)
        .reduce(0, (long a, long b) -> a + b);
      //  System.out.print( "number " + n);
    }
    /*
      public static int factorialStreamsMJHb(long n){
        return LongStream.rangeClosed(1, 5)
     
		//.removeIf(  (n % 2) =0  )
        //.skip(3)
        .reduce(0, (int a, int b) -> a + b);   // objects to int
    } 
    */
     
    public static long factorialStreams(long n){
        return LongStream.rangeClosed(1, n)
                         .reduce(1, (long a, long b) -> a * b);
    }
    public static long factorialStreamsB(long n){					// mike
        return LongStream.rangeClosed(1, n)

                         .reduce(1, (long a, long b) -> a * b);
    }

    public static long factorialTailRecursive(long n) {
        return factorialHelper(1, n);
    }

    public static long factorialHelper(long acc, long n) {
        return n == 1 ? acc : factorialHelper(acc * n, n-1);
    }
}
/*
120
120
mjh 60
120
20

*/
