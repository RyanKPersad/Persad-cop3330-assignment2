/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex39;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;



public class Solution39 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John|","Johnson|","Manager|",20161231),
                new Employee("Tou|","Xiong|","Software Engineer|",20161005),
                new Employee("Michaela|", "Michaelson|", "District Manager|", 20151219),
                new Employee("Jake|","Jacobson|","Programmer|",00000000),
                new Employee("Jackquelyn|", "Jackson|", "DBA|",00000000),
                new Employee("Sally|","Webber|","Web Developer|",20151218)
        };


        List<Employee> list = Arrays.asList(employees);


        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);



        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;


        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);


        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }

}


