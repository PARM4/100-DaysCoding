package day34;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("---------------");
        String nama8 = "~Pola 8~";
        System.out.println(nama8);
        System.out.println("---------------");
        for(int i =1; i <= 4; i++){
            System.out.println("");
            for(int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.println("---------------");
        String nama9 = "~Pola 9~";
        System.out.println(nama9);
        System.out.println("---------------");
        for(int i = 1; i <= 5; i++){
            System.out.println("");
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 5; j >= i; j--){
                System.out.print("* ");
            }
            
        }
    }
    
}
