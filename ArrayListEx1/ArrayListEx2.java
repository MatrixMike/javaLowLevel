import java.util.ArrayList;
import java.util.List;
//  import java.util.Arrays;
public class ArrayListEx1 {
    public static void main(String args[]){
		    String[] Dogs = {"Greyhounds","boxers","dobermans","Husky",
            "Labrador", "Chow Chow", " Beagle ",
            " Rottweiler ", " Doberman ", "Chihuahua",
            "bull dog","cavalier King Charles Spaniel",
            " Pit Bull ", "Pug", "Golden Retriever ",
            "German Shepherd", "Great Dane", "Boxer"};
            
	String num = "22,33,44,55,66,77";
	String str[] = num.split(",");
//  https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/	
	List<String> al2 = new ArrayList<String>();
	al2 = java.util.Arrays.asList(Dogs);    // using fully qualified name before working in Android App
//	al2.add("cat");
	
/*	for(String s: al2){
	   System.out.println(s.trim().toLowerCase());
	}
	*/
   }
}
