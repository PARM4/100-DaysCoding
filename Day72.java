package coding;

import java.util.Scanner;

public class day72 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[10];
        for(int i = 0; i < angka.length; i++){
            System.out.print("index ke-"+i+" : ");
            angka[i] = sc.nextInt();
        }
        for(int i = 0; i < angka.length; i++){
            if(3 == i){
                System.out.println("index ke-"+i+"adalah "+angka[i]);
            }if(8 == i){
                System.out.println("index ke-"+i+"adalah "+angka[i]);
            }
        }
        
    }
}
