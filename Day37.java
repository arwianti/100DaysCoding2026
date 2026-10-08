package Day37;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        if(angka >0){
            System.out.println("Angka ini adalah bilangan positif");
        }else if(angka <0){
            System.out.println("Angka ini adalah bilangan negatif");
        }else{
            System.out.println("Angka ini adalah nol");
        }
    }
   
}
