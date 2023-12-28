package coding;

public class day81 {
    public static void main(String[]args){
        System.out.println("~Pola 21~");
        int a = 5;
        for(int i=1; i<a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1; i<=a; i++){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=a; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
