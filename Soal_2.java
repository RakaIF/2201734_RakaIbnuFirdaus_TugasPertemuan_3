package pbo;
import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai UTS: ");
        float UTS = scanner.nextFloat();
        System.out.print("Masukkan nilai UAS: ");
        float UAS = scanner.nextFloat();
        System.out.print("Masukkan nilai Tugas: ");
        float Tugas = scanner.nextFloat();
        
        if (UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100 || Tugas < 0 || Tugas > 100){
            System.out.println("Nilai harus berada dalam rentang 0 hingga 100");
            return;
        }
        
        float NA = 0.35f * UTS + 0.45f * UAS + 0.2f * Tugas;

        char indeks;
        if (NA >= 80 && NA <= 100) {
            indeks = 'A';
        } else if (NA >= 70 && NA < 80) {
            indeks = 'B';
        } else if (NA >= 50 && NA < 70) {
            indeks = 'C';
        } else {
            indeks = 'D';
        }

        System.out.println("Nilai Akhir: " + NA);
        System.out.println("Indeks Akhir: " + indeks);
        scanner.close();
    }
}
