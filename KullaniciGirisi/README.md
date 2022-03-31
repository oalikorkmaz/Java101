# Pratik - Kullanıcı Girişi

```java
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        String kullanici = scan.nextLine();
        System.out.print("Şifreyi giriniz: ");
        String sifre = scan.nextLine();

    if(kullanici.equals("onur") && sifre.equals("1234"))
            System.out.println("Giriş Başarılı.");
        else
        System.out.println("Kullanıcı adı veya şifre yanlış.");

    }

    }
```
