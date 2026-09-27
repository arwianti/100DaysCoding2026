import java.util.Scanner;

public class SoalTukarNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Nilai a setelah ditukar: " + a);
        System.out.println("Nilai b setelah ditukar: " + b);
    }
}
