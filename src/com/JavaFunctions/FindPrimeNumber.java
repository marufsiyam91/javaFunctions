package com.JavaFunctions;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number from where you want to start finding the prime number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the number where you want to finish finding prime numbers: ");
        int lastNumber = input.nextInt();

        if(firstNumber > lastNumber){
            System.out.print("the last number should bigger than the first one");
        } else if (firstNumber <= 1) {
            System.out.print("you have to provide a bigger number than 1 for first number");
        } else {
            findAllPrimeNumbers(firstNumber, lastNumber);
        }

        input.close();

    }

    static void findAllPrimeNumbers(int start, int end){
        for(int i = start; i <= end; i++){

            boolean isPrime = true;

            for(int j = 2; j <= Math.sqrt(i); j++){
                isPrime = true;
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i + " is a prime number");
            }
        }
    }
}
