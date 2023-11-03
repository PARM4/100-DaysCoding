package habisdibagi3
import java.util.Scanner;

public class HabisDibagi3 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai batas atas angka
        System.out.print("Masukkan batas  angka: ");
        int angka = input.nextInt();

        // Menginisialisasi variabel jumlah untuk menghitung jumlah angka habis dibagi 3
        int jumlah = 0;

        // Melakukan iterasi dari 1 hingga batas atas
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {
                jumlah++; // Menambah jumlah jika angka habis dibagi 3
            }
        }

        // Menampilkan hasil jumlah angka yang habis dibagi 3
        System.out.println("Jumlah angka yang habis dibagi 3 dari 1 hingga " + angka + " adalah " + jumlah);

        // Menutup objek Scanner
        input.close();
    }
}
