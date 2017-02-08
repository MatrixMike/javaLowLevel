/*
 * MathTest1.java
 * 
 * Copyright 2017 Michael Hewitt <mikeh@electroteach.com>
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


public class MathTest1 {

   public static void main(String args[]) {
      double degrees = 45.0;
      double radians = Math.toRadians(degrees);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));
      // get two double numbers numbers
   double x = 9;
   double y = 25;

   // print the square root of these doubles
   System.out.println("Math.sqrt(" + x + ")=" + Math.sqrt(x));
   System.out.println("Math.sqrt(" + y + ")=" + Math.sqrt(y));
   }
}
