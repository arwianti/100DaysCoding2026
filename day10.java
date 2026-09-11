package Day11;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner arwi = new Scanner(System.in);
        
        System.out.print("nama:");
        String a = arwi.next();
        
        System.out.print("nomor Rumah:");
        byte b =arwi.nextByte();
        
        System.out.print("tinggi badan:");
        float c = arwi.nextFloat();
        
        System.out.print("berat badan:");
        double d = arwi.nextDouble();
        
        System.out.print("tanggal lahir:");
        int e = arwi.nextInt();
        
        System.out.print("jarak rumah ke kampus:");
        long f = arwi.nextLong();
        
        System.out.print("golongan darah:");
        char g = arwi.next().charAt(0);
        
        System.out.print("angka keberuntungan:");
        short h = arwi.nextShort();
        
        System.out.println("apakah benar nama saya arwianti:");
        boolean i = arwi.nextBoolean();
        
        System.out.println("\n nama saya: " + a + "\n nomor rumah : " + b + "\n tinggi badan: " + c + "\n berat badan: " + d + "\n tanggal lahir: " + e + "\n jarak kampus: " + f + "\n golongan darah: " + g + "\n angka keberuntungan saya :" + h + " \n benar nama saya arwianti:" + i) ;

    
    }
    
    
    
}
