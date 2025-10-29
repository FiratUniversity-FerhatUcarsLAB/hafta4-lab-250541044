/*
 * Ad Soyad: [Eren Bilge Koçak]
 * Ogrenci No: [250541044]
 * Tarih: 29 Ekim 2025
 * Aciklama:Ödev 3 
 */

import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {



        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Hesaplama sabitleri
        final double MESAI_CARPAN = 1.5;
        final double MESAI_BOLEN_SAAT = 160.0;

        // Istatistik sabitleri
        final double NET_SAAT_BOLEN = 176.0;
        final double NET_GUN_BOLEN = 22.0;


        final String HEADER = "=============================================";
        final String SEPARATOR = "---------------------------------------------";


        Scanner input = new Scanner(System.in);

        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");


        System.out.print("Calisan adi soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();


        System.out.print("Haftalik calisma saati (orn: 40): ");
        int haftalikCalismaSaati = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = input.nextInt();

        input.close();


        double mesaiUcreti = (brutMaas / MESAI_BOLEN_SAAT) * mesaiSaati * MESAI_CARPAN;
        double toplamGelir = brutMaas + mesaiUcreti;


        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;


        double netMaas = toplamGelir - toplamKesinti;


        double kesintiOrani = (toplamGelir > 0) ? (toplamKesinti / toplamGelir) * 100.0 : 0.0;
        double saatlikNetKazanc = netMaas / NET_SAAT_BOLEN;
        double gunlukNetKazanc = netMaas / NET_GUN_BOLEN;




        System.out.println("\n" + HEADER);

        System.out.println("                MAAS BORDROSU");
        System.out.println(HEADER);


        System.out.printf("Calisan: %s%n", adSoyad);

        System.out.println("\nGELIRLER:");
        System.out.printf("%-30s : %12.2f TL%n", "Brut Maas", brutMaas);
        System.out.printf("%-30s : %12.2f TL%n", "Mesai Ucreti (" + mesaiSaati + " saat)", mesaiUcreti);
        System.out.println(SEPARATOR);
        System.out.printf("%-30s : %12.2f TL%n", "TOPLAM GELIR", toplamGelir);

        System.out.println("\nKESINTILER:");

        String sgkEtiket = String.format("SGK Kesintisi (%.1f%%)", SGK_ORANI * 100);
        String gelirEtiket = String.format("Gelir Vergisi (%.1f%%)", GELIR_VERGISI_ORANI * 100);
        String damgaEtiket = String.format("Damga Vergisi (%.1f%%)", DAMGA_VERGISI_ORANI * 100);

        System.out.printf("%-30s : %12.2f TL%n", sgkEtiket, sgkKesintisi);
        System.out.printf("%-30s : %12.2f TL%n", gelirEtiket, gelirVergisi);
        System.out.printf("%-30s : %12.2f TL%n", damgaEtiket, damgaVergisi);
        System.out.println(SEPARATOR);
        System.out.printf("%-30s : %12.2f TL%n", "TOPLAM KESINTI", toplamKesinti);


        System.out.println(SEPARATOR);
        System.out.printf("%-30s : %12.2f TL%n", "NET MAAS", netMaas);
        System.out.println(HEADER);


        System.out.println("\nISTATISTIKLER (Bilgilendirme):");

        System.out.printf("%-30s : %12.1f%%%n", "Toplam Kesinti Orani", kesintiOrani);
        System.out.printf("%-30s : %12.2f TL%n", "Gunluk Net Kazanc (22 Gun)", gunlukNetKazanc);
        System.out.printf("%-30s : %12.2f TL%n", "Saatlik Net Kazanc (176 Saat)", saatlikNetKazanc);
        System.out.println(HEADER);
    }
}

