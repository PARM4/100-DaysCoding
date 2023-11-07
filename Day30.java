package pola;

public class Main {
    
    public static void main(String[] args) {
        
        String nama = "~Pola 1~";
        System.out.println(nama);
        System.out.println("---------------");
        int pola = 5;
        for(int a= 1; a<= pola; a++){
            System.out.print("* ");
        }System.out.println("");
        
        System.out.println("---------------");
        String nama2 ="~Pola 2~";
        System.out.println(nama2);
        System.out.println("---------------");
        int pola2 = 3;
        for(int b= 1; b<= pola2; b++){
            System.out.println("*");
        }
        
        System.out.println("--------------");
        String nama3 = "~Pola 3~";
        System.out.println(nama3);
        System.out.println("--------------");
        int polaa = 3;
        int polab = 5;
        System.out.println(polaa + " menurun");
        System.out.println(polab + " mendatar");
        for(int c= 1; c <= polaa; c++){
            for(int d= 1; d <= polab; d++){
                System.out.print("* ");
            }System.out.println("");
        }
    }
}
