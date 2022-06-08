import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int mat,fizik,kimya,muzik,turkce,dersSayisi=5,toplam=0;
        double ortalama;

        System.out.print("matematik notunuz: ");
        mat=inp.nextInt();
       
        System.out.print("fizik notunuz: ");
        fizik=inp.nextInt();
        
        System.out.print("kimya notunuz: ");
        kimya=inp.nextInt();

        System.out.print("müzik notunuz: ");
        muzik=inp.nextInt();
        
        System.out.print("türkçe notunuz: ");
        turkce=inp.nextInt();
        
        toplam=mat+fizik+kimya+muzik+turkce;
        if(mat<0 || mat>100){
            toplam=toplam-mat;
            dersSayisi--;
        }        
        if(fizik<0 || fizik>100){
            toplam=toplam-fizik;
            dersSayisi--;
        } 
        if(kimya<0 || kimya>100){
            toplam=toplam-kimya;
            dersSayisi--;
        } 
        if(muzik<0 || muzik>100){
            toplam=toplam-muzik;
            dersSayisi--;
        } 
        if(turkce<0 || turkce>100){
            toplam=toplam-turkce;
            dersSayisi--;
        } 
        ortalama=toplam/dersSayisi;
        System.out.print("ortalamanız: "+ortalama);
        if(ortalama>=55){
            System.out.println(ortalama);
                System.out.println("geçtin");
            }else{
                System.out.println("kaldın");
            }
        
     }
}