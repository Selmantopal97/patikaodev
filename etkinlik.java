import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          double temp;

          System.out.print("Hava Sıcaklığı: ");
          temp=sc.nextDouble();

          if(temp<5){
              System.out.println("Kayağa gidebilirsiniz");
            }
            else if(temp>=5 && temp<=15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            else if(temp>15 && temp<25){
                    System.out.println("Pikniğe gidebilirsiniz");
                }else if(temp>=25){
                        System.out.println("Yüzmeye gidebilirsiniz");
                    }
    }
}    

