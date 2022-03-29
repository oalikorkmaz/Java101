# Hesap Makinesi
Switch-case mantığı ile basit hesap makinesi yapınız.

```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1,number2,total = 0;
        char ifade = ' ';
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci Sayiyi giriniz: ");
        number1 = scan.nextInt();

        System.out.print("'+', '-', '*', '/' işaretlerinden birini seçiniz: ");
        try {
            ifade = (char) System.in.read();
        }catch (Exception ex){
            System.out.println("Hatalı giriş yaptınız." + ex);
        }

        System.out.print("İkinci Sayiyi giriniz: ");
        number2 = scan.nextInt();

        switch(ifade){
            case '+':
                total = number1 + number2;
                break;
            case '-':
                total = number1 - number2;
                break;
            case '*':
                total = number1 * number2;
                break;
            case '/':
                total = number1 / number2;
                break;
            default:
                System.out.println("Lütfen doğru tuşlara basınız.");
                break;
        }
        System.out.println("Sonuç: " + total);
    }
}

```
