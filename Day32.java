package pola2;

public class Main {
    
    public static void main(String[] args) {
System.out.println("---------------");
        String nama4 = "~Pola 4~";
        System.out.println(nama4);
        System.out.println("---------------");
        for(int a= 1; a <= 5; a++){
            for(int b= 1; b <= a; b++){
                System.out.print("* ");
           }
            System.out.println("");
        }
        
        System.out.println("---------------");
        String nama5 = "~Pola 5~";
        System.out.println(nama5);
        System.out.println("---------------");
        for(int g = 7; g >= 1; g--){
            for(int h = 1; h <= g; h++){
                System.out.print("* ");
            }
             System.out.println("");
        }
        
        System.out.println("---------------");
        String nama6 = "~Pola 6~";
        System.out.println(nama6);
        System.out.println("---------------");
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
