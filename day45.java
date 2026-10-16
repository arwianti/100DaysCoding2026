package day45;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka (1-3) : ");
        int angka = input.nextInt();
        
        switch (angka) {
            case 1:
                System.out.println("Kamu memilih angka satu");
             break;
            case 2:
                System.out.println("Kamu memilih angka dua ");
                break;
            case 3:
                System.out.println("Kamu memilih angka tiga");
                break;
            default:
                System.out.println("Angka tidak dikenali");
        }
    }
 
}
