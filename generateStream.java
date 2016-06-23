/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package generatestream;
/**
 *
 * @author MikeW7
 */
/**
 * @param args the command line arguments
 */
/* public static void main(String[] args) {
 System.out.println("test");
 // TODO code application logic here
 }
 */
/*
 * generateStream.java
 * 24.08.2015 22:40:01
 * 16.06.2016   moved in from geany to Netbeans on Win7
compiled, execute and source/format (pretty print)
 *
 */
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
*/
import java.util.stream.Stream;
/*
import java.util.stream.Collectors.*;
*/
//	private static class 4parms(int a, int b,int c,int d) {
//	}
 class generateStream {

    public static void stream_from_function() {
        Stream.iterate(0, n -> n + 3)
                .limit(35)
                .skip(2)
                .filter(w -> (w % 5) == 0)
                .forEach(System.out::println);
    }

    public static void main(String args[]) {
        stream_from_function();
    }
}
