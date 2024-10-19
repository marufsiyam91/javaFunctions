package com.JavaFunctions;

import java.util.Scanner;

public class FindMInMax {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the last number: ");
        int c = in.nextInt();

        FindMinMax(a, b, c);
    }
    static void FindMinMax(int a, int b, int c) {

        int max = a;
        int min = a;

        if (b > max) {
            max = b;
        } if (c > max) {
            max = c;
        }

        if (b < min ) {
            min = b;
        }if (c < min) {
            min = c;
        }

        System.out.println(max);
        System.out.println(min);
    }

}
