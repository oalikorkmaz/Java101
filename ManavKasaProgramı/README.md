# Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

## Meyveler ve KG Fiyatları
- Armut : 2,14 TL
- Elma : 3,67 TL
- Domates : 1,11 TL
- Muz: 0,95 TL
- Patlıcan : 5,00 TL

# Örnek Çıktı;
```java
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
```

# Kod

```java
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

```
