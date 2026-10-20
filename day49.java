import java.util.Scanner;

public class NilaiTernary {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // Menggunakan operator ternary untuk menentukan status
        String status = (nilai >= 70) ? "Lulus" : "Tidak Lulus";

        System.out.println("Status anda: " + status);
    }
}
