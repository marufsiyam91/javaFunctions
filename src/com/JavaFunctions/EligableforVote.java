package com.JavaFunctions;

import java.util.Scanner;

public class EligableforVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age here: ");
        int age = in.nextInt();

        EligibleForVoteOrNot(age);
    }
    static void EligibleForVoteOrNot(int age){
        if(age >= 18){
            System.out.println("you are now able to vote any candidate that you choose for.");
        }else{
            System.out.println("no! You are not eligible for giving vote.");
        }
    }
}
