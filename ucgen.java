import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
    double a,b,c;
    Scanner input= new Scanner(System.in);
    
    System.out.print("ilk kenarı giriniz:");
    a=input.nextDouble();

    System.out.print("ikinci kenar:");
    b=input.nextDouble();

    c=Math.sqrt((a*a)+(b*b));
    System.out.println("hipotenüs:"+ c);

    double alan;
    alan=(a*b)/2;
    System.out.print("üçgenin alanı:"+ alan);


        


    }
    
}
