public class day55 {

    static int hitungJumlah() {
        int angka1 = 10;
        int angka2 = 5;
        return angka1 + angka2;
    }

    public static void main(String[] args) {

        System.out.println("Contoh Continue:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Angka: " + i);
        }

        System.out.println("\nContoh Break:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Angka: " + i);
        }

        System.out.println("\nContoh Return:");

        int hasil = hitungJumlah();
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
