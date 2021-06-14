/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex36;

public class Solution36 {
    public static void main(String[] args) {
        CalculatingStats stats = new CalculatingStats();
        stats.print();
        double print = stats.average();
        int print1 = stats.max();
        int print2 = stats.min();
        double print3 = stats.SD();
        String output = String.format("The average: %.0f\nThe max: %d\nThe min: %d\nThe standard deviation:%.2f",print,print1,
                print2,print3);
        System.out.println(output);


    }
}
