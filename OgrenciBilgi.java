/*
 * Ad Soyad: [Eren Bilge Koçak]
 * Ogrenci No: [250541044]
 * Tarih: 29 Ekim 2025
 * Aciklama:Görev 1
 */


import java.util.Scanner;

public class OgrenciBilgi {

    public static void main(String[] args) {


        final String HEADER = "=== OGRENCI BILGI SISTEMI ===";
        final double MIN_BASARI_GPA = 2.00;


        Scanner input = new Scanner(System.in);


        System.out.println(HEADER);


        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();


        String durum;
        if (gpa >= MIN_BASARI_GPA) {
            durum = "Basarili Ogrenci";
        } else {
            durum = "Basarisiz Ogrenci";
        }


        System.out.println(HEADER);


        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);


        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Durum: %s%n", durum);


        input.close();
    }
}
