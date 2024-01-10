package coding;
import java.util.Scanner;
public class day94 {
    
    //posedur
    public static void siswa(String nama, int umur){
        System.out.println(nama+" "+umur+" tahun");
    }
    //fungsi
    public static String siswi(String nama, int umur){
        
        return nama+" "+umur+" tahun";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("nama : ");
        String nama = s.nextLine();
        System.out.print("umur : ");
        int umur = s.nextInt();
        //siswa(nama,umur);
        System.out.println("output : ");
        System.out.println(siswi(nama,umur));
    }
    
}
