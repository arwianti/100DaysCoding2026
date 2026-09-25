package Day24;

import java.util.Scanner;


public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("masukkan panjang sisi persegi( dalam satuan cm): ");
        double sisi = input.nextDouble();
        
        
        double luas =sisi*sisi;
        
        
        System.out.println("luas persegi adalah: " + luas + "cm²");
        
        
    }
    
    
}
