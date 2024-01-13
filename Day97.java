package coding;
import java.util.Scanner;
public class day97 {
    public static double luas(double phi, double r){
        double L = phi*r*r;
        return L;
    }
    public static double keliling(double phi, double r){
        double d = 2*r;
        double K = phi*d;
        return K;
    }
    public static void Tluas(double phi, double r){
        System.out.println("L = phi * r * r");
        System.out.println("L = "+phi+" * "+r+" * "+r);
        System.out.println("L = "+luas(phi,r));
        }
    public static void Tkeliling(double phi, double r){
        double d = 2*r;
        System.out.println("K = phi * d");
        System.out.println("K = "+phi+" * "+d);
        System.out.println("K = "+keliling(phi,r));
        }
    public static void main(String[] args) {
        //Lingkaran
        // L = phi*r*r
        // K = phi*d
        // d = 2*r
        Scanner s = new Scanner(System.in);
        final double phi = 3.14;
        System.out.println("Luas dan Keliling Lingkaran");
        System.out.print("jari - jari : ");
        double r = s.nextDouble();
        Tluas(phi,r);
        System.out.println();
        Tkeliling(phi,r);
    }
}
