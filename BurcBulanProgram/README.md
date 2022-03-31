# Doğum Tarihine Göre Burç Bulan Program
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart



```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int month, day;
        Scanner scan = new Scanner(System.in);
        System.out.print("What month were you born in? (Just number): ");
        month = scan.nextInt();
        System.out.print("Which day?: ");
        day = scan.nextInt();

        switch (month){
            case 1:
                if(day<=31 && day>=0) {
                    if (day >= 22)
                        System.out.println("You are an Aquarius!"); //Kova
                    if (day < 22)
                        System.out.println("You are a Capricorn!"); // Oğlak
                    break;
                }else {
                    System.out.println("January has 31 days!");
                    break;
                }
            case 2:
                if(day<=28 && day>=0) {
                    if (day <= 19)
                        System.out.println("You are an Aquarius!"); //Kova
                    if (day > 19)
                        System.out.println("You are a Fishes"); //Balık
                    break;
                }else{
                    System.out.println("February has 28 days!");
                    break;
                }
            case 3:
                if(day<=31 && day>=0) {
                    if (day <= 20)
                        System.out.println("You are a Fishes");//Balık
                    if (day > 20)
                        System.out.println("You are an Aries");//Koç
                    break;
                }else{
                    System.out.println("March has 31 days!");
                    break;
                }
            case 4:
                if(day<=30 && day>=0) {
                    if (day <= 20)
                        System.out.println("You are an Aries");//Koç
                    if (day > 20)
                        System.out.println("You are a Taurus");//Boğa
                    break;
                }else{
                    System.out.println("April has 30 days!");
                    break;
                }
            case 5:
                if(day<=31 && day>=0) {
                    if (day <= 21)
                        System.out.println("You are a Taurus");//Boğa
                    if (day > 21)
                        System.out.println("You are a Twins");//İkizler
                    break;
                }else{
                    System.out.println("May has 31 days!");
                    break;
                }
            case 6:
                if(day<=30 && day>=0) {
                    if (day <= 22)
                        System.out.println("You are a Twins");//İkizler
                    if (day > 22)
                        System.out.println("You are a Cancer");//Yengeç
                    break;
                }else{
                    System.out.println("June has 30 days!");
                    break;
                }
            case 7:
                if(day<=31 && day>=0) {
                    if (day <= 22)
                        System.out.println("You are a Cancer");//Yengeç
                    if (day > 22)
                        System.out.println("You are a Lion");//Aslan
                    break;
                }else{
                    System.out.println("July has 31 days!");
                    break;
                }
            case 8:
                if(day<=31 && day>=0) {
                    if (day <= 22)
                        System.out.println("You are a Lion");//Aslan
                    if (day > 22)
                        System.out.println("You are a Virgo");//Başak
                    break;
                }else{
                    System.out.println("August has 31 days!");
                    break;
                }
            case 9:
                if(day<=30 && day>=0) {
                    if (day <= 22)
                        System.out.println("You are a Virgo");//Başak
                    if (day > 22)
                        System.out.println("You are a Scales");//Terazi
                    break;
                }else{
                    System.out.println("September has 30 days!");
                    break;
                }
            case 10:
                if(day<=31 && day>=0) {
                    if (day <= 22)
                        System.out.println("You are a Scales");//Terazi
                    if (day > 22)
                        System.out.println("You are a Scorpion");//Akrep
                    break;
                }else{
                    System.out.println("October has 31 days!");
                    break;
                }
            case 11:
                if(day<=30 && day>=0) {
                    if (day <= 21)
                        System.out.println("You are a Scorpion");//Akrep
                    if (day > 21)
                        System.out.println("You are a Sagittarius");//Yay
                    break;
                }else{
                    System.out.println("November has 30 days!");
                    break;
                }
            case 12:
                if(day<=31 && day>=0) {
                    if (day <= 21)
                        System.out.println("You are a Sagittarius");//Yay
                    if (day > 21)
                        System.out.println("You are a Capricorn!"); // Oğlak
                    break;
                }else{
                    System.out.println("December has 31 days!");
                    break;
                }
            default:
                System.out.println("Please enter numbers between 0-12!");
        }

    }
}


```
