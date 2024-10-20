package com.JavaFunctions;

import java.util.Scanner;

public class SumandProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();

        FindSumandProduct(number1,number2);
    }

    static void FindSumandProduct(int a, int b){
        int sum = a + b;
        int product = a * b;

        System.out.println(sum);
        System.out.println(product);
    }
}
