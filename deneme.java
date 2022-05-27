
import java.util.Scanner;


public class deneme {
    public static void main(String[] args) {
        Scanner dersnotu = new Scanner(System.in);
        int matematik,fizik,kimya,turkce,tarih,müzik,toplam;
        double ortalama;
        
        System.out.print("matematik notunu girin:");
        matematik=dersnotu.nextInt();
        System.out.print("fizik notunu girin:");
        fizik=dersnotu.nextInt();
        System.out.print("kimya notunu girin:");
        kimya=dersnotu.nextInt();
        System.out.print("türkçe notunu girin:");
        turkce=dersnotu.nextInt();
        System.out.print("tarih notunu girin:");
        tarih=dersnotu.nextInt();
        System.out.print("müzik notunu girin:");
        müzik=dersnotu.nextInt();

        toplam = matematik+fizik+kimya+turkce+tarih+müzik;
        ortalama = toplam/6;
        System.out.println("not ortalaması: "+ ortalama);

        double gecmenotu=60;
        boolean durum1;
        durum1= ortalama>=gecmenotu;
        String str = durum1 ? "geçti" : "kaldı";
        System.out.print(str);




       

        
    }
}