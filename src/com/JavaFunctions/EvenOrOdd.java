package com.JavaFunctions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        findEvenorOdd(number);
    }

    static void findEvenorOdd(int a){
        if(a % 2 == 0){
            System.out.println("the given number is even");
        }else{
            System.out.println("the given number is odd");
        }
    }
}
