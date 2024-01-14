package coding;
import java.util.Scanner;
public class day99 {
    public static int pangkat(int a, int p){
        int hasil = a;
        for(int i=1; i<p; i++){
            hasil *= a;
        }
        return hasil;
    }
    public static void Tpangkat(int a, int p){
        System.out.println(a+"^"+p+" = "+pangkat(a,p));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angka,pangkat;
        System.out.println("menentukan nilai berpangkat");
        System.out.print("angka : ");
        angka = s.nextInt();
        System.out.print("pangkat : ");
        pangkat = s.nextInt();
        System.out.println("~hasil~");
        Tpangkat(angka,pangkat);
    }
    
}
