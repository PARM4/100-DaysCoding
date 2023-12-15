package coding;

public class day68 {
    public static void main(String[]args){
        int[] angka ={3,5,9,6,2,9,7};
        int hasil = angka[0];
        System.out.println("mencari angka terbesar");
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < angka.length; i++){
            if(angka[i] > hasil){
                hasil = angka[i];
            }
        }
        System.out.println("angka terbesar ialah "+hasil);

    }
}
