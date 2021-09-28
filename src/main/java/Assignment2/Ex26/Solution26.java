/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex26;

import java.util.Scanner;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    private static double balance;
    private static double APR;
    private static double payment;

    public static void main(String[] args) {
        PaymentCalculator pc = new PaymentCalculator();
        readInput();
        double result = pc.calculateMonthsUntilPaidOff(balance,APR,payment);
        String months = Output(result);
        System.out.println(months);

    }

    public static void readInput(){
        System.out.println("What is your balance?");
        balance = in.nextDouble();

        System.out.println("What is the APR on your card(as a percent)?");
        APR = in.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        payment = in.nextDouble();

    }
    public static String Output(Double ceil){
        String print1;
        print1 = String.format("It will take you %.0f months to pay off this card ",ceil);


        return print1;
    }
}
