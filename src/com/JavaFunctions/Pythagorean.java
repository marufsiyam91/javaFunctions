package com.JavaFunctions;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter teh second number: ");
        int number2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = in.nextInt();

        isPythagoreanTriplet(number1,number2, number3);
    }

    static void isPythagoreanTriplet(int a, int b, int c){
        int first = a * a;
        int second = b * b;
        int third = c * c;

        if ((first + second == third) ||
                (first + third == second) ||
                (second + third == first)) {
            System.out.println("The numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers do not form a Pythagorean triplet.");
        }
    }
}
