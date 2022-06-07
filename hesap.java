import java.util.Scanner;

public class hesap {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input= new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        n1= input.nextInt();
        System.out.print("İkinci Sayı: ");
        n2= input.nextInt();
        
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.println("Seçiminiz: ");
        select= input.nextInt();

        switch(select){
            case 1:
            System.out.print("Toplam:" +(n1+n2));
            break;
            case 2:
            System.out.print("Fark:" +(n1-n2));
            break;
            case 3:
            System.out.print("Çarpım:" +(n1*n2));
            break;
            case 4:
            System.out.print("Bölüm:" +(n1/n2));
            break;
            default :
            System.out.print("Yanlış seçim yaptınız");
        }
    }
    
}
