package com.JavaFunctions;

import java.util.Scanner;

public class SumofnNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            calculateSumOfN(number);
        }

        input.close();
    }

    static void calculateSumOfN(int number){
        int result = (number * (number + 1)) / 2;

        System.out.println("The sum of the first " + number + " natural numbers is: " + result);
    }
}
