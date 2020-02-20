/*
 * Reify2.java
 * 
 * Copyright 2020 Mikeh <mikeh@mikeh-Dell-DM051>
 * 
 * 
 * 
 */


public class Reify2 {
	



public static void Main()
{
  DescribeType(42);               // System.Int32
  DescribeType(42L);              // System.Int64
  DescribeType(DateTime.UtcNow);  // System.DateTime
}

 public static void DescribeType{<T>(T element)
{
  Console.WriteLine(typeof(T).FullName);
}
	}
}
/*
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


*/


