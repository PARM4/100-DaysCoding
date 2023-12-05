package coding;

import java.util.Scanner;

public class day58 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rahasia = 9;
        while(true){
            System.out.print("cari angka : ");
            int angka = sc.nextInt();
            if(rahasia < angka){
               System.out.println("angka terlalu besar");
            }if(rahasia > angka){
               System.out.println("angka terlalu kecil");
            }if(rahasia == angka){
               System.out.println("betul");
               break;
            }
        }
    }
}
