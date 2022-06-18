import java.util.Scanner;

public class armstrongSayı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,basamakSayisi=0;
        int basDegeri;
        int sonuc=0;
        int basToplami=0;
        
        System.out.print("Sayıyı girin: ");
        sayi= input.nextInt();
        int newSayi= sayi;

        while(newSayi!=0){
            newSayi /=10;
            basamakSayisi++;
            }    
        newSayi=sayi;
        
        
        while(newSayi!=0){
                basDegeri= newSayi % 10;
                basToplami+=basDegeri;
                newSayi/=10;
        }
        System.out.println(basToplami);  
    }
    
}
