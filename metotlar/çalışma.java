package metotlar;

import java.util.Scanner;

public class çalışma {
        static int cikarma(int n){
            if(n<=0)
            return n;
            else
            System.out.print(n + "  ");
            return cikarma(n-5);
    
        }
    
        static int toplama (int n, int m){
            if(n>m)
            return n;
            else
            System.out.print(n+"  ");
            return toplama(n+5, m);
        }
        
        
        
        public static void main(String[] args) {
            Scanner inp= new Scanner(System.in);
            int n;

            System.out.print("Sayıyı girin: ");
            n=inp.nextInt();
            
            toplama(cikarma(n), n);
        }
    }

