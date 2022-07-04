package metotlar;

import java.util.Scanner;

public class hesapMakinesi {
    static int toplama(int a,int b){
       int result= a+b;
       System.out.println("Toplam: "+result);
       return result; 
    }

    static int fark(int a,int b){
        int result= a-b;
        System.out.println("Toplam: "+result);
        return result; 
     }

     static int carp(int a,int b){
        int result= a*b;
        System.out.println("Toplam: "+result);
        return result; 
     }

     static int bolme(int a,int b){
        if(b==0){
            System.out.print("İkinci Sayı 0'dan büyük olmalıdır.");
            return 0;
        }
        int result= a/b;
        System.out.println("Toplam: "+result);
        return result; 
     }

     static int Us(int a,int b){
         int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Üs Hesabı: "+result);
        return result;
     }

     static void faktoriyel(int a,int b){
        int facA=1,facB=1;
        for(int i=1;i<=a;i++){
            facA*=i;
        }
        for(int n=1;n<=b;n++){
            facB*=n;
        }
        System.out.println(a+"!: "+facA);
        System.out.println(b+"!: "+facB);
     }

     static int mod(int a, int b){
        int result;
        result = a%b;
        System.out.println(a+"'nın"+b+"ile bölümünden kalan: "+result);
        return result;
     }

     static void cevreAlan(int a,int b){
        System.out.println("Dikdörtgenin Çevresi: "+ (2*(a+b)));
        System.out.println("Dikdörtgenin Alanı: "+ (a*b));
     }

    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);
        int select; 
        String menu ="1- Toplama İşlemi\n"
        + "2- Çıkarma İşlemi\n"
        + "3- Çarpma İşlemi\n"
        + "4- Bölme işlemi\n"
        + "5- Üslü Sayı Hesaplama\n"
        + "6- Faktoriyel Hesaplama\n"
        + "7- Mod Alma\n"
        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
        + "0- Çıkış Yap";   
        
        while(true){
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz İşlem: ");
            select=girdi.nextInt();
           
            if(select==0){
                System.out.println("Güle Güle!");
                break;
            } 
            System.out.print("İlk Sayıyı Girin: ");
            int a=girdi.nextInt();
            System.out.print("İkinci Sayıyı Girin: ");
            int b=girdi.nextInt();
        
        switch(select){
            case 1:
                toplama(a, b);
                break;

            case 2:
                fark(a, b);
                break;

            case 3:
                carp(a, b);
                break;

            case 4:
                bolme(a, b);
                break;

            case 5:
                Us(a, b);
                break;

            case 6:
                faktoriyel(a,b);
                break;

            case 7:
                mod(a, b);
                break;

            case 8:
                cevreAlan(a, b);
                break;
            
            default:
                System.out.println("Yanlış bir değer girdiniz.Tekrar Deneyiniz.");
            }
        }
    }
}
