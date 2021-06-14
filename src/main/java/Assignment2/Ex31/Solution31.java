/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex31;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    private static double hr;
    private static int age;
        public static void main(String[] args) {
          Finding_HR();
        }



        public static void Finding_HR(){
            Scanner s = new Scanner(System.in);
            double rate;
            try {
                System.out.print("Enter your Age : ");
                age = s.nextInt();
                System.out.print("Enter your resting heart rate : ");
                hr = in.nextDouble();
                System.out.println("Resting Pulse : " + hr + "      Age : " + age);
                System.out.println("Intensity   | Rate");
                System.out.println("------------|----------");
                for (int i = 55; i <= 95; i += 5) {
                    rate = (((220 - age) - hr) * i/100) + hr;
                    System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
                }
            } catch(Exception e) {
                System.out.println("Enter only numbers...");
            }
        }
}
