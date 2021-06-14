/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment2.Ex30;

public class Solution30 {

    public static void main(String[] args) {
        OutputMultiplicationTable();
    }



    public static void OutputMultiplicationTable() {
        final int tableNum = 12;

        for (int a = 1; a <= tableNum; a++) {
            for (int b = 1; b <= tableNum; b++) {
                System.out.print(addSpace(a * b) + " ");
            }
            System.out.println();
        }
    }

    public static String addSpace(int y)
    {
        String str = new String();
        if(y < 10) str = "  " + y;
        else if(y < 100) str = " " + y;
        else str = "" + y;
        return str;
    }
}