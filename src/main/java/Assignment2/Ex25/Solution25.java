/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex25;
import java.util.Scanner;

public class Solution25{
    private static final Scanner in = new Scanner(System.in);
    private static String pass;

    public static void main(String[] args) {
        readInput();
       PasswordValidator pv = new PasswordValidator();
       int value = pv.password_strength(pass);
       String answer = GenerateOutput(value);
       System.out.println(answer);

    }


    public static void readInput(){
        System.out.println("Enter a password to test:");
        pass = in.nextLine();

    }
    public static String GenerateOutput(int test){
        String output;
        if(test == 1){
             output = "This is a very strong password";
        }else if(test == 2){
             output = "This is a strong password";
        }else if(test == 3){
            output = "This is a weak password";
        }else {
             output = "This is a very weak password";
        }
        return output;
    }


}
