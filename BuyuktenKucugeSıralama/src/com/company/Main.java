package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second = scan.nextInt();
        System.out.print("Enter the third number: ");
        int third = scan.nextInt();

        if(first > second && first > third){
            System.out.println("The largest number is the first number, "+ first);
        }else if(second > third){
            System.out.println("The largest number is the second number, " + second);
        }else{
            System.out.println("The largest number is the third number, " + third);
        }


    }
}
