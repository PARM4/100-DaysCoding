package inputscanner;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
    
    /* 
       Input dengan Class Scanner 
       Dengan Tipe Data String 
    */   
    
    Scanner input = new Scanner(System.in);
    
    String nama, alamat;
     System.out.println("Silahkan Isi Pertanyaan Dibawah Ini!");
     System.out.print("Nama : ");
     nama = input.nextLine();
     
     System.out.print("Alamat : ");
     alamat = input.nextLine();
     
     System.out.println("Atas Nama "+nama+" Dari "+alamat);
     System.out.println("TERIMA KASIH");

    }
    
}
