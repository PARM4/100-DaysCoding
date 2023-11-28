package day51;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("panjang index : ");
        int index = s.nextInt();
        int[] a =new int[index];
        int total = 0,nilai;
        int jml = a.length;
        for(int i=1; i<=jml; i++){
            System.out.print("nilai ke-"+i+" = ");
            nilai = s.nextInt();
            total += nilai;
        }
        int rata = total/jml;
        System.out.println("total = "+total);
        System.out.println("rata-rata = "+rata);
    }
    
}
