package coding;

public class day69 {
    public static void main(String[]args){
        int[] angka={4,2,9,5,2,3,9};
        int kecil = angka[0], besar = angka[0];
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < angka.length; i++){
            if(angka[i] <= kecil){
                kecil = angka[i];
            }if(angka[i] > besar){
                besar = angka[i];
            }
        }
        System.out.print("angka terkecil "+kecil+"\nberada di index : ");
        for(int i = 0; i < angka.length; i++){
            if(kecil == angka[i]){
                System.out.print(i+", ");
            }
        }
        System.out.println();
        System.out.print("angka terbesar "+besar+"\nberada di index : ");
        for(int i = 0; i < angka.length; i++){
            if(besar == angka[i]){
                System.out.print(i+", ");
            }
        }
        
    }
}
