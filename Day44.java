package Day44;
import java.util.Scanner;

public class java{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        char predikat;

        if (nilai >= 85) {
            predikat = 'A';
        } else if (nilai >= 75) {
            predikat = 'B';
        } else if (nilai >= 65) {
            predikat = 'C';
        } else if (nilai >= 50) {
            predikat = 'D';
        } else {
            predikat = 'E';
        }

        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Predikat: " + predikat);
    }
}
