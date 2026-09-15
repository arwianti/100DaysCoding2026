import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Masukkan uang saku awal:");
        double uangAwal = data.nextDouble();

        System.out.println("Masukkan uang dari kakak:");
        double uangKakak = data.nextDouble();

        System.out.println("Masukkan uang dari nenek:");
        double uangNenek = data.nextDouble();

        double totalUang = uangAwal + uangKakak + uangNenek;

        System.out.println("Total uang saat ini: " + totalUang);

        System.out.println("Masukkan uang untuk membeli alat tulis:");
        double alatTulis = data.nextDouble();

        double uangAkhir = totalUang - alatTulis;

        System.out.println("Sisa uang setelah membeli alat tulis: " + uangAkhir);
    }
}
