import java.util.Scanner;

public class üslüSayı{
        public static void main(String[] args) {
            int a,b;
            Scanner sc= new Scanner(System.in);

            System.out.print("Sayıyı girin: ");
            a=sc.nextInt();
            System.out.print("Üssü girin: ");
            b=sc.nextInt();

            int total=1;

            for(int i=1;i<=b;i++){
                total*=a;
            }
                System.out.print(total);


        }


}
    
