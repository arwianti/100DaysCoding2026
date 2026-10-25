import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if ((i % 3 == 0 || i % 4 == 0) &&
                !(i % 3 == 0 && i % 4 == 0)) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
