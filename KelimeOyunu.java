package kelimeoyunu;

import java.util.Scanner;

public class KelimeOyunu extends Oyun {

    public static String Kelime;

    public KelimeOyunu() {

        System.out.println("        ***** Kelime Oyununa Hoş Geldiniz *****          ");
        System.out.println("****************************************************");
        System.out.println("Hadi başlayalım, kelimeyi bulmak için 7 hakkınız var.");
        System.out.println("****************************************************");

    }

    public void OyunBaslat() {
        do {

            Scanner giris = new Scanner(System.in);

            String gizliKelime = Havuz(Kelime);

            String girilenKelime[] = new String[gizliKelime.length()];

            for (int i = 0; i < gizliKelime.length(); i++) {
                System.out.print(girilenKelime[i] = "_ ");

            }

            System.out.println("");
            int hayat = 0;
            int kontrol = 0;
            int doğru = 0;
            String girilenHarfler = "";

            char harf;

            while (hayat <= 5) {
                System.out.print("Bir harf giriniz (kalan hakkınız " + (7 - hayat) + "): ");

                harf = Character.toLowerCase(giris.next().charAt(0));

                if (girilenHarfler.indexOf(harf) == -1) {
                    girilenHarfler += Character.toString(harf);
                    hayat++;

                    for (int i = 0; i < gizliKelime.length(); i++) {
                        if (gizliKelime.charAt(i) == harf) {
                            girilenKelime[i] = harf + " ";
                            kontrol = 1;
                            doğru++;

                            if (doğru == gizliKelime.length()) {
                                System.out.println("Kelime: " + gizliKelime + "\n****** Tebrikler, doğru kelimeyi buldunuz ********");

                                return;
                            }
                        }
                    }

                    if (kontrol == 1) {
                        kontrol = 0;
                        hayat--;
                    }

                    for (int i = 0; i < gizliKelime.length(); i++) {
                        System.out.print(girilenKelime[i]);
                    }
                    System.out.println();
                } else {
                    System.out.println("Bu harfi daha önce girdiniz.");

                    hayat++; //Hayat artırdık 
                    for (int i = 0; i < gizliKelime.length(); i++) {
                        System.out.print(girilenKelime[i]);
                    }
                    System.out.println("");
                }

            }

            if (doğru != gizliKelime.length()) {
                System.out.println("Yanlış cevap, doğru kelime: " + gizliKelime);

            }

            Devam();
        } while (devam);
    }

    public static void main(String[] args) {

        KelimeOyunu Oyna = new KelimeOyunu();
        Oyna.OyunBaslat();

    }
}
