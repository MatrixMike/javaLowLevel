import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;

import java.time.OffsetDateTime;

import java.time.OffsetTime;

import java.time.ZonedDateTime;

import java.time.format.DateTimeFormatter;

 

public class  ZonedDate {  //   DateTimeFormatterFormatExample {  // 

    

    static void print(String type, String result) {

        System.out.printf("%s: %s\n", type, result);

    }

    

    public static void main(String[] args) {

        // LocalDate

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMM yyyy");

        print("LocalDate", formatter1.format(LocalDate.now()));

 

        // LocalDateTime

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

        print("LocalDateTime", formatter2.format(LocalDateTime.now()));

 

        // LocalTime

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("hh:mm:ss.SSS a");

        print("LocalTime", formatter3.format(LocalTime.now()));

        

        // OffsetDateTime

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a");

        print("OffsetDateTime", formatter4.format(OffsetDateTime.now()));

        

        // OffsetTime

        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("hh:mm:ss a xx");

        print("OffsetTime", formatter5.format(OffsetTime.now()));

        

        // ZonedDateTime

        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");

        print("ZonedDateTime", formatter6.format(ZonedDateTime.now()));

    }

}
