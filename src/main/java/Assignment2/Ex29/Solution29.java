/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */

package Assignment2.Ex29;

import java.util.Scanner;

public class Solution29 {
    private static String Rate_Return;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        InvestmentReturn IR = new InvestmentReturn();
        ReadInput();
        double result = IR.investment(Rate_Return);
        String output = String.format("It will take you %.0f years to make a return on investment",result);
        System.out.println(output);

    }

    public static void ReadInput(){
        System.out.println("Enter the rate of return:");
         Rate_Return = in.nextLine();
        while (Rate_Return.matches("[0]+")||Rate_Return.matches("[a-zA-Z]+")){
            System.out.println("ERROR ERROR please input number");
            System.out.println("Enter the rate of return:");
            Rate_Return = in.nextLine();
        }

    }


}
