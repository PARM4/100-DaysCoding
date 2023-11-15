package day38;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama\t: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nim\t: ");
        String nim = input.nextLine();
        System.out.println("~~Program Studi~~");
        System.out.println("1.Teknik Informatika\n2.Teknik Sipil\n3.Teknik Perencanaan Wilayah Dan Kota");
        System.out.print("Masukkan Pilihan (1-3): ");
        int pilih = input.nextInt();
        System.out.println("=========================================");
        
        switch(pilih){
            case 1:
            System.out.println("Atas Nama "+nama+"\nNIM "+nim+"\nMemilih Program Studi Teknik Informatika");
            break;
            case 2:
            System.out.println("Atas Nama "+nama+"\nNIM "+nim+"\nMemilih Program Studi Teknik Sipil");
            break;
            case 3:
            System.out.println("Atas Nama "+nama+"\nNIM "+nim+"\nMemilih Program Studi Teknik Perencanaan Wilayah Dan Kota");
            break;
            default:
            System.out.println("Pilihan Salah");
            
        }
    }
}
