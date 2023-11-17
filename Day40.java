package day40;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("~Pola 14~");
        System.out.println("------------------");
        for(int i = 1; i < 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 5; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
