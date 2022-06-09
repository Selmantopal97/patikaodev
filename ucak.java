import java.util.Scanner;

public class ucak {
    public static void main(String[] args) {
        int mesafe,yolculukTipi,yas;
        double tutar;
        Scanner sc=new Scanner(System.in);

        System.out.print("yaşınızı girin: ");
        yas=sc.nextInt();

        System.out.print("yolculuk tipi: 1-Tek Yön ,2-Gidiş-Dönüş:  ");
        yolculukTipi=sc.nextInt();

        System.out.print("mesafeyi girin: ");
        mesafe=sc.nextInt();

        tutar=mesafe*0.10;

        if(yolculukTipi>=1 && yolculukTipi<=2){
                 if(yas>0){
                    if(mesafe>0){
                        if(yas<12){
                            double yasIndirimi=tutar*0.5;
                            tutar-=yasIndirimi;
                            if(yolculukTipi==2){
                                double yolculukTipiIndirimi=tutar*0.2;
                                tutar-=yolculukTipiIndirimi;
                                tutar*=2;
                                System.out.println("tutar:"+tutar);
                                }else{
                                    System.out.println(tutar);
                                }
                        }
                        if(yas>=12 && yas<=24){
                            double yasIndirimi=tutar*0.1;
                            tutar-=yasIndirimi;
                            if(yolculukTipi==2){
                                double yolculukTipiIndirimi=tutar*0.2;
                                tutar-=yolculukTipiIndirimi;
                                tutar*=2;
                                System.out.println("tutar:"+tutar);
                                }else{
                                    System.out.println(tutar);
                                }
                        }if(yas>24 && yas<65){
                            if(yolculukTipi==2){
                                double yolculukTipiIndirimi=tutar*0.2;
                                tutar-=yolculukTipiIndirimi;
                                tutar*=2;
                                System.out.println("tutar:"+tutar);
                                }else{
                                    System.out.println(tutar);
                                }
                        }
                        if(yas>=65){
                            double yasIndirimi=tutar*0.3;
                            tutar-=yasIndirimi;
                            if(yolculukTipi==2){
                                double yolculukTipiIndirimi=tutar*0.2;
                                tutar-=yolculukTipiIndirimi;
                                tutar*=2;
                                System.out.println("tutar:"+tutar);
                                }else{
                                    System.out.println(tutar);
                                }
                        }   
                    }
                    else{
                        System.out.println("Yanlış veri girdiniz");
                    } 
                 }else{
                    System.out.println("Yanlış veri girdiniz");
                }
                }else{
            System.out.println("Yanlış veri girdiniz");
        }

        
    }
    
}
