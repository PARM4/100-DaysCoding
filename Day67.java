package coding;

public class day67 {
    public static void main(String[]args){
        int[] angka={6,9,5,3,9,1,5};
        int hasil = angka[0];
        System.out.println("Mencari angka terkecil");
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+" ");
        }
        
        for(int i = 0; i < angka.length; i++){
            if(angka[i] < hasil){
                hasil = angka[i];
            }
        }
        System.out.println();
        System.out.println("angka terkecil yaitu "+hasil);

    }
}
