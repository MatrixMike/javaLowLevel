/*
 * run1.java
 * 
 * Copyright 2015 mike <mikeh@mikeh-OptiPlex-745>
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
 * 07.08.2015 17:08:16
 * 
 */

 public class run1 {
//	 public class RunnableTest {
   public static void main(String[] args) {
     
     System.out.println("=== RunnableTest ===");
     
     // Anonymous Runnable
     Runnable r1 = new Runnable(){
       
       @Override
       public void run(){
         System.out.println("Hello world one!");
       }
     };
     
    // Lambda Runnable
    Runnable r2 = () -> System.out.println("Hello world two!");
     
     // Run em!
     r1.run();
     r2.run();
     
   }
 }
/*

=== RunnableTest ===
Hello world one!
Hello world two!


*/

