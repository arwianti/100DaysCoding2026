package Day39;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama :");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan operator (+,-,*,/) : ");
        char operator = input.next().charAt(0);
        
        System.out.print("Masukkan angka kedua : ");
        int angka2 = input.nextInt();
        
        int hasil = 0;
        
        if (operator == '+'){
            hasil = angka1+angka2;
            System.out.println("Hasil = " +hasil);
        }else if (operator == '-'){
            hasil = angka1-angka2;
            System.out.println("Hasil = " +hasil);
        }else if (operator == '*'){
            hasil = angka1*angka2;
            System.out.println("Hasil = " +hasil);
        }else if (operator == '/'){
            if (angka2 !=0){
                hasil = angka1/angka2;
                System.out.println("Hasil = " +hasil);
               } else {
                System.out.println("Error : tidak bisa dibagi dengan nol");
            }
        }
            else {
                    System.out.println("operator tidak dikenali");
                    }
        }
        
    }
