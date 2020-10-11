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
            
	String num = "22,33,44,55,66,77";
	String str[] = num.split(",");
	
	List<String> al = new ArrayList<String>();
	al = Arrays.asList(Dogs);
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
