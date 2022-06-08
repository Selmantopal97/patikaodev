import java.util.Scanner;

public class sıralama {
    public static void main(String[] args) {
        Scanner sayi=new Scanner(System.in);
        int a,b,c;

        System.out.print("ilk sayıyı girin: ");
        a=sayi.nextInt();

        System.out.print("ikinci sayıyı girin: ");
        b=sayi.nextInt();

        System.out.print("üçüncü sayıyı girin: ");
        c=sayi.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("a > b > c");
            }else{
                System.out.println("a > c > b");
            }
        }
            if(b>a && b>c){
                if(a>c){
                    System.out.println("b > a > c"); 
                }else{
                    System.out.println("b > c > a");
                }
            }
            if(c>a && c>b){
                if(a>b){
                    System.out.println("c > a > b");
                }else{
                    System.out.println("c > b > a");
                }
            }
    }
}
