package coding;
import java.util.Scanner;
public class day98 {
    public static int luas(int p, int l){
        int L = p*l;
        return L;
    }
    public static int keliling(int p, int l){
        int K = 2*(p+l);
        return K;
    }
    public static void Tluas(int p, int l){
        System.out.println("L = p * l");
        System.out.println("L = "+p+" * "+l);
        System.out.println("L = "+luas(p,l));
    }
    public static void Tkeliling(int p, int l){
        System.out.println("K = 2 * ( p + l )");
        System.out.println("K = 2 * ( "+p+" + "+l+" )");
        System.out.println("K = "+keliling(p,l));
    }
    public static void main(String[] args) {
        // Persegi Panjang
        // Luas = p * l
        // Keliling = 2*(p+l)
        int p,l;
        Scanner s = new Scanner(System.in);
        System.out.println("Persegi Panjang");
        System.out.print("Panjang (p) : ");
        p = s.nextInt();
        System.out.print("Lebar (l) : ");
        l = s.nextInt();
        Tluas(p,l);
        System.out.println();
        Tkeliling(p,l);
    }
    
}
