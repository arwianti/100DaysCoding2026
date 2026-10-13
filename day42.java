package Day42;

import java.util.Scanner;


public class java {
    
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(" masukkan Gaji pokok: ");
        double gaji = in.nextDouble();

        System.out.print(" masukkan Jumlah proyek: ");
        int proyek = in.nextInt();

        double bonus = 0.05 * gaji * proyek; // tiap proyek dapat 5% dari gaji
        double potongan = 0.05 * gaji;
        double gajiBersih = gaji + bonus - potongan;

        System.out.println("Gaji bersih: " + gajiBersih);
    }

   
}
