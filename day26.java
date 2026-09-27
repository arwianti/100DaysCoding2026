import java.util.Scanner;

public class dy26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Setelah ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
    }
}
