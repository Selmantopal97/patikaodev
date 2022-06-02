import java.util.Scanner;

public class indeks{
public static void main(String[] args) {
Scanner veri= new Scanner(System.in);
double kg,boy,kitleİndeksi;

System.out.print("kiloyu giriniz: ");
kg= veri.nextDouble();

System.out.print("boyu giriniz : ");
boy= veri.nextDouble();

kitleİndeksi= kg/(boy*boy);
System.out.print("vücut kitle indeksi: "+kitleİndeksi);
}

}