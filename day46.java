package Day46;
import java.util.Scanner;


public class java{
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        System.out.println(" Masukkan menu Makanan sesuai no. makanan  (1.nasi padang) (2.nasi goreng) (3.nasi lemak) ");
        int menu=input.nextInt();
        
        switch(menu){
            case 1:
                System.out.println(" nasi padang ");
                
                break;
            case 2:
                System.out.println(" nasi goreng ");
                break;
            case 3:
                System.out.println(" nasi lemak ");
                
                break;
            default:
                System.out.println(" menu tidak tersedia ");
        }
           
    }
    
}
