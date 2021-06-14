/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex35;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Solution35 {
    public static String str;
    public static void main(String[] args) {
        System.out.println("Welcome\n");
        randomGame();

    }

    public static void randomGame(){
        ArrayList<String> names = new ArrayList<>();
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Enter a name : ");
            str = s.nextLine();
            names.add(str);
        }while(!str.isEmpty());
        names.remove(names.size() - 1);
        System.out.println("The winner is " + names.get(r.nextInt(names.size())));

        
    }

}
