package coding;
import java.util.Scanner;
public class day61 {
    public static void main(String[]args){
        
        /*
        tipe data variabel =(kondisi)? (true):(false);
        */
        
        Scanner s = new Scanner(System.in);
        while(true){
        System.out.print("masukkan angka : ");
        int a = s.nextInt();
        
        String hasil = a > 0? "Positif" : "Negatif";
        
        System.out.println(hasil);
        }
    }
}
