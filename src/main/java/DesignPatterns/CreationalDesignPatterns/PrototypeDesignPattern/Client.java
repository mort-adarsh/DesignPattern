package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------");

        List<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("Science");

        HumanPrototype prototype1 = new Student(123,"Adarsh", courses);
        HumanPrototype prototype2 = prototype1.clone();

        System.out.println("protoType1:- " +prototype1);
        System.out.println("protoType2:- " +prototype2);

        System.out.println("-------------------------------------------------------------------------------");

        ((Student) prototype2).setName("Not Adarsh");
        ((Student) prototype2).getCourses().add("History"); // This will affect prototype1 in shallow copy

        System.out.println("protoType1:- " +prototype1);
        System.out.println("protoType2:- " +prototype2);

        System.out.println("-------------------------------------------------------------------------------");

        HumanPrototype prototype3 = prototype1.clone2();
        ((Student) prototype3).setName("Definitely Not Adarsh");
        ((Student) prototype3).getCourses().remove("Math");
        System.out.println("protoType1:- " +prototype1);
        System.out.println("protoType3:- " +prototype3);

        System.out.println("-------------------------------------------------------------------------------");

    }
}
