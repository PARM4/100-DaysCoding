package coding;

import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        String[] hari ={"ahad","senin","selasa","rabu","kamis","jumat","sabtu"};
        for(int i = 0; i < hari.length; i++){
            System.out.println(hari[i]);
        }
        while(true){
        System.out.print("nomor hari(1-7) : ");
        int no = hr.nextInt();
        if(no>=1 && no<=7){
            System.out.println("nomor "+no+" hari "+hari[no-1]);
            break;
        }else{
            System.out.println("nomor terlalu besar\nSilahkan input ulang");
        }
        }
    }
}
