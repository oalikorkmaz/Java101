# Koşullar :
- Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
- Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
- Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
- Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

```java
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz: ");
        int sicaklik = scan.nextInt();

        if(sicaklik <=5){
            System.out.println("Kayak yapabilirsiniz!");
        }else if(sicaklik>5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz!");
        }else if(sicaklik>15 && sicaklik<=25){
            System.out.println("Piknik yapabilirsiniz!");
        }else if(sicaklik > 25){
            System.out.println("Yüzmeye gidebilirsiniz!");
        }

    }
}
```
