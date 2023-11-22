package day45;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int jumlah ;
        Scanner masuk = new Scanner(System.in);
        System.out.println("Input : ");
        System.out.println("--------------------");
        System.out.print("Jumlah Index : ");
        jumlah = masuk.nextInt();
        int[] a = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Index ke-"+i+" : ");
            a[i] = masuk.nextInt();
        }
        
        System.out.println("-------------------");
        System.out.println("Output : ");
        for(int i = 0; i < jumlah; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
