
/*
20.02.2020 16:55:18


*/

import java.util.List;
import java.util.ArrayList;

public class Reified4 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    List<Integer> listm = new ArrayList<Integer>();
    list.add("Hi");
    list.add("Mike");
    listm.add(9);
    listm.add(21);
    String x = list.get(0);
    Integer i = listm.get(1);
    System.out.println(i);
    System.out.println(x);
     x = list.get(1);
    System.out.println(x);
  }
}


/*
public class Reified1 {
	
public static void main (String[] args) {


*/
