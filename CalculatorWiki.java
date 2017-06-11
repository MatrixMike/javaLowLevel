/*
 * CalculatorWiki.java
 * https://en.wikipedia.org/wiki/Anonymous_function#Java
 */

public class CalculatorWiki {
    interface IntegerMath {
        int operation(int a, int b);

        default IntegerMath swap() {
          return (a, b) -> operation(b, a);
        }
        /*
          IntegerMath func() {
			return (a,b ) -> operation(2+b, a);
		}  */
    }

    private static int apply(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
    
    private static int apply2(int x, int y, IntegerMath  op2) {
		return op2.operation(x,y);
	}
	
    public static void main(String... args) {
        IntegerMath addition 	= (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath extrafun 	= (a, b) -> a * 2 - b;
        System.out.println("40 + 2 = " 		+ apply(40, 2, 	addition));
        System.out.println("20 - 10 = " 	+ apply(20, 10, subtraction));
        System.out.println("10 - 20 = " 	+ apply(20, 10, subtraction.swap())); 
        System.out.println("10 - 20 = !" 	+ apply(20, 10, extrafun));   
        System.out.println("10 - 20 = !" 	+ apply(20, 10, extrafun.swap()));  
    }
}

