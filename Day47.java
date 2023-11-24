package day47;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml,angka,maks=0,min=100;
        System.out.print("Jumlah angka = ");
        jml = input.nextInt();
        System.out.println("----------------");
        for(int i = 1; i <= jml; i++){
            System.out.print("Angka ke-"+i+" = ");
            angka = input.nextInt();
            if(angka > maks){
                maks = angka;
            }
            if(angka<min){
                min = angka;
            }
        }
        System.out.println("---------------------");
        System.out.println("Nilai Maks = "+maks);
        System.out.println("Nilai Min  = "+min);
               
    }
    
}
