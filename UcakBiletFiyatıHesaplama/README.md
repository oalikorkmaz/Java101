# Ödev - Uçak Bileti Fiyatı Hesaplama

  Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

- Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
- Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

## İpucu
```java
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
```
## Senaryolar
### Senaryolar 1 
```java
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

Toplam Tutar = 216 TL
```
### Senaryolar 2 
```java
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77

Hatalı Veri Girdiniz !
```
### Senaryolar 3 
```java
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1

Toplam Tutar = 20.0 TL
```

# Kod
```java
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


```
