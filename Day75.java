package coding;

import java.util.Scanner;

public class day75 {
    public static void main(String[]args){
        Scanner fa = new Scanner(System.in);
        System.out.print("angka : ");
        int a = fa.nextInt();
        int h = a;
        for(int i = 4; i >= 1; i--){
            System.out.print(i);
            if(i>1){
                System.out.print(" x ");
            }if(a != i){
                h *= i;
            }
        }
        System.out.print("= "+h);
    }
}
