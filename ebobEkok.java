import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("ilk sayıyı girin: ");
        int a= input.nextInt();
        
        System.out.print("ikinci sayıyı girin: ");
        int b= input.nextInt();
        int ebob=1,ekok=1;
        int bolen=1;
        int kat=1;
        
        while(bolen<=a){
            bolen++;
            if(a%bolen==0 && b%bolen==0){
                ebob=bolen;
            }
        }
        System.out.println(ebob);

        while(kat<=(a*b)){
            kat++;
            if(kat%a==0 && kat%b==0){
                ekok=kat;
                break;
            }
        }
        System.out.println(ekok);
    }
}
