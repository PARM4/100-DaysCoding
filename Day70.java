package coding;

import java.util.Scanner;

public class day70 {
    public static void main(String[]args){
        Scanner bd = new Scanner(System.in);
        String nama ="Parma";
        do{
        System.out.print("masukkan sandi : ");
        String sandi = bd.next();
        if(nama.equals(sandi)){
            System.out.println("benar");
            break;
        }else{
            System.out.println("salah");
        }
        }while(true);
        System.out.println("program selesai");
    }
}
