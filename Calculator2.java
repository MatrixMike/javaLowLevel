
/*
27.08.2015 16:53:04
* 17.09.2015 10:31:14
Mods to an example from Oracle by mike hewitt
This generates a stream of resistor values for a constant Voltage across a series of LEDS
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors.*; 
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.TreeMap;


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

    public static void main(String... args) {
		int V 		= 15; 	// 14V  working car voltage
		double LEDv	= 2.0;
		double MaxLEDi = 0.02;
		//int LEDs	= 4; 	// number of LEDs      - works for 0 to 4
        Calculator2 myApp = new Calculator2();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath mult = (a,b) -> a * b ; 

//        RealMath 	Ohms = (a,b) -> (a - (2.0 * b))/0.02 ; // Voltage, # of LEDs        
        RealMath 	Ohms = (a,b) -> (a - (LEDv * b))/MaxLEDi ; // Voltage, # of LEDs
			// 2.0 = Voltage across each LED and 0.02 is max permitted current through each LED
			
      /*  hide these now that something useful is happening
        System.out.println("40 +  2 = " +myApp.operateBinary(40, 2, addition));          
        System.out.println("20 - 10 = " +myApp.operateBinary(20, 10, subtraction));              
        System.out.println("20 * 10 = " +myApp.operateBinary(20, 10, mult));  
      */     
                         
            Stream.iterate(0, LEDs -> LEDs + 1)
				.limit(10)			// how many LEDs to try 
				.skip(0)			// how many to ignore
				//	.filter(w -> (w % 5) == 0)
				.forEach(LEDs -> System.out.println("Resistor needed when V  = " + V + " and number of LEDs is " + LEDs + " is " +
				myApp.operateBinary(V, LEDs, Ohms) + " Ohms"));          // 14V , number of LEDs   
		//.forEach(System.out::println); 
    }
}
