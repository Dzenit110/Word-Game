package kelimeoyunu;

import java.util.Scanner;

public abstract class Oyun  {

    public static boolean devam = false; 

    public void OyunBaslat() {} 

    
    
    static String Havuz(String Kelime) 
    {

    int static kontrol; 
    int static kontrol1; 
    int sayi =0; 

        do {

            sayi = (int) Math.round(10 * Math.random()); 
            kontrol = sayi; 

        } while (kontrol1 == kontrol);
          kontrol1 = kontrol;

        switch (sayi) {
            case 1:
                System.out.println("****************************************************");
                System.out.println("Bir futbol sezonunda en yüksek sayıyı kaydeden oyuncu");
                String a = "golkrali";
                Kelime = a;

                break;

            case 2:
                System.out.println("****************************************************");
                System.out.println("Yeniden, bir daha, tekrar");
                String b = "yine";
                Kelime = b;
                break;

            case 3:
                System.out.println("****************************************************");
                System.out.println("\"Sonsuza kadar yaşayacak olan\" anlamındaki kelime");
                String c = "payidar";
                Kelime = c;
                break;

            case 4:
                System.out.println("****************************************************");
                System.out.println("\"Mikroorganizmalardan arındırılmış olan\" anlamında bir sözcük");
                String d = "sterilize";
                Kelime = d;
                break;

            case 5:
                System.out.println("****************************************************");
                System.out.println("Çalma ve/veya söyleme etkinliği");
                String e = "dinleti";
                Kelime = e;
                break;

            case 6:
                System.out.println("****************************************************");
                System.out.println("Bir tarım ürününden bol verim alınan senek");
                String f = "varyili";
                Kelime = f;
                break;

            case 7:
                System.out.println("****************************************************");
                System.out.println("Adını Roma savaşa tanrısından alan ay");
                String g = "mart";
                Kelime = g;
                break;

            case 8:
                System.out.println("****************************************************");
                System.out.println("Bir internet sitesinin giriş bölümü");
                String h = "anasayfa";
                Kelime = h;
                break;

            case 9:
                System.out.println("****************************************************");
                System.out.println("\"Hile, düzen oyun\" anlamlarında bir sözcük");
                String k = "aldatmaca";
                Kelime = k;
                break;

            case 10:
                System.out.println("****************************************************");
                System.out.println("Şişmana yakın, (balık etinde anlamında) bir sıfat");
                String l = "dolgun";
                Kelime = l;
                break;
        }

        return Kelime;
    }

    public static void Devam() 
    {
          
        System.out.println("********* Devam etmek istiyor musnuz ? ********* ('Evet'/'Hayir')");

        Scanner giris = new Scanner(System.in); 
        String cevap = giris.nextLine();
        if (cevap.equalsIgnoreCase("Evet")) { 
 
            devam = true;
            System.out.println("********* Oyun yeniden başlıyor.... *********");

        } else if (cevap.equalsIgnoreCase("Hayir")) 
        {

            devam = false;
            System.out.println("Tekrar bekleriz....");

        } else 
        {
            System.out.println("Yanlış giriş yaptınız.");
            return;
          
        }

    }

}
