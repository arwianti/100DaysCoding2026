import java.util.Scanner;

public class day13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan: ");
        float tinggiBadan = input.nextFloat();

        System.out.print("Masukkan berat badan: ");
        float beratBadan = input.nextFloat();

        System.out.println("\n=== Data Diri ===");
        System.out.println("Tinggi Badan saya : " + tinggiBadan + " cm");
        System.out.println("Berat Badan saya  : " + beratBadan + " kg");

        input.close();
    }
}
