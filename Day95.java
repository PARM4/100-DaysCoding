package coding;
import java.util.Scanner;
public class day95 {
    
    public static void operasi(int a, int b){
        int c;
        c = a+b;
        System.out.println(a+" + "+b+" = "+c);
        c = a-b;
        System.out.println(a+" - "+b+" = "+c);
        c = a*b;
        System.out.println(a+" x "+b+" = "+c);
        double d,e,f;
        e = a;
        f = b;
        d = e/f;
        System.out.println(a+" / "+b+" = "+d);
        c = a%b;
        System.out.println("sisa bagi "+c);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.print("angka 1 : ");
        a = s.nextInt();
        System.out.print("angka 2 : ");
        b = s.nextInt();
        operasi(a,b);
    }
    
}
