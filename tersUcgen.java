import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bas;

        System.out.print("Basamak sayısı: ");
        bas=input.nextInt();
  


        for(int i=bas;i>0;i--){
            for(int j=0;j<(bas-i);j++){
            System.out.print(" ");
            
        }
        
            for(int n=i*2-1;n>=1;n--){
            System.out.print("*");
        
        }
        
        System.out.println("");
        
        }

        
    }
    
}
