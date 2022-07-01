package metotlar;

public class palindrom {
    static boolean Palindrom(int sayi){
        int yeniSayi=sayi,sayiTersi=0,sonBasamak;
        
        while(yeniSayi !=0){
        sonBasamak= yeniSayi % 10;
        
        sayiTersi=(sayiTersi*10)+sonBasamak;

        yeniSayi/=10;
    }
        if(sayi==sayiTersi)
            return true;
        else
        return false;
    }


    public static void main(String[] args) {
       System.out.print(Palindrom(242)); 
    }
    
}
