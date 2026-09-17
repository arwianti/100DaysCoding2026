import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan total siswa:");
        int siswa = input.nextInt();
        System.out.println("Masukkan jumlah bus:");
        int bus = input.nextInt();
        int busPenuh = siswa / bus;
        System.out.println("Jumlah bus yang dapat terisi penuh = " + busPenuh);
        int sisa = siswa % bus;
        System.out.println("Jumlah siswa yang tersisa = " + sisa);
    }
}
