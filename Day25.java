package batasatas;
import java.util.Scanner;

public class BatasAtas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai batas atas: ");
        int batasAtas = input.nextInt();

        // Inisialisasi variabel total
        int total = 0;

        // Proses penjumlahan dari 1 hingga batasAtas
        for (int i = 1; i <= batasAtas; i++) {
            total += i;
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Total penjumlahan dari 1 hingga " + batasAtas + " adalah " + total);

        // Menutup objek Scanner
        input.close();
    }
}
