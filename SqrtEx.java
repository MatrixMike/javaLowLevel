public class SqrtEx {
    public static void main(String... args) {
        System.out.println("a");
        Double x = 1.1;
        
      if (Double.isNaN(Math.sqrt(-5.0))) {
          System.out.println("c");      // throw exception
		}
        System.out.println("b");
        
		if (x >= 0.0) {
			System.out.println(Math.sqrt(-5.0));
		} else {
			throw new ArithmeticException("Square root from negative numbers is not defined!");
}        
/*        
        try {
            System.out.println(Math.sqrt(5.0));
            
        } catch (ArithmeticException ble) {
		System.err.println("Couldn't insert initial text.");	
        
	}
*/
}
}
	
