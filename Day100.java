package coding;
import java.util.Scanner;
public class day100 {
    public static double dis(double harga, double diskon){
        double b = harga*(diskon/100);
        double hasil = harga - b;
        return hasil;
    }public static void tdis(double harga, double diskon){
        System.out.println("=================");
        System.out.println("harga\t= "+harga);
        System.out.println("diskon\t= "+diskon);
        System.out.println("=================");
        System.out.println("total\t  "+dis(harga,diskon));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double harga, diskon=0;
        System.out.print("harga barang : ");
        harga = s.nextDouble();
        if(harga>500000){
            diskon = 15;
        }else if(harga>100000){
            diskon = 10;
        }else{
            diskon = 0;
        }
    tdis(harga,diskon);
    }
    
}
