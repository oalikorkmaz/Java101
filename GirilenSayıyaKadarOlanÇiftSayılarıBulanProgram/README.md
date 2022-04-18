# Pratik - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program

Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

## Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num,i,count = 0;
    Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        num = scan.nextInt();

        for (i = 0; i<=num; i=i+2){
            count++;
        }
        System.out.println("Toplamda "+count+" çift sayı vardır.");
    }
}
```
