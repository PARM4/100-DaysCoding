package coding;

import java.util.Scanner;

public class day71 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String nama = "Parma";
        for(int i = 1; i <= 3; i++){
            System.out.print("masukkan sandi : ");
            String sandi = sc.nextLine();
            if(nama.equalsIgnoreCase(sandi)){
                System.out.println("login sukses");
                System.out.println();
                System.out.println("~program selesai~");
                break;
            }else{
                System.out.println("gagal");
                if(3 == i){
                    System.out.println();
                    System.out.println("kesempatan habis");
                }
            }
        }
    }
}
