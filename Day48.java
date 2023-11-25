package day48;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        /*Segitiga Sama Sisi
          L = 0.5 * (a * t)
          K = s + s +s
        */
        Scanner input = new Scanner(System.in);
        double L,K,a,t,s;
        System.out.println("~Mencari Luas dan Keliling Segitiga Sama Sisi~")
        System.out.print("Masukan Nilai Alas \t= ");
        a = input.nextDouble();
        System.out.print("Masukan Nilai Tinggi \t= ");
        t = input.nextDouble();
        System.out.print("Masukan Nilai Sisi \t= ");
        s = input.nextDouble();
        
        L = 0.5 * (a * t);
        K = s + s + s;
        
        System.out.println("----------------------");
        System.out.println("Luas \t= "+L);
        System.out.println("Keliling= "+K);

    }
    
}
