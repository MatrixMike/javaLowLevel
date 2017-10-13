/*
 * StreamBuilders.java
 * 
 * Copyright 2017 mikeh <mikeh@mikeh-desktop>
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
/*
 * import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
*/
import java.util.stream.Collectors;
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 
import java.util.ArrayList;   // where from
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.Date;

public class StreamBuilders {
     public static void main(String[] args){
         Stream<Date> stream = Stream.generate(() -> { return new Date();});
         stream.forEach(p -> System.out.println(p))
//         		.limit(10)
// IntStream.range()
         ;
     }
}

