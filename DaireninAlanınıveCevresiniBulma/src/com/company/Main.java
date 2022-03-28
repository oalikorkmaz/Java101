package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Lütfen dairenin yarı çapını giriniz: ");
        Scanner scan = new Scanner(System.in);
        int yaricap = scan.nextInt();
        double pi = 3.14;

        //Alan
        double alan = pi * yaricap * yaricap;
        System.out.println("Dairenin alanı: " + alan);

        //Çevre
        double cevre = 2 * pi * yaricap;
        System.out.println("Dairenin cevresi: " + cevre);

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        System.out.print("Merkez açısının ölçüsünü yazınız: ");
        double derece = scan.nextInt();
        double alan2 = (pi * (yaricap * yaricap) * derece)/360;
        System.out.println("Alan2 = " + alan2);


    }
}
