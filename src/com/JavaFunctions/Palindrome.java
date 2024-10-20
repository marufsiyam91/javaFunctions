package com.JavaFunctions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        CheckPalindrome(number);

        in.close();
    }

    static void CheckPalindrome(int num){

        int baseNumber = num;

        int reversedNumber = 0;
        for(int i = 1; baseNumber > 0; i++){
            int rem = baseNumber % 10;


            reversedNumber = (reversedNumber * 10) + rem;

            baseNumber = baseNumber / 10;
        }
        if (reversedNumber == num) {
            System.out.println("The provided number " + num + " is a palindrome.");
        } else {
            System.out.println("The provided number " + num + " is not a palindrome.");
        }
    }
}
