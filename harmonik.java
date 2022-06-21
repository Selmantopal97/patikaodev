import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        double harm=0;

        System.out.print("n sayısını girin: ");
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            harm+=(1.0/i);
        }
        System.out.print(harm);


    }
    
}
