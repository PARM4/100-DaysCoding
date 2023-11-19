package day42;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("~Menghitung Nilai Perpangkatan~");
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        System.out.print("pangkat : ");
        int pangkat = input.nextInt();
        int hasil = 1;
        for(int i = 1; i <= pangkat ; i++){
            hasil*=angka;
        }
        System.out.println("Hasil : "+hasil);
    }
    
}
