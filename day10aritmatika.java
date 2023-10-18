package aritmatikajava;

import java.util.Scanner;

public class Aritmatikajava {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        int angka1;
        int angka2;
        int hasil;
        
        System.out.print("input angka1 :");
        angka1 = old.nextInt();
        System.out.print("input angka2 :");
        angka2 = old.nextInt();
        
        hasil = angka1 + angka2;
        System.out.println("hasil "+hasil);        
               
    }
    
}
