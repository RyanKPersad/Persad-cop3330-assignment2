/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex27;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);
    private static String name;
    private static String lastname;
    private static String Id;
    private static String Zipcode;
    static TestInput VI = new TestInput();

    public static void main(String[] args) {
        readInputs();
        Validate_inputs();

    }


    public static void Validate_inputs(){
        int value1 = VI.Validate_name(name);
        String answer1 = GenerateOutput_for_name(value1);
        int value2 = VI.Validate_lastname(lastname);
        String answer2 = GenerateOutput_for_lastname(value2);
        int value3 = VI.Validate_ID(Id);
        String answer3 = GenerateOutput_for_ID(value3);
        int value4 = VI.validate_zipcode(Zipcode);
        String answer4 = GenerateOutput_for_Zipcode(value4);
        System.out.println(answer1+"\n"+answer2+"\n"+answer3+"\n"+answer4);

    }

    public static void readInputs(){
        System.out.println("Enter the first name:");
        name = in.nextLine();

        System.out.println("Enter the last name:");
        lastname = in.nextLine();

        System.out.println("Enter the ID number:");
        Id = in.nextLine();

        System.out.println("Enter the zipcode:");
        Zipcode = in.nextLine();

    }



    public static String GenerateOutput_for_name(int result){
        String output1;
        if (result == 1){
            output1 = "";
        }else{

            output1 = "The first name must be at least 2 characters long.";
        }

        return output1;
    }
    public static String GenerateOutput_for_lastname(int result) {
        String output1;
        if (result == 1) {
            output1 = "";
        } else {

            output1 = "The last name must be at least 2 characters long.";
        }

        return output1;
    }
    public static String GenerateOutput_for_ID(int result){
        String output1;
        if (result == 1){
            output1 = "";
        }else{

            output1 = "The id must be in the format of AA-1234.";
        }

        return output1;
    }
    public static String GenerateOutput_for_Zipcode(int result){
        String output1;
        if (result == 1){
            output1 = "There are no other errors";
        }else{

            output1 = "The zipcode must be a 5 digit number.";
        }

        return output1;
    }


}
