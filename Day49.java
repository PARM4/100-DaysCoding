package day49;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("~Pola 15~");
        System.out.println("----------------");
        for(int i = 1; i <= 7; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println("~Pola 16~");
        System.out.println("----------------");
        for(int i = 7; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    
}
