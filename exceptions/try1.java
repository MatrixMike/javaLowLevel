public class try1{
	public static void main(String[] args) {

    int pay=8,payda=0;  

    try {

        double result=pay/(double)payda; // if I cast any of the two variables, program does not recognize the catch block, why is it so?
        System.out.println(result);
        System.out.println("inside-try");

    } catch (Exception e) {

        System.out.println("division by zero exception");
        System.out.println("inside-catch");

    }
}
}
