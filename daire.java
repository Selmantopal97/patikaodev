import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double r,pi=3.14;
        Scanner input=new Scanner(System.in);

        System.out.print("yarıçapı giriniz:");
        r= input.nextDouble();

        double alan,cevre;

        alan=pi*(r*r);
        System.out.println("alan: "+alan);
        cevre=2*pi*r;
        System.out.println("çevre: "+cevre);

        double a,daireDilimiAlani;
        System.out.print("merkez açısını girin: ");
        a= input.nextDouble();
        daireDilimiAlani=(alan*a)/360;
        System.out.print(daireDilimiAlani);



    }


    
}
