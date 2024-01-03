package coding;

public class day87 {
    public static void main(String[]args){
        System.out.println("~Pola 27~");
        int p=7, l=8;
        for(int i=1; i<=p; i++){
            if(i%2==1){
                for(int j=1; j<=l; j++){
                    if(j%2==1){
                        System.out.print(" +");
                    }else{
                        System.out.print(" =");
                    }
                }
            }else{
                for(int j=1; j<=l; j++){
                    if(j%2==1){
                        System.out.print(" =");
                    }else{
                        System.out.print(" +");
                    }
                }
            }
            System.out.println();
        }
    }
}
