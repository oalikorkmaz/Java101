package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
	double armut, elma, domates, muz, patlıcan, toplam;
    double armutFiyat = 2.14;
    double elmaFiyat = 3.67;
    double domatesFiyat = 1.11;
    double muzFiyat = 0.95;
    double patlıcanFiyat = 5.00;

    Scanner scan = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut = scan.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = scan.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = scan.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = scan.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlıcan = scan.nextDouble();

        toplam = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) +
                 (patlıcan * patlıcanFiyat);
        System.out.print("Toplam tutar: " + toplam + " TL");

    }
}
