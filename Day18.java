package aritmatikainput;

import java.util.Scanner;

public class Aritmatikainput {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;
               
        Scanner selasa = new Scanner(System.in);
        
        System.out.print("input angka-1 : ");
        angka1 = selasa.nextInt();
        System.out.print("input angka-2 : ");
        angka2 = selasa.nextInt();
        
        //penjumlahan
        hasil  = angka1 + angka2;
        System.out.println("Hasil Penjumlahan =  " +hasil);
         
        //pengurangan
        hasil  = angka1 - angka2;
        System.out.println("Hasil Pengurangan = " +hasil);
        
        //perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian = "+hasil);
        
        //pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil Pembagian = "+hasil);
        
        //sisa bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil dari Sisa Bagi = "+hasil);
        
            }
    
}
