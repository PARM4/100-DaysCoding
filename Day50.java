package day50;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, batas,jumlah=0,rata;
        System.out.print("Banyak nilai yang akan di masukan = ");
        batas = input.nextInt();
        for(int i = 1; i <= batas; i++){
            System.out.print("Nilai ke-"+i+" = ");
            nilai = input.nextInt();
            jumlah += nilai;
        }
        System.out.println("jumlah = "+jumlah);
        rata = jumlah/batas;
        System.out.println("rata-rata = "+rata);
        
    }
    
}
