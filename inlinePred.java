/*
 * inlinePred.java
 * 
 * 
 * 
 */
//import static PersonPredicate;
import PersonPredicate;


public class inlinePred {
List<Person> getAdultMales (List<Person> persons) {
  return persons.stream().filter(
    isAdultMale()
  ).collect(Collectors.<Person>toList());
}	
	public static void main (String[] args) {
		
	}
}

