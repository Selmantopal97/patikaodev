import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
    Scanner meyveSebze= new Scanner(System.in);
    double Armut,Elma,Domates,Muz,Patlican,kg,tutar;

    System.out.print("Armut kaç kg: ");
    kg= meyveSebze.nextDouble();
    Armut = kg*2.14;

    System.out.print("Elma kaç kg: ");
    kg= meyveSebze.nextDouble();
    Elma = kg*3.67;

    System.out.print("Domates kaç kg: ");
    kg= meyveSebze.nextDouble();
    Domates = kg*1.11;
    
    System.out.print("Muz kaç kg: ");
    kg= meyveSebze.nextDouble();
    Muz = kg*0.95;

    System.out.print("Patlıcan kaç kg: ");
    kg= meyveSebze.nextDouble();
    Patlican = kg*5.00;

    tutar=Armut+Elma+Domates+Muz+Patlican;
    System.out.print("Toplam Tutar: "+ tutar);

        
    }
    
}
