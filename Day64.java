package coding;

import java.util.Scanner;

public class day64 {
    public static void main(String[]args){
        Scanner par = new Scanner(System.in);
        System.out.print("Berapa umur anda : ");
        int umur = par.nextInt();
        if(umur >= 17){
            System.out.print("apakah anda sudah memiliki Sim? (true/false) : ");
            boolean sim = par.nextBoolean();
            String hsl = sim? "boleh mengemudi" : "belum boleh mengemudi";
            System.out.println(hsl);
        }else{
            System.out.println("tidak boleh mengemudi");
        }
    }
}
