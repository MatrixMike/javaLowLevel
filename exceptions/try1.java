public class try1{
	public static void main(String[] args) {

    int  pay=8;  // payda=0;  
	double result = 2.2;
	for (int payda = 5; payda > -5 ; payda=payda-1) {
    try {

        result = pay/payda; // if I cast any of the two variables, program does not recognize the catch block, why is it so?
        System.out.println(payda + "  result 1  " + result );
        System.out.println("inside-try");

    } catch (Exception e) {

        System.out.println("division by zero exception " + "inside-catch");
        //System.out.println("inside-catch");

		}
		System.out.println(payda + "  result 2  " + result);
	}
}
}
