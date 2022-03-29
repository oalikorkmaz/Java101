# KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

# Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

```java
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
```
