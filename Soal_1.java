package pbo;
import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int b1 = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b2 = scanner.nextInt();
        
        if (b1 % 2 == 0 && b2 % 2 == 0) {
            int hasilPenjumlahan = b1 + b2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        } else if (b1 % 2 == 1 && b2 % 2 == 1) {
            int hasilPerkalian = b1 * b2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
        } else {
            System.out.println("Bilangan pertama dan kedua harus sama-sama genap atau ganjil");
        }

        scanner.close();
    }
}
