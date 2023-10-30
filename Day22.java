package java;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Gaji Pokok : Rp. ");
        int gaji = input.nextInt();
        System.out.print("Masukkan Waktu Lembur : ");
        int waktu = input.nextInt();
        int hasil = waktu*55000; 
        
        System.out.println("lama lembur "+waktu+" jam "+" jadi gaji lembur yang didapat adalah : Rp. "+hasil);
        int jumlah = gaji+hasil;
        System.out.println("Jadi jumlah gaji bersih yang diperoleh adalah : Rp. "+jumlah); 
      
    }
}
