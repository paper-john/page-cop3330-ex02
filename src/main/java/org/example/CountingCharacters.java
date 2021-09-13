/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

package org.example;

import java.util.Scanner;

public class CountingCharacters
{
    public static void main( String[] args )
    {
        System.out.println("What is the input string?"); // Gets user's input

        // creates a scanner and scans user's input
        Scanner scan = new Scanner(System.in);
        String getInput = scan.next();

        int length = getInput.length(); //length variable
        System.out.println(getInput+" has "+length+" characters."); //outputs user input and its length

    }
}
