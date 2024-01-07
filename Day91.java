package coding;
import java.util.Scanner;
public class day91 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("baris : ");
        int baris = s.nextInt();
        System.out.print("kolom : ");
        int kolom = s.nextInt();
        int[][] angka = new int[baris][kolom];
        System.out.println();
        for(int i=0; i<baris; i++){
            System.out.println("baris ke-"+(i+1));
            for(int j=0; j<kolom; j++){
                System.out.print("isi "+(j+1)+" : ");
                angka[i][j] = s.nextInt();
            }
            System.out.println();
        }
        int total=0;
        for(int i=0; i<baris; i++){
            int b=0;
            for(int j=0; j<kolom; j++){
                b+=angka[i][j];
                total+=angka[i][j];
                if(j>0){
                    System.out.print(" + ");
                }
                System.out.print(angka[i][j]);
            }
            System.out.println(" = "+b);
        }
        System.out.println("total = "+total);
    }
}
