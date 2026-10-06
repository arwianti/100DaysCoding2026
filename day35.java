public class Day35 {
    public static void main(String[] args) {

        int nilai = 80;
        int kehadiran = 90;

        if (nilai >= 75) {
            if (kehadiran >= 80) {
                System.out.println("Mahasiswa lulus");
            } else {
                System.out.println("Nilai cukup, tetapi kehadiran kurang");
            }
        } else {
            System.out.println("Mahasiswa tidak lulus");
        }
    }
}
