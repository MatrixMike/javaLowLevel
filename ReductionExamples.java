/*
 * 24.09.2015 19:02:45
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

import java.util.ArrayList; 
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java.util.function.*;
import java.lang.Double;

public class ReductionExamples {

    public static void main(String... args) {
        
        // Create sample data

        List<Person1> roster = Person1.createRoster();
    
        System.out.println("Contents of roster:");
        
        roster
            .stream()
        //    .sorted()    // with zero arguments causes crash
            .forEach(p -> p.printPerson());

        System.out.println();

        // 1. Average age of male members, average operation
        
        double average = roster
            .stream()
            .filter(p -> p.getGender() == Person1.Sex.MALE)
            .mapToInt(Person1::getAge)
            .average()
            .getAsDouble();
            
        System.out.println("Average age (bulk data operations): " +
            average);
        
        // 2. Sum of ages with sum operation
        
        Integer totalAge = roster
            .stream()
            .mapToInt(Person1::getAge)
            .sum();
            
        System.out.println("Sum of ages (sum operation): " +
            totalAge);
        
        // 3. Sum of ages with reduce(identity, accumulator)
        
        Integer totalAgeReduce = roster
            .stream()
            .map(Person1::getAge)
            .reduce(
                0,
                (a, b) -> a + b);
            
        System.out.println(
            "Sum of ages with reduce(identity, accumulator): " +
            totalAgeReduce);
         
        // 4. Average of male members with collect operation
 /* mike        
        Averager averageCollect = roster.stream()
            .filter(p -> p.getGender() == Person1.Sex.MALE)
            .map(Person1::getAge)
            .collect(Averager::new, Averager::accept, Averager::combine);
   */                
 /* mike       System.out.println("Average age of male members: " +
            averageCollect.average());
 */        
        // 5. Names of male members with collect operation

        System.out.println("Names of male members with collect operation: ");         
        List<String> namesOfMaleMembersCollect = roster
            .stream()
            .filter(p -> p.getGender() == Person1.Sex.MALE)
            .map(p -> p.getName())
            .collect(Collectors.toList());         

        namesOfMaleMembersCollect
            .stream()
            .forEach(p -> System.out.println(p));
             
        // 6. Group members by gender
         
        System.out.println("Members by gender:");
        Map<Person1.Sex, List<Person1>> byGender =
            roster
                .stream()
                .collect(
                    Collectors.groupingBy(Person1::getGender));
                
        List<Map.Entry<Person1.Sex, List<Person1>>>
            byGenderList = 
            new ArrayList<>(byGender.entrySet());
            
        byGenderList
            .stream()
            .forEach(e -> {
                System.out.println("\nGender: " + e.getKey());
                e.getValue()
                    .stream()
                    .map(Person1::getName)
                    .forEach(f -> System.out.println(f)); });
         
        // 7. Group names by gender
         
        System.out.println("\nNames by gender:");
        Map<Person1.Sex, List<String>> namesByGender =
            roster
                .stream()
                .collect(
                     Collectors.groupingBy(
                         Person1::getGender,                      
                         Collectors.mapping(
                             Person1::getName,
                             Collectors.toList())));
                     
        List<Map.Entry<Person1.Sex, List<String>>>
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
        Map<Person1.Sex, Integer> totalAgeByGender =
            roster
                .stream()
                .collect(
                     Collectors.groupingBy(
                         Person1::getGender,                      
                         Collectors.reducing(
                             0,
                             Person1::getAge,
                             Integer::sum)));
                
        List<Map.Entry<Person1.Sex, Integer>>
            totalAgeByGenderList = 
            new ArrayList<>(totalAgeByGender.entrySet());
                     
        totalAgeByGenderList
            .stream()
            .forEach(e -> 
                System.out.println("Gender: " + e.getKey() +
                    ", Total Age: " + e.getValue()));
             
        // 9. Average age by gender
         
        System.out.println("Average age by gender:");
        Map<Person1.Sex, Double> averageAgeByGender =
            roster
                .stream()
                .collect(
                     Collectors.groupingBy(
                         Person1::getGender,                      
                         Collectors.averagingInt(Person1::getAge)));
                 
        for (Map.Entry<Person1.Sex, Double> e : averageAgeByGender.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
