package com.pluralsight;

import java.util.Scanner;

public class Main {


    /*https://programmingbydoing.com/
    Adding values in a loop - Assignment #55
     */

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.println( "I will add up the numbers you give me. Enter 0 to stop." );

        int n = keyboard.nextInt();
        int total = 0;

        while ( n != 0)
        {
            total += n;
            System.out.println("The total so far is: " + total);
            n = keyboard.nextInt();
        }

        System.out.println("The total is: " + total);

    }
}
