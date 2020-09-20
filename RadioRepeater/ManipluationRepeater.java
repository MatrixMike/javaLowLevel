//package com.coders.location;

/*
 * 24.09.2015 19:02:45
 * 20.09.2020 13:14:28
 */
//package  PersonSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;

import java.util.function.*;
import java.lang.Double;

public class ManipluationRepeater { 

    public static void main(String... args) {

        // Create sample data

        List<Repeater1> roster = Repeater1.createRoster();

        System.out.println("Contents of roster:");

        roster
            .stream()
 //           .sorted()    // with zero arguments causes crash -> investigate proper usage
            .forEach(p -> p.printPerson());

        System.out.println();
//         Consumer<Repeater1> giveRaise = e -> e.setLatitude(e.getSalary() / 100 * 5 + e.getSalary());
        Consumer<Repeater1> giveRaise1 = e -> e.setLatitude(e.getLatitude()* 2 + e.getLatitude());
        roster.forEach(giveRaise1);        
        roster
            .stream()
 //           .sorted()    // with zero arguments causes crash -> investigate proper usage
            .forEach(p -> p.printRepeaterLatitude());
        Consumer<Repeater1> giveRaise2 = e -> e.setLatitude(e.getLatitude() / 100 * 5 + e.getLatitude());  
                roster.forEach(giveRaise2);
                roster
            .stream()
 //           .sorted()    // with zero arguments causes crash -> investigate proper usage
            .forEach(p -> p.printRepeaterLatitude());  
            
        // 2. Sum of ages with sum operation

        Integer totalAge = roster
            .stream()
            .mapToInt(Repeater1::getAge)
            .sum();

        System.out.println("Sum of ages (sum operation): " +
            totalAge);

        // 3. Sum of ages with reduce(identity, accumulator)

        Integer totalAgeReduce = roster
            .stream()
            .map(Repeater1::getAge)
            .reduce(
                0,
                (a, b) -> a + b);

        System.out.println(
            "Sum of ages with reduce(identity, accumulator): " +
            totalAgeReduce);

        // 4. Average of male members with collect operation

/*        Averager averageCollect = roster.stream()
            .filter(p -> p.getGender() == Repeater1.Sex.MALE)
            .map(Repeater1::getAge)
            .collect(Averager::new, Averager::accept, Averager::combine);
*/
 /* mike       System.out.println("Average age of male members: " +
            averageCollect.average());
 */
        // 5. Names of male members with collect operation

        System.out.println("Names of male members with collect operation: ");
        List<String> namesOfMaleMembersCollect = roster
            .stream()
      //      .filter(GenderMale)
            .map(p -> p.getName())
            .collect(Collectors.toList());

        namesOfMaleMembersCollect
            .stream()
            .forEach(p -> System.out.println(p));

        // 6. Group members by gender

        System.out.println("Members by gender:");
        Map<Repeater1.Sex, List<Repeater1>> byGender =
            roster
                .stream()
                .collect(
                    Collectors.groupingBy(Repeater1::getGender));

        List<Map.Entry<Repeater1.Sex, List<Repeater1>>>
            byGenderList =
            new ArrayList<>(byGender.entrySet());

        byGenderList
            .stream()
            .forEach(e -> {
                System.out.println("\nGender1: " + e.getKey());
                e.getValue()
                    .stream()
                    .map(Repeater1::getName)
                    .forEach(f -> System.out.println(f)); });

        // 7. Group names by gender

        System.out.println("\nNames by gender:");
        Map<Repeater1.Sex, List<String>> namesByGender =
            roster
                .stream()
                .collect(
                     Collectors.groupingBy(
                         Repeater1::getGender,
                         Collectors.mapping(
                             Repeater1::getName,
                             Collectors.toList())));

        List<Map.Entry<Repeater1.Sex, List<String>>>
            namesByGenderList =
                new ArrayList<>(namesByGender.entrySet());

        namesByGenderList
            .stream()
            .forEach(e -> {
                System.out.println("\nzGender: " + e.getKey());
                e.getValue()
                    .stream()
                    .forEach(f -> System.out.println(f)); });

        // 8. Total age by gender

        System.out.println("\nTotal age by gender:");
        Map<Repeater1.Sex, Integer> totalAgeByGender =
            roster
                .stream()
                .collect(
                     Collectors.groupingBy(
                         Repeater1::getGender,
                         Collectors.reducing(
                             0,
                             Repeater1::getAge,
                             Integer::sum)));

        List<Map.Entry<Repeater1.Sex, Integer>>
            totalAgeByGenderList =
            new ArrayList<>(totalAgeByGender.entrySet());

        totalAgeByGenderList
            .stream()
            .forEach(e ->
                System.out.println("Gender: " + e.getKey() +
                    ", Total Age: " + e.getValue()));

        // 9. Average age by gender

        System.out.println("Average age by gender:");
        Map<Repeater1.Sex, Double> averageAgeByGender =
            roster
                .stream()
                .collect(
                     Collectors.groupingBy(
                         Repeater1::getGender,
                         Collectors.averagingInt(Repeater1::getAge)));

        for (Map.Entry<Repeater1.Sex, Double> e : averageAgeByGender.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
