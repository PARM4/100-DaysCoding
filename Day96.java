package coding;
import java.util.Scanner;
public class day96 {
    public static int luas(int s){
        int l = s*s;
        return l;
    }
    public static int keliling(int s){
        int k = 4*s;
        return k;
    }
    public static void ll(int s){
        System.out.println("L = s * s");
        System.out.println("L => "+s+" * "+s+" = "+luas(s));
    }
    public static void kk(int s){
        System.out.println("K = 4 * s");
        System.out.println("K => 4 * "+s+" = "+keliling(s));
    }
    public static void main(String[] args) {
        // L = s*s
        // K = 4*s
        Scanner ss = new Scanner(System.in);
        int s;
        System.out.println("Luas dan Keliling Persegi");
        System.out.print("sisi : ");
        s = ss.nextInt();
        ll(s);
        System.out.println();
        kk(s);
    }
    
}
