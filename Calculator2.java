

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 


import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.LongStream;



public class Calculator2 {
  // 24.08.2015 15:25:35
    interface IntegerMath {
        int operation(int a, int b);   
    }
     interface RealMath {
        double operation(int a, int b);   
    }
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
     public double operateBinary(int a, int b, RealMath op) {
        return op.operation(a, b);
    }
    /*
    	public static void stream_from_function() { // Voltage constant but changing LEDs
		Stream.iterate(0, L -> L + 1)
		.limit(7)
		.skip(0)
	//	.filter(w -> (w % 5) == 0)
	.forEach(L -> System.out.println("Resistor needed when V  = " + 10 + " and number of LEDs is " + L + " is " +
            myApp.operateBinary(10, L, Ohms)));          // 10V , number of LEDs   
		//.forEach(System.out::println);
	}
*/

    public static void main(String... args) {
		int V 		= 14; 	// 14V  working car voltage
		int LEDs	= 4; 	// number of LEDs      - works for 0 to 4
        Calculator2 myApp = new Calculator2();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath mult = (a,b) -> a * b ; 
        RealMath 	Ohms = (a,b ) -> (a - (2.0 * b))/0.02 ; // Voltage, # of LEDs
      /*  hide these now that something useful is happening
        System.out.println("40 +  2 = " +myApp.operateBinary(40, 2, addition));          
        System.out.println("20 - 10 = " +myApp.operateBinary(20, 10, subtraction));              
        System.out.println("20 * 10 = " +myApp.operateBinary(20, 10, mult));  
      */     

    //    System.out.println("Resistor needed when V  = " + V + " and number of LEDs is " + LEDs + " is " +
    //        myApp.operateBinary(V, LEDs, Ohms));          // 10V , number of LEDs    
            
  //          stream_from_function();  
                
            Stream.iterate(0, L -> L + 1)
				.limit(9)			// how many LEDs 
				.skip(0)			// how many to ignore
				//	.filter(w -> (w % 5) == 0)
				.forEach(L -> System.out.println("Resistor needed when V  = " + V + " and number of LEDs is " + L + " is " +
				myApp.operateBinary(V, L, Ohms) + " Ohms"));          // 10V , number of LEDs   
		//.forEach(System.out::println); 
    }
}
