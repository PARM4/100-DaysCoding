package coding;

import java.util.Scanner;

public class day59 {
    public static void main(String[]args){
        /*
        Lingkaran
        Luas = phi * r * r
        Keliling = phi * diameter
        d = 2 * r
        */
        Scanner s = new Scanner(System.in);
        System.out.println("Lingkaran");
        final double phi = 3.14;
        double d,r,l,k;
        
        System.out.print("Masukan nilai jari - jari : ");
        r = s.nextInt();
        d = 2 * r;
        
        l = phi * r * r;
        k = phi * d;
        
        System.out.println("Luas : "+l);
        System.out.println("Keliling : "+k);
    }
}
