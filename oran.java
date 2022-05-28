import java.util.Scanner;

public class oran {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double miktar,kdvOran,kdvliTutar;

        System.out.print("para miktarını giriniz:");
        miktar= input.nextDouble();

        if(0<=miktar && miktar<=1000){
            kdvOran=0.18;
            kdvliTutar= miktar+(miktar*kdvOran);
        }
        else {
            kdvOran=0.08;
            kdvliTutar= miktar+(miktar*kdvOran);
        }

        System.out.println(kdvliTutar);
}
    
}
