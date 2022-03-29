package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mat,fizik,kimya,muzik,turkce,tarih,toplam;
        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik Notunu giriniz: ");
        mat = scan.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik = scan.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya = scan.nextInt();
        System.out.print("Muzik notunu giriniz: ");
        muzik = scan.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        turkce = scan.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        tarih = scan.nextInt();

        toplam = mat + fizik + kimya + muzik + turkce + tarih;
        System.out.println("Genel Not Ortalamanız: " + toplam/6);
        
        String sonuc = ((toplam/6)>60) ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(sonuc);

    }
}
