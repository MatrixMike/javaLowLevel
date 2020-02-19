/*
 * Reified1.java
 * https://www.quora.com/What-is-reification-in-Java
 * https://dev.to/cjbrooks12/kotlin-reified-generics-explained-3mie
 * https://dev.to/cjbrooks12/kotlin-reified-generics-explained-3mie
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Reified1 {
	
	public static void main (String[] args) {

 //Allocates an array of type String, so it is reified
String[] aStringArray = new String[10];
Integer[] mjhArray = new Integer[12];
/* class JavaClass {
    <T> List<T> getList() { ... }
}
*/

// List<String> list = new JavaClass().getList<String>();

//Allocates a list with no type, Java does not reify generic types

List<String> aStringList = new ArrayList<String>();

}
//	List<String> list = new JavaClass().getList<String>();		
	}

/* class JavaClass {
    <T> T getItemFromMap(Class<T> itemClass, String key) { 
        Object item = _map.get(key); // this is OK
        if(itemClass.isAssignableFrom(item.getClass())) { // this works
            return (T) item;
        }
        else {
            return null;
        }
    }
}
*/

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






