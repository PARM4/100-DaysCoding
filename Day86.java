package coding;

public class day86 {
    public static void main(String[]args){
        System.out.println("~Pola 26~");
        int p=7, l=8;
        for(int i=1; i<=p; i++){
            if(i%2==0){
                for(int j=1; j<=l; j++){
                    System.out.print(" =");
                }
            }else{
                for(int j=1; j<=l; j++){
                System.out.print(" +");
                }
            }
            System.out.println();
        }
    
    }
}
