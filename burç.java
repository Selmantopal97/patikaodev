import java.util.Scanner;

public class burç {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int gun,ay;

        System.out.print("Doğdunuz günü giriniz: ");
        gun=input.nextInt();

        System.out.print("Doğduğunuz ayı girin: ");
        ay=input.nextInt();

        if(ay>=1 && ay<=12){
        if(ay==1){
            if(gun>=1 && gun<=31){
                if(gun<=21){
                System.out.println("Oğlak burcu");
                }else{
                System.out.println("Kova burcu");
                }
            }else{
                System.out.println("Geçersiz bir gün girildi.");
            }
        }
        if(ay==2){
            if(gun>=1 && gun<=28){
                if(gun<=19){
                System.out.println("Kova burcu");
                }else{
                System.out.println("Balık burcu");
                }
            }else{
                System.out.println("Geçersiz bir gün girildi.");
            }   
            }
            if(ay==3){
                if(gun>=1 && gun<=31){
                    if(gun<=20){
                    System.out.println("Balık burcu");
                    }else{
                    System.out.println("Koç burcu");
                    }
                }else{
                    System.out.println("Geçersiz bir gün girildi.");
                }   
                }
                if(ay==4){
                    if(gun>=1 && gun<=30){
                        if(gun<=20){
                        System.out.println("Koç burcu");
                        }else{
                        System.out.println("Boğa burcu");
                        }
                    }else{
                        System.out.println("Geçersiz bir gün girildi.");
                    }   
                    }
                    if(ay==5){
                        if(gun>=1 && gun<=31){
                            if(gun<=21){
                            System.out.println("Boğa burcu");
                            }else{
                            System.out.println("İkizler burcu");
                            }
                        }else{
                            System.out.println("Geçersiz bir gün girildi.");
                        }   
                        }
                        if(ay==6){
                            if(gun>=1 && gun<=30){
                                if(gun<=22){
                                System.out.println("İkizler burcu");
                                }else{
                                System.out.println("Yengeç burcu");
                                }
                            }else{
                                System.out.println("Geçersiz bir gün girildi.");
                            }   
                            }
        }
        else{
            System.out.println("Geçersiz bir ay girildi.");
        }
    }
    
}
