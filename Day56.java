package coding;
import java.util.Scanner;
public class day56 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h=0;
        int[] a ={9,5,3,5,2,5,6,5};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("masukan angka : ");
        int angka = s.nextInt();
        for(int i = 0; i < a.length; i++){
            if(angka == a[i]){
                h = i;
            }
        }
        System.out.println("index ke-"+h);

    }
}
