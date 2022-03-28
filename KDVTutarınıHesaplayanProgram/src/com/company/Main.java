package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double tutar,kdvlitutar,kdvOran;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ücreti giriniz: ");
        tutar = scan.nextInt();

        if(tutar >= 1000){
           kdvOran = 0.08;
        }
        else{
            kdvOran = 0.18;
        }
        kdvlitutar = tutar * kdvOran;
        tutar += kdvlitutar;

        System.out.println("KDV'li tutarı: " + tutar);

    }
}
