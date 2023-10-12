package tipe_data_angka;

public class Tipe_Data_Angka {
    public static void main(String[] args) {
    /*
      Tipe Data Angka Bulat
      Byte      -> byte   -> 8 bit
      Short     -> short  -> 16 bit
      Integer   -> int    -> 32 bit
      Long      -> long   -> 64 bit    
    */
    
    byte x, y, z;
        x = 12;
        y = 5;
        z = (byte )(x+y);

    short k, l, m;
        k = -9;
        l = 2;
        m = (short)(k+l);  
     
    int a, b, c;
        a = 3;
        b = 4;
        c = a-b;
     
    long o, p, q;
        o = 23;
        p = 33;
        q = p-o;
     
    System.out.println(z);
    System.out.println(m);
    System.out.println(c);
    System.out.println(q);
            
    
    }
    
}
