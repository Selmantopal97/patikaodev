import java.util.Scanner;

public class artıkYıl {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int yil;

        System.out.print("Yılı Giriniz: ");
        yil= input.nextInt();

        if(yil%4==0){
                if(yil%400==0){
                    System.out.print(yil+" Artık bir yıldır");
                }
        }else{
            System.out.print(yil+" Artık bir yıl değildir");
        }

    }
    
}
