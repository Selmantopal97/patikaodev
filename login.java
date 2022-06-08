import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String userName= sc.nextLine();
        System.out.print("Şifreniz: ");
        String password= sc.nextLine();
        if(userName.equals("selman") && password.equals("topal")){
            System.out.print("Giriş Yapıldı"); sc.close(); return;
        }
        
            System.out.print("\nBilgileriniz hatalı\nŞifrenizi değiştirmek ister misiniz?\n1-Evet\n2-Hayır\nSeçiminiz: ");
            int durum=sc.nextInt();
            switch(durum){
                case 1:
                Scanner sc2= new Scanner(System.in);
                System.out.print("Yeni şifrenizi girin: ");
                String newPassword= sc2.nextLine();
                if(newPassword.equals("topal")) {
                    System.out.print("Şifre oluşturulamadı. Başka şifre oluşturun.");
                    return;
                }
                    System.out.print("Şifre oluşturuldu.");
                break;
                 
        } 
        sc.close();
         }
        
    }
    

