package day53;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Banyak nilai yang akan di masukan : ");
        int banyak, nilai;
        banyak = s.nextInt();
        int[] a = new int[banyak];
        for(int i = 0; i < banyak; i++){
            System.out.print("Nilai ke-"+(i+1)+" = ");
            a[i] = s.nextInt();
        }
        for(int i = 0; i < banyak; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
