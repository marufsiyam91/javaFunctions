package com.JavaFunctions;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = input.nextInt();
        int range = 20;

        for(int i = 1; i <= length; i++){

            for(int j = 1; j <= range; j++){
                if(i == 1 || i == length){
                    System.out.print("*");
                } else if (j == 1 || j == range) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
