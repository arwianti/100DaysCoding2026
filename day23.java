package Day23;
 
    import java.util.Scanner;
         public class java {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input panjang dan lebar
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        // Hitung luas
        double luas = panjang * lebar;

        // Tampilkan hasil
        System.out.println("Luas persegi panjang adalah: " + luas);
    
}
 }
