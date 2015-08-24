public class Calculator {
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
    
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath mult = (a,b) -> a * b ; 
        RealMath Ohms = (a,b ) -> (a - (2.0 * b))/0.02 ; // Voltage, # of LEDs
        
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
            
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction)); 
              
        System.out.println("20 * 10 = " +
            myApp.operateBinary(20, 10, mult));  
            
 int V = 10; // 10V  
 int LEDs = 4; // number of LEDs      - works for 0 to 4
        System.out.println("Resistor needed when V  = " + V + " and number of LEDs is " + LEDs + " is " +
            myApp.operateBinary(V, LEDs, Ohms));          // 10V , number of LEDs           
    }
}
