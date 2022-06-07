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
        System.out.print("Seçiminiz: ");
        select= input.nextInt();

        if(select==1){
             System.out.print("Toplam:" +(n1+n2));
        }
            else if(select==2){
            System.out.print("Fark:" +(n1-n2));
            }
            else if(select==3){
                System.out.print("Çarpım:" +(n1*n2));
                }
            else if(select==4){
                    System.out.print("Bölüm:" +(n1/n2));
                    }
            else{
            System.out.print("Yanlış seçim yaptınız");
            }
        }
    }
    

