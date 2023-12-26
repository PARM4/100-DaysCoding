package coding;

public class day79 {
    public static void main(String[]args){
        System.out.println("~Pola 19~");
        int a = 4;
        for(int i=1; i<a; i++){
            for(int j=1; j<=a; j++){
                if(j==i){
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
        for(int i=1; i<=a; i++){
            for(int j=a; j>=1; j--){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=2; j<=a; j++){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
