public class day17 {
    public static void main(String[] args) {

        int saldo = 0;

        // Setor tunai
        saldo = saldo + 500000;
        System.out.println("Setelah setor tunai : " + saldo);

        // Penarikan
        saldo = saldo - 120000;
        System.out.println("Setelah penarikan : " + saldo);

        // Bunga tabungan
        saldo = saldo * 1;
        System.out.println("Setelah bunga tabungan : " + saldo);

        // Membagi setengah saldo
        saldo = saldo / 2;
        System.out.println("Setelah dibagi 2 : " + saldo);

        // Modulus
        saldo = saldo % 50000;
        System.out.println("Sisa setelah modulus 50000 : " + saldo);
    }
}
