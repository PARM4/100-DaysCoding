package coding;

public class day78 {
    public static void main(String[]args){
        System.out.println("~Pola 18~");
        int a = 4;
        for(int i=1; i<=a; i++){
            for(int j=a; j>=1; j--){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=2; j<=a; j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
