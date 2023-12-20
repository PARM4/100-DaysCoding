package coding;

import java.util.Scanner;

public class day73 {
        
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("meter : ");
        
        double m = s.nextDouble();
        double k = m / 1000;
        
        System.out.println(k+" kilometer");
    }
}
