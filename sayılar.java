import java.util.Scanner;

public class sayılar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayi,adet,buyukSayi=1,kucukSayi=1;

        System.out.print("kaç tane sayı gireceksiniz: ");
        adet=sc.nextInt();

        for(int i=1;i<=adet;i++){
            System.out.print(i+". sayıyı giriniz: ");
            sayi=sc.nextInt();
            if(i<2){
                buyukSayi=sayi;
                kucukSayi=sayi;
            }
            else{
            if(sayi>buyukSayi)
               buyukSayi=sayi;
            
            if(sayi<kucukSayi)
               kucukSayi=sayi;
        }
        }
        System.out.println("En büyük sayı: "+buyukSayi);
        System.out.println("En küçük sayı: "+kucukSayi);
    }
    
}
