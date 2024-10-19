package com.JavaFunctions;

import java.util.Scanner;

public class FindArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 3 digit number:");
        int number = in.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            FindArmstrongNumber(number);
        }
    }

    static void FindArmstrongNumber (int n){

        int expectedNumber = 0;
        int base = n;

        for(int i = 1; base > 0; i++){
            int rem = base % 10;
            base = base / 10;

            expectedNumber += (rem * rem * rem);
        }

        if(expectedNumber == n){
            System.out.println("Yes the number is a Armstrong number");
        }else {
            System.out.println("Sorry it's not a Armstrong number");
        }

    }
}
