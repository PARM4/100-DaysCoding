package coding;

public class day82 {
    public static void main(String[]args){
        System.out.println("~Pola 22~");
        int a = 5;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
