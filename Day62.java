package coding;

import java.util.Scanner;

public class day62 {
    public static void main(String[]args){
        Scanner ternary = new Scanner(System.in);
        do{
        System.out.print("Masukkan angka : ");
        int angka = ternary.nextInt();
        String hasil = angka % 2 == 0? "Genap" : "Ganjil";
        System.out.println(hasil);
        }
        while(true);
        
    }
}
