/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex32;

import java.util.Scanner;

public class Solution32 {
    private static int secretNumber;
    private static final Scanner in = new Scanner(System.in);
    private static int guess;

    public static void main(String[] args) {

        guessGame();

    }

    public static void guessGame() {
        secretNumber = (int) (Math.random() * 999 + 1);
        int total = 0, key;

        while (true) {

            total = 0;
            //prompt the user for output
            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key = in.nextInt();//read the data
            //check for difficulty level
            if (key == 1) //get random number
                secretNumber = (int) (Math.random() * 10 + 1);
            else if (key == 2) //get random number
                secretNumber = (int) (Math.random() * 100 + 1);
            else  //get random number
                secretNumber = (int) (Math.random() * 1000 + 1);
            //prompt the user for output
            System.out.print("I have my number. What's your guess?: ");
            do {
                guess = in.nextInt(); //read the data
                total++; //count the guess
                if (guess == secretNumber) {//prompt the user for output
                    System.out.println("You got it in " + total + "  guesses!");
                } else if (guess < secretNumber)//prompt the user for output
                    System.out.println("Too low. Guess again: ");
                else if (guess > secretNumber)//prompt the user for output
                    System.out.println("Too high. Guess again: ");

            } while (guess != secretNumber);
            //prompt the user for output
            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s = in.next().charAt(0);
            if (s == 'N' || s == 'n')
                break;
        }

    }
}

