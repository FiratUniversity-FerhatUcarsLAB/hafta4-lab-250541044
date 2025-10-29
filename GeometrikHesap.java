/*
 * Ad Soyad: [Eren Bilge Koçak]
 * Ogrenci No: [250541044]
 * Tarih: 29 Ekim 2025
 * Aciklama:Görev 2
 */


import java.util.Scanner;

public class GeometrikHesap {

    public static void main(String[] args) {


        final double PI = 3.14159;
        final String HEADER = "=== GEOMETRIK HESAPLAYICI ===";


        final double KURE_KATSAYISI = 4.0 / 3.0;


        Scanner input = new Scanner(System.in);

        System.out.println(HEADER);
        System.out.print("Dairenin yaricapini girin (cm): ");


        double yaricap = input.nextDouble();

        input.close();




        double daireAlani = PI * Math.pow(yaricap, 2);


        double daireCevresi = 2.0 * PI * yaricap;


        double daireCapi = 2.0 * yaricap;


        double kureHacmi = KURE_KATSAYISI * PI * Math.pow(yaricap, 3);


        double kureYuzeyAlani = 4.0 * PI * Math.pow(yaricap, 2);




        System.out.println("\nSONUCLAR:");
        System.out.println("----------");

 
        System.out.printf("%-20s : %10.2f cm^2%n", "Daire Alani", daireAlani);
        System.out.printf("%-20s : %10.2f cm%n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-20s : %10.2f cm%n", "Daire Capi", daireCapi);
        System.out.printf("%-20s : %10.2f cm^3%n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-20s : %10.2f cm^2%n", "Kure Yuzey Alani", kureYuzeyAlani);
    }
}

