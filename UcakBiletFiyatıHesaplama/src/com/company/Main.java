package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mesafe = 0,yas=0,yon;
        double normalTutar, yasIndirim = 0.0F,indirimTutar,gidisDonus = 0.0F,toplamTutar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = scan.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = scan.nextInt();
        System.out.print("Yolculuk türünü giriniz(1 => Tek yön, 2 => Çift Yön): ");
        yon = scan.nextInt();

        if(mesafe > 0 && yas > 0 && (yon ==1 || yon== 2)){
            normalTutar = mesafe * 0.10;
            if(yas<12){
                yasIndirim = normalTutar * 0.50;
            }
            if(yas >=12 && yas <= 24){
                yasIndirim = normalTutar * 0.10;
            }
            if(yas > 65){
                yasIndirim = normalTutar * 0.30;
            }
            indirimTutar = normalTutar - yasIndirim;
            if(yon == 2) {
                gidisDonus = indirimTutar * 0.20;
                toplamTutar = (indirimTutar - gidisDonus) * 2;
            }else{
                toplamTutar = indirimTutar;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + "TL");
        }else{
            System.out.println("Hatalı Veri Girdiniz!");
        }





    }
}
