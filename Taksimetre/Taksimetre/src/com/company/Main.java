package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int taksimetre = 10;
        int altlimit = 20;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen KM'yi giriniz: ");
        int km = scan.nextInt();
        int ucret = ((int) (km * 2.20)) + taksimetre;
        if(km>20){
            System.out.println("Taksimetre Ücretiniz: " + ucret +" TL'dir.");
        }
        else{
            System.out.println("20 km altındaki taksi ücretimiz " + altlimit + "TL'dir.");
        }

    }
}
