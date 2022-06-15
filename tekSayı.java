import java.util.Scanner;

public class tekSayı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        int toplam=0;

        do{
            System.out.print("Sayıyı girin: ");
            a= input.nextInt();
            if(a%2==0 && a%4==0){
            toplam+=a;
            }
        }while(a%2==0);

            System.out.println(toplam);
      }
    }
