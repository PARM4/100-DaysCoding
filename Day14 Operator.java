package operator;

public class Operator {
    public static void main(String[] args) {
        
        long a = 24, b = 3;
        long c = a % b;
        long d = b % a;
        
        float w = 12.2f, x = 3.5f;
        float y = w % x;
        float z = x % w;
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(y);
        System.out.println(z);
    }
    
}
