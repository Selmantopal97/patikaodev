import java.util.Scanner;

public class faktöriyel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n,r,f,C,nFac=1,rFac=1,newFac=1;

        System.out.print("Küme eleman sayısını giriniz: ");
        n= input.nextInt();

        for(int i=1;i<=n;i++){
            nFac*=i;
            
        }
        System.out.println("n faktöriyel: "+nFac);
        
        System.out.print("r eleman sayısını giriniz: ");
        r= input.nextInt();
        
        for(int k=1;k<=r;k++){
            rFac*=k;
        }
        System.out.println("r faktöriyel: "+rFac);

        f=n-r;

        for(int m=1;m<=f;m++){
            newFac*=m;
        }
        System.out.println("n-r faktöriyel: "+newFac);

        C=nFac/(rFac*newFac);
        System.out.println("Kombinasyon:"+C);

    }
    
}
