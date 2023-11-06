4package menu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          Scanner menu = new Scanner(System.in);
        
        System.out.println("----------Pilihan Menu----------");
        System.out.println(" 1. Nasi Goreng : Rp. 10000");
        System.out.println(" 2. Mie Goreng  : Rp. 12000 ");
        System.out.println(" 3. Gado - Gado : Rp. 8000");
        
        System.out.print("Pilih menu yang anda suka  : ");
        int pilih = menu.nextInt();
        System.out.print("Pilih jumlah pesanan       : ");
        int porsi = menu.nextInt();
        System.out.println("================================");
        
        if (pilih == 1){
            String nama = "nasi goreng";
            int total = porsi * 10000;
            System.out.println("Pesanan anda adalah :");
            System.out.println("Jenis pesanan  : " + nama);
            System.out.println("Jumlah pesanan : " + porsi);
            System.out.println("Total pesanan  : Rp." + total);
            
        }else if (pilih == 2){
            String nama = "Mie Goreng";
            int total = porsi * 12000;
            System.out.println("Pesanan anda adalah :");
            System.out.println("Jenis pesanan  : " + nama);
            System.out.println("Jumlah pesanan : " + porsi);
            System.out.println("Total pesanan  : Rp." + total);
        
        }else if(pilih == 3){
            String nama = "Gado - Gado";
            int total = porsi * 8000;
            System.out.println("Pesanan anda adalah :");
            System.out.println("Jenis pesanan  : " + nama);
            System.out.println("Jumlah pesanan : " + porsi);
            System.out.println("Total pesanan  : Rp." + total);
        }
        
        System.out.println("-------Selamat Menikmati--------");
    }
        
}
