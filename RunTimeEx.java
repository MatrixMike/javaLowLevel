/*
 * RTE1.java
 * 
 * Copyright 2017 Mike Hewitt <mikeh@mikeh-Inspiron-1501>
 * 
 */


		/**
 *
 * @author Piet
 */
//public class Opgave20 {
public class RunTimeEx {
    public static void main(String... args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        }
//        catch (IllegalArgumentException e) {
//            System.out.print("c");
//            try {
//                throw new RuntimeException("1");
//            }
//            catch (RuntimeException rte) {
//                System.out.println("\n" + rte + "\ncaught the RTE within that catch of the IAR!!!!");
//            }
////            throw new RuntimeException("1");
//        }
        catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        }
        catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        }
        finally {
//            System.out.print("e");
//            try {
//                throw new IllegalArgumentException("3");
//            }
//            catch (IllegalArgumentException e) {
//                System.out.println("\ncaught IllegalArgumentException in finally!!!");
//            }
            System.out.print("e\n");
            throw new IllegalArgumentException("3");
        }
    }
}


