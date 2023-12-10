package coding;

import java.util.Scanner;

public class day63 {
    public static void main(String[]args){
        /*
           Predikat Nilai
           Nilai 9-10 = amat baik
           Nilai 7-8  = baik
           Nilai 5-6  = cukup
           Nilai 1-5  = kurang
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Anda : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Nilai : ");
        int nilai = sc.nextInt();
        String predikat = 
        nilai > 10? "Nilai Salah":
        nilai >= 9? "Predikat Amat Baik":
        nilai >= 7? "Predikat Baik":
        nilai >= 5? "Predikat Cukup":
        "Predikat Kurang";
        
        System.out.println(nama+" mendapat : "+predikat);
    }
}
