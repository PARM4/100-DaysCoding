package coding;

public class day77 {
    public static void main(String[]args){
        System.out.println("~Pola 17~");
        int a = 4;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=a; j++){
                if(j==a-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
