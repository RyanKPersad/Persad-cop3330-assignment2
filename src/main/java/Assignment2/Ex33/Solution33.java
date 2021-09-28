package Assignment2.Ex33;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
import java.util.Scanner;
import static Assignment2.Ex33.Magic8Ball.get8BallAnswers;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            magic8Ball();

            System.out.println("Do you want to try again, yes or no?");

            if (in.nextLine().toLowerCase().contains("n")) {
                System.out.println("Goodbye");
                break;
            }
        }

    }

    private static void magic8Ball() {

        System.out.println("Please ask me a question.");
        in.nextLine();

        System.out.println(get8BallAnswers(new Random().nextInt(get8BallAnswers().length)));
    }


}
