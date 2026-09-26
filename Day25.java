import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // rumus luas
        double luas = Math.PI * r * r;

        // tampilkan hasil
        System.out.println("Luas lingkaran = " + luas);

        
    }
}
