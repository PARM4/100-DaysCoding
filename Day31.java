package day2;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan Usia Anda Saat Ini : ");
        int umur = usia.nextInt();
        
        if(umur <= 10){
            System.out.println("Fase Anak-Anak");
        }else if(umur > 10 && umur <= 19){
            System.out.println("Fase Remaja");
        }else if(umur > 19 && umur <= 50){
            System.out.println("Fase Dewasa");
        }else if(umur > 50 && umur <= 100){
            System.out.println("Fase Lanjut usia");
        }
    }
    
}
