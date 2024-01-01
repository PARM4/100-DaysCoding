package coding;

public class day85 {
    public static void main(String[]args){
        System.out.println("~Pola 25~");
        int p=5, l=7;
        for(int i=1; i<=p; i++){
            for(int j=1; j<=l; j++){
                if(j%2==0){
                    System.out.print(" =");
                }else{
                    System.out.print(" +");
                }
            }
            System.out.println();
        }
    }
}
