/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex24;

import java.util.Scanner;

public class Solution24 {

    private static final Scanner in = new Scanner(System.in);
    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        //Read data
        readInput();
        Anagram ad = new Anagram();
        boolean result = ad.find_anagram(word1,word2);

        String Output = GenerateOutput(result);

        System.out.println(Output);
    }

    public static void readInput(){
      System.out.println("Enter the first word:");
      word1 = in.nextLine();

      System.out.println("Enter the second word:");
      word2 = in.nextLine();

    }

    public static String GenerateOutput(Boolean isAnagram){

        if (isAnagram) {
            return String.format("\"%s\" and \"%s\" are anagrams",word1,word2);
        }else{
            return String.format("\"%s\" and \"%s\" are not anagrams",word1,word2);
        }


    }


}
