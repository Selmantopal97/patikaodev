import java.util.Scanner;

public class bölünme{
        public static void main(String[] args) {
            Scanner number=new Scanner(System.in);            
            int a,toplam=0,adet=0;

            System.out.print("Sayıyı girin: ");
            a= number.nextInt();
            
            for(int i=1; i<=a; i++){
                if(i % 3 == 0 && i % 4 == 0){  
                 toplam+=i;  
                 adet++;
                 System.out.println(toplam);
                }      
            }
            double ortalama;
                    ortalama=toplam/adet;
            System.out.println(ortalama);



        }

}