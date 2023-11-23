package day46;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal,akhir;
        System.out.print("Nilai Awal : ");
        awal = input.nextInt();
        System.out.print("Nilai Akhir : ");
        akhir = input.nextInt();
        do{
            System.out.print(awal+" ");
            awal++;
        }while(awal<=akhir);
    }
    
}
