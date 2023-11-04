package penjumlahanangka; 
import java.util.Scanner;

public class PenjumlahanAngka {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Menambahkan angka 1 ke masing-masing angka
        angka1 += 1;
        angka2 += 1;

        // Menjumlahkan dua angka
        int hasil = angka1 + angka2;

        // Memeriksa apakah hasil penjumlahan adalah ganjil atau genap
        if (hasil % 2 == 1) {
            System.out.println("Hasil penjumlahan: " + hasil + " (Ganjil)");
        } else {
            hasil += 2;
            System.out.println("Hasil penjumlahan: " + hasil + " (Genap)");
        }

        // Menutup objek Scanner
        input.close();
    }
}
