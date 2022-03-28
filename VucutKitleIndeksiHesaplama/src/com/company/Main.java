package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    double total;
    System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
    float boy = scan.nextFloat();
    System.out.print("Lütfen kilonuzu giriniz : ");
    float kilo = scan.nextFloat();

    total = kilo / (boy * boy);
    System.out.println("Vücut Kitle İndeksiniz :" + total);


    }
}
