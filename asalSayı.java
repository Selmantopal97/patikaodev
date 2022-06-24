public class asalSayı {
    public static void main(String[] args) {
        int sayi;

        for(sayi=2;sayi<=100;sayi++){
            int bolen=0;
            for(int i=1;i<=sayi;i++){
                if(sayi%i==0){
                    bolen++;
                }
              
            }  if(bolen==2){
                    
                    System.out.print(sayi+" ");
                }
                
        }
    }
}
