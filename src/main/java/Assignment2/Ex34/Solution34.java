/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex34;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {

    public static void main(String[] args) {
        System.out.println("This is the list of employees");
        output();

    }
    public static void output() {


        ArrayList<String> names=new ArrayList();
        People p = new People();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        for (int i = 0; i < names.size();i++)
        {
            System.out.println(names.get(i));
        }
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter the name to delete");
        String del=in.nextLine();
        p.removeName(names,del);
        for (int i = 0; i < names.size();i++)
        {
            System.out.println(names.get(i));
        }
    }
    }








