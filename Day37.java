package day37;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("~Menentukan Luas Persegi Panjang~");
        System.out.print("Tentukan nilai Panjang : ");
        int p = input.nextInt();
        System.out.print("Tentukan nilai Lebar : ");
        int l = input.nextInt();
        int luas = p*l;
        System.out.println("Luas = "+luas);
        System.out.println("-GAMBAR-");
        for(int i = 1; i <= p; i++){
            for(int j = 1; j <= l; j++){
                System.out.print("o ");
            }
            System.out.println("o");
        }
    }
    
}
