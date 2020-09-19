/*
 * Repeater1.java
 * 
 * Copyright 2020 Michael <mikeh@mikeh-K52N>
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


//package  PersonSorter;


import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Repeater1 {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    Double latitude;
    Double longitude;
    String callsign;

    Repeater1(String nameArg, LocalDate birthdayArg,
        Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }

    public int getAge() {
        return birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }

    public void printPerson() {
      System.out.println(name + ", " + this.getAge());
    }
/*
  *
  * @return gender
  */
    public Sex getGender() {
        return gender;
    }
/*
  *
  * @return name
  */
    public String getName() {
        return name;
    }
/*
  *
  * @return emailAddress
  */

    public String getEmailAddress() {
        return emailAddress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Repeater1 a, Repeater1 b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Repeater1> createRoster() {

        List<Repeater1> roster = new ArrayList<>();

        roster.add(
            new Repeater1(
            "VK3RMH",
            IsoChronology.INSTANCE.date(1980, 6, 20),
            Repeater1.Sex.MALE,
            "fred@example.com"));
        

        roster.add(
            new Repeater1(
            "VK3RGL",
            IsoChronology.INSTANCE.date(1980, 6, 20),
            Repeater1.Sex.MALE,
            "fred@example.com"));
            
        roster.add(
            new Repeater1(
            "Fred",
            IsoChronology.INSTANCE.date(1980, 6, 20),
            Repeater1.Sex.MALE,
            "fred@example.com"));
            
        roster.add(
            new Repeater1(
            "Jane",
            IsoChronology.INSTANCE.date(1990, 7, 15),
            Repeater1.Sex.FEMALE, "jane@example.com"));
        roster.add(
            new Repeater1(
            "George",
            IsoChronology.INSTANCE.date(1991, 8, 13),
            Repeater1.Sex.MALE, "george@example.com"));
        roster.add(
            new Repeater1(
            "Bob",
            IsoChronology.INSTANCE.date(2000, 9, 12),
            Repeater1.Sex.MALE, "bob@example.com"));
            roster.add(
            new Repeater1(
            "Mike",
            IsoChronology.INSTANCE.date(1955,11,1),
            Repeater1.Sex.MALE, "mike@electroteach.com"));

        return roster;
    }

}


