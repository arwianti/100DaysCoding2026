import java.util.Scanner;

public class day58{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("Angka ganjil:");
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Angka genap:");
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
