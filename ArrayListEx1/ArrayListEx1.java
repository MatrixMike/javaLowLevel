import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String args[]){
		    String[] Dogs = {"Greyhounds","boxers","dobermans","Husky",
            "Labrador", "Chow Chow", " Beagle ",
            " Rottweiler ", " Doberman ", "Chihuahua",
            "husky",
            "bull dog","cavalier King Charles Spaniel",
            " Pit Bull ", "Pug", "Golden Retriever ",
            "German Shepherd", "Great Dane", "Boxer"};
    ArrayList<String> names = new ArrayList<String>(); 

    names.add("Bob");
    names.add("David");
    names.add("Cindy");  
    names.add("Amy");  
    Collections.sort(names);
    System.out.println("names " + names + "names end");
	String num = "22,33,44,55,66,77";
	String str[] = num.split(",");
	
		ArrayList<Integer> values = new ArrayList<>();
		Integer[] arrayn = { 30, 20, 10 };
//	List <Integer> Lint = {2,5,4,3,1};
	List<Integer> list2 = Arrays.asList(9,2,1,4,5,6) ;
	Collections.addAll(values,arrayn);
    Collections.addAll(values,12);
    Collections.sort(values);
    Collections
		.sort(list2);
//	list2.add(3);    // make this work
	System.out.println(values + "end1");
	System.out.println(list2 + "end2");
		System.out.println("start");	
    List<String> al =          /*new ArrayList<String>();*/ Arrays.asList(Dogs);
//	al.add("Donkey");			// make this work
//  ArrayList<String> al = Arrays.asList(Dogs);

		System.out.println(al);
				System.out.println("end2");
	Collections
//	.toUpperCase()
	.sort(al);
	        Collections.reverse (al);
	for(String s: al){
	   System.out.println(s);
	}
	System.out.println();
	for(String s: al){
	   System.out.println(s.trim().toUpperCase().toLowerCase());
	}
   }
}
