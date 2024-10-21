package com.JavaFunctions;

import java.util.Scanner;

public class ReversedHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the half pyramid: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++){
            for(int j = rows; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
