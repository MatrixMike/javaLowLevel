/*
 * ListObj1.java
 * 
 * Copyright 2020 Mike <mikeh@mikeh-OptiPlex-745>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class ListObj1 {
	
	public static void main (String[] args) {
	List<Object> list = new ArrayList<Object>();

list.add("some value");
list.add(3);

for(Object obj : list)
{
    Class<?> clazz = obj.getClass();

 //   Field field = org.springframework.util.ReflectionUtils.findField(clazz, "value");
 //   org.springframework.util.ReflectionUtils.makeAccessible(field);

    System.out.println("value=" + field.get(obj));
}	
	}
}

