
/*
20.02.2020 16:55:18


*/

import java.util.List;
import java.util.ArrayList;

public class Reified4 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Hi");
    list.add("Mike");
    String x = list.get(0);
    System.out.println(x);
     x = list.get(1);
    System.out.println(x);
  }
}


/*
public class Reified1 {
	
public static void main (String[] args) {


*/
