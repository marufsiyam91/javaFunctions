package com.JavaFunctions;

import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        FindPrime(number);
    }

    static void FindPrime (int base){

        if(base <= 1){
            System.out.println("you have to provide bigger number than 1");
            return;
        }

        boolean primeOrNot = true;

        for(int i = 2; i < base; i++){
            if(base % i == 0){
                primeOrNot = false;
                break;
            }
        }

        if(primeOrNot){
            System.out.println(base + " is a prime number");
        }else {
            System.out.println(base + " is not a prime number");
        }
    }
}
