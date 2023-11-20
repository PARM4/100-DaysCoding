package day43;

public class Main {
    
    public static void main(String[] args) {
        /* Konsep Dasar
           Array adalah sebuah variabel yang dapat disi lebih dari 1 value.
           int a = 1;
           int[] a ={index 0, index 1, index2};
        */
        
        //Pendeklarasian Pertama
        int[] a ={5,4,2};
        String[] buah ={"Mangga", "Jeruk"};
        System.out.println(buah[0]);
        System.out.println(a[2]);
        
        //Pendeklarasian Kedua
        int b[] = new int[3];
        b[0] = 5;
        b[1] = 2;
        b[2] = 8;
        System.out.println(b[1]);
    }
    
}
