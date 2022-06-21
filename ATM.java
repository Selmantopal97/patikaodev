import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int bakiye=2000,hak=3,miktar;
        String kullaniciAdi,parola;
        int select=0;
        
        while(hak>0){
        System.out.print("Kullanıcı Adınızı Giriniz:");
        kullaniciAdi=input.nextLine();
        
        System.out.print("Şifrenizi Giriniz:");
        parola=input.nextLine();
        
        if (kullaniciAdi.equals("selman") && parola.equals("12345")){
            System.out.println("Hoş Geldiniz!");
            System.out.println("1-Para yatırma\n" +
            "2-Para Çekme\n" +
            "3-Bakiye Sorgula\n" +
            "4-Çıkış Yap");
        }else{
            System.out.println("Kullanıcı adınız ve şifreniz hatalı.Tekrar deneyiniz.");
            hak--;
            System.out.println("Kalan Hakkınız: "+hak);
            }
            if(hak==0){
                System.out.println("Hesabınız Bloke Olmuştur.İletişime Geçin.");
                }
        
        

        System.out.println("Yapmak istediğiniz işlemi seçin: ");
        select=input.nextInt();
        
        switch (select){
            case 1:
            System.out.println("Yatırmak istediğiniz para miktarı: ");
            miktar=input.nextInt();
            bakiye+=miktar;
            System.out.println("Bakiyeniz: "+bakiye);
            break;
            
            case 2:
            System.out.println("Çekmek istediğiniz para miktarı:  ");
            miktar=input.nextInt();
            if(miktar>bakiye){
                System.out.println("Bakiyeniz yetersiz.");
            }
            bakiye-=miktar;
            System.out.println("Bakiyeniz: "+bakiye);
            break;

            case 3:
            System.out.println("Bakiyeniz: "+bakiye);
            break;

            case 4:
            System.out.println("Görüşmek Üzere!");
            break;
            default:
            break;
        }

        
    break;
    }   

    }
    
}
