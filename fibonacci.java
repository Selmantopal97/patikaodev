import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int n=input.nextInt();
        int ilkSayi=0,ikiniciSayi=1,fib;
        
        for(int i=2;i<=n;i++){
            fib=ilkSayi+ikiniciSayi;
            System.out.println(ilkSayi+"+"+ikiniciSayi+"="+ fib);
            ilkSayi=ikiniciSayi;
            ikiniciSayi=fib;
        }
    }   
}
