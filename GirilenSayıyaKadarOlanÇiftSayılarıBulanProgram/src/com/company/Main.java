package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num,i,count = 0;
    Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        num = scan.nextInt();

        for (i = 0; i<=num; i=i+2){
            count++;
        }
        System.out.println("Toplamda "+count+" çift sayı vardır.");
    }
}
