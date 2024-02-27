package pbo;
import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();
        int jumlahMobil;
        
        if (jumlahPeserta % 7 == 0) {
            jumlahMobil = jumlahPeserta / 7;
        } else {
            jumlahMobil = jumlahPeserta / 7 + 1;
        }

        System.out.println("Jumlah peserta: " + jumlahPeserta);
        System.out.println("Jumlah mobil yang diperlukan: " + jumlahMobil);
        scanner.close();
    }
}