package day41;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        if(angka > 0){
            System.out.println(angka+" Bilangan Positif");
        }else{
            System.out.println(angka+" Bilangan Negatif");
        }
    }
    
}
