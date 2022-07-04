package metotlar;

import java.util.Scanner;

public class metotUslu {
    static int Us(int a,int b){
        int result=1;
       for(int i=1;i<=b;i++){
           result*=a;
       }
       System.out.println("Üs Hesabı: "+result);
       return result;
    }
    
    
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int a,b;

        System.out.print("Taban Sayısı:");
        a=inp.nextInt();
        System.out.print("Üssü Girin:");
        b=inp.nextInt();
        
        
        Us(a, b);
    }
    
}
