package coding;
import java.util.Scanner;
public class day76 {
    public static void main(String[]args){
        Scanner ss = new Scanner(System.in);
        String[] buah ={"mangga","jeruk","durian"};
        int bantu = 0;
        for(int i=0; i<buah.length; i++){
            System.out.println(buah[i]);
        }
        System.out.print("buah kesukaan : ");
        String b = ss.nextLine();
        for(int i=0; i<buah.length; i++){
            if(b.equalsIgnoreCase(buah[i])){
                System.out.println("pilihan ada di nomor "+(i+1));
                bantu++;
            }
            
        }
        if(bantu==0){
            System.out.println("pilihan tidak ada");
        }
    }
}
