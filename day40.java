
import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama :");
        int a = input.nextInt();
        
        System.out.print("Masukkan operator (+,-,*,/) : ");
        char operator = input.next().charAt(0);
        
        System.out.print("Masukkan angka kedua : ");
        int b = input.nextInt();
        
        int hasil = 0;
        
        if (operator == '+'){
            hasil = a+b;
            System.out.println("Hasil = " +hasil);
        }else if (operator == '-'){
            hasil = a-b;
            System.out.println("Hasil = " +hasil);
        }else if (operator == '*'){
            hasil = a*b;
            System.out.println("Hasil = " +hasil);
        }else if (operator == '/'){
            if (angka2 !=0){
                hasil = a/b;
                System.out.println("Hasil = " +hasil);
               } else {
                System.out.println("Tidak Dapat Dibagi dengan nol");
            }
        }
            else {
                    System.out.println("operator tidak valid");
                    }
        }
        
    }
