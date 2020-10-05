//package com.coders.location;

/*
 * Repeater1.java
 * Copyright 2020 Michael <mikeh@mikeh-K52N>
 */

import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Repeater1 {

    public enum Sex {
        MALE, FEMALE  // could use this as UHF VHF indicator
    }
    public enum LOS_Band {  // Line of Sight Band
        VHF, UHF  // could use this as UHF VHF indicator
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    Double latitude;
    Double longitude;
    String callsign;
    Integer range;    // distance in metres from current location

    Repeater1(String nameArg, LocalDate birthdayArg,
        Sex genderArg, String emailArg   , String callsignArg , Double latitudeArg, Double longitudeArg, Integer rangeArg ) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
        callsign = callsignArg;
        latitude = latitudeArg;
        longitude = longitudeArg;
        range = rangeArg;

    }

    public int getAge() {
        return birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }

    public void printPerson() {
      System.out.println(name + ", " + this.getAge());
    }

    public void printRepeaterLatitude() {
      System.out.println(callsign + ", " + this.getLatitude());
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
  * @return gender
  */
           /*public LOS_Band getLOSBand() {
                 return LOSBand;
    }                                   */

/*
  *
  * @return name
  */
    public String getName() {
        return name;
    }

/*
  *
  * @return callsign
  */
    public String getCallsign() {
        return callsign;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
    public Integer getRange() {
        return range;
    }
    public void printRange() {
      System.out.println(callsign + ", " + this.getRange());
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

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLatitude() {
        return latitude;
    }

    public static int compareByAge(Repeater1 a, Repeater1 b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Repeater1> createRoster() {

        List<Repeater1> roster = new ArrayList<>();

        roster.add(
            new Repeater1(
            "QTHR",
            IsoChronology.INSTANCE.date(2020, 9, 20),
            Repeater1.Sex.MALE,
            "fred@example.com",
            "QTHR",
            1.1,
            2.2,
            0));

        roster.add(
            new Repeater1(
            "VK3RMH",
            IsoChronology.INSTANCE.date(1980, 9, 20),
            Repeater1.Sex.MALE,
            "fred@example.com"
            ,"VK3RMH",
            1.1,
            2.2,
            0));


        roster.add(
            new Repeater1(
            "VK3RGL",
            IsoChronology.INSTANCE.date(1980, 9, 20),
            Repeater1.Sex.MALE,
            "fred@example.com",
            "VK3RGL",
            1.1,
            2.2,
            0));

        roster.add(
            new Repeater1(
            "VK3RMM",
            IsoChronology.INSTANCE.date(1980, 6, 20),
            Repeater1.Sex.MALE,
            "fred@example.com",
            "VK3RMM",
            -37.3896290,
            144.5960390,
            0));

        roster.add(
            new Repeater1(
            "Jane",
            IsoChronology.INSTANCE.date(1990, 7, 15),
            Repeater1.Sex.FEMALE, "jane@example.com",
            "Jane",
            1.1,
            2.2,
            0));
/*
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
            *
            roster.add(
            new Repeater1(
            "Mike",
            IsoChronology.INSTANCE.date(1955,11,1),
            Repeater1.Sex.MALE, "mike@electroteach.com"));
*/
        return roster;
    }

}


