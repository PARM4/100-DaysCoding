package coding;

import java.util.Scanner;

public class day65 {
    public static void main(String[]args){
        Scanner cr = new Scanner(System.in);
        String[] buah ={"mangga","durian","jambu"};
        for(int i = 0; i < buah.length; i++){
            System.out.println(buah[i]);
        }
        System.out.print("pilih buah kesukaan : ");
        String cari = cr.next();
        for(int i = 0; i < buah.length; i++){
            if(cari.equals(buah[i])){
                int hasil = i+1;
                System.out.println("pilihan ke-"+hasil);
            }else{
                System.out.println("pilihan tidak ada");
                break;
            }
        }
    }
}
