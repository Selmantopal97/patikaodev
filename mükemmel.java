import java.util.Scanner;

public class mükemmel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,bolen=0;

        System.out.print("Sayıyı giriniz: ");
        sayi=input.nextInt();

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                bolen+=i;
            }
        }
        if(bolen==sayi){
           System.out.print(sayi+" Mükemmel sayıdır."); 
        }else{
            System.out.print(sayi+" Mükemmel sayı değildir.");  
        }
    }
    
}
