import java.util.Scanner;

public class GanjilGenapTernary {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scanner.nextInt();
        
        // 2. Menggunakan Operator Ternary
        // Kondisi: (bilangan % 2 == 0) -> Apakah bilangan habis dibagi 2?
        // Jika true: "genap"
        // Jika false: "ganjil"
        String hasil = (bilangan % 2 == 0) ? "genap" : "ganjil" ;
        System.out.println(bilangan + " adalah bilangan " + hasil);
        

    }
}
