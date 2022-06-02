import java.util.Scanner;

public class taksi {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    double km,taksimetre=10,perKm=2.20;

    System.out.print("gidilen mesafe:");
    km = input.nextDouble();

    taksimetre+=(km*perKm);
    taksimetre=(taksimetre<20) ? 20 : taksimetre;
    System.out.print(taksimetre);


    

    
}
    
}
