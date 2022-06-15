import java.util.Scanner;

public class katlar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayi,kuvvet=0;

        System.out.print("Sayıyı giriniz: ");
        sayi=sc.nextInt();

        for(int i=1;i<=sayi;i*=4){
            System.out.print(i+",");
          
            
        }
        for(int c=1;c<=sayi; c*=5){
                
            System.out.print(c+ ",");
        }
        
        
    }
    
}
