import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String userName,password,newPassword;
        int durum;

        System.out.print("Kullanıcı Adı: ");
        userName= sc.nextLine();
        System.out.print("Şifreniz: ");
        password= sc.nextLine();
        
        if(userName.equals("selman") && password.equals("topal")){
            System.out.print("Giriş Yapıldı");
        }else {
            System.out.println("Bilgileriniz hatalı");
            System.out.print("Şifrenizi değiştirmek ister misiniz?\n1-Evet\n2-Hayır");
            System.out.print("\nSeçiminiz: ");
            durum=sc.nextInt();
            switch(durum){
                case 1:
                Scanner sc2= new Scanner(System.in);
                System.out.print("Yeni şifrenizi girin: ");
                newPassword= sc2.nextLine();
                if(newPassword.equals("topal")) {

                    System.out.print("Şifre oluşturulamadı. Başka şifre oluşturun.");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                }
                break;
            
        }
                 
        } 

         }
        
    }
    

