/*
 * Reified1.java
 * Reification - retaining types at run-time
 * https://www.quora.com/What-is-reification-in-Java
 * https://dev.to/cjbrooks12/kotlin-reified-generics-explained-3mie
 * https://www.geeksforgeeks.org/data-types-in-java/
 * https://www.dreamincode.net/forums/topic/143407-writing-a-getlist-method/
 * https://stackoverflow.com/questions/31876372/what-is-reification/31876747
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;


/*
The two categories of types are primitive types and reference types. 
* There is also a null type. 
* The primitive types are boolean, byte, short, int, long, char, float, and double.
*  The reference types are classes, interfaces, and arrays.
*/
public class Reified1 {
	
public static void main (String[] args) {

 //Allocates an array of type String, so it is reified
String[] aStringArray = new String[10];
Integer[] mjhArray = new Integer[12];
//Int[] mjhArrayC = new Int[12];
Boolean[] mjhArrayB = new Boolean[12];
ArrayList<String> listm = new ArrayList<>();	
Vector< String > vect = new Vector< String >();

/*
 class JavaClass {
    <T> List<T> getList() { return listm; }
}
*/

//Allocates a list with no type, Java does not reify generic types

List<String> aStringList = new ArrayList<String>();
List<Integer> anIntegerList = new ArrayList<Integer>();
}
//Method mtd = vect.getClass().getMethod("add",Object.class);
//mtd.invoke(vect, new Date()); 
//	List<String> list = new JavaClass().getList<String>();		
	}

 class JavaClass {
    <T> T getItemFromMap(Class<T> itemClass, String key) { 
/*        Object item = _map.get(key); // this is OK
        if(itemClass.isAssignableFrom(item.getClass())) { // this works
            return (T) item;
        }
        else {
        */
            return null;
     //   }
    }
}
 // List<String> list = new JavaClass().getList<String>();

/* inline fun <reified T> getItemFromMap(String key) { 
    val item = _map.get(key)
    if(T::class.java.isAssignableFrom(item.getClass())) {
        return (T) item
    }
    else {
        return null;
    }
}

*/






