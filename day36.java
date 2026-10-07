import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan tersebut genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
        }


    }
}
