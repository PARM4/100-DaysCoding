package day35;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("---------------");
        System.out.println("~Pola 10~");
        System.out.println("---------------");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= 4; i++){
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println("~Pola 11~");
        System.out.println("---------------");
        for(int i = 1; i < 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
