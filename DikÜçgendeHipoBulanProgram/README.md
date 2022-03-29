# Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

# Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

```Java
//Scanner ile kullanıcan veri girişi
        System.out.print("Birinci Dik Kenar Uzunluğunu giriniz: ");
        dikkenar1 = scan.nextInt(); // klavyeden yazılan değerin değişkene atılması
        System.out.print("İkinci Dik Kenar Uzunluğunu giriniz:");
        dikkenar2 = scan.nextInt(); // klavyeden yazılan değerin değişkene atılması

        dikkenar1 = (int) Math.pow(dikkenar1,2); // matematik fonksiyonundan kare alma metodunu çektik.
        dikkenar2 = (int) Math.pow(dikkenar2,2); // matematik fonksiyonundan kare alma metodunu çektik.
        hipo = (int) Math.sqrt((dikkenar1+dikkenar2)); // matematik fonksiyonundan karekök alma metodunu çektik.
        System.out.println("Hipotenüs: " + hipo);


        // alan hesabı
        int uzunluk1,uzunluk2,uzunluk3,alan,u; //tanımlar.
        System.out.println("Uzunlukları girin: "); //
        uzunluk1 = scan.nextInt();
        uzunluk2 = scan.nextInt();
        uzunluk3 = scan.nextInt();

        u = (uzunluk1+uzunluk2+uzunluk3)/2;
        alan = u*(u-uzunluk1)*(u-uzunluk2)*(u-uzunluk3);
        System.out.println("Üçgenin alanı: " + (int) Math.sqrt(alan));

    }
}
```
