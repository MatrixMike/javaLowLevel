/* * PropertiesTest.java * * Copyright 2015 Michael Hewitt
 <mikeh@electroteach.com> * * */

// 24 September 2015
// C:\Program Files\Java\jdk1.8.0_60\bin

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;	
import java.util.stream.Collectors.*; 

//import java.util.stream.Collectors;


public class PropertiesTest2 {
    public static void main(String[] args)
        throws Exception {

        // set up new properties object
        // from file "myProperties.txt"
        FileInputStream propFile =
            new FileInputStream( "myProperties.txt");
        Properties p =
            new Properties(System.getProperties());
        p.load(propFile);

        // set the system properties
//        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);
        System.out.println("user.name:" + System.getProperty("user.name"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("file.separator"));
                System.out.println(System.getProperty("mail.host"));

           System.out.println( Stream.of("Hi","JVM","Devs"));
               Stream<String> stream = Stream.of("Hi","JVM","Devs");
               String joined = stream.map(String::trim).collect(
            Collectors.joining("%"));
            		System.out.println(joined);
    }
}
