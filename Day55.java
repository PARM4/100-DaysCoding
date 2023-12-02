package day55;

public class Main {
    
    public static void main(String[] args) {
        int[] a={45,78,71,89,93,58,62,63,34,78};
        System.out.println("Nilai Mata Kuliah Jaringan");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Kategori");
        for(int i = 0; i < a.length; i++){
            if(a[i] > 70){
                System.out.println(a[i]+" Lulus");
            }else{
                System.out.println(a[i]+" Gagal");
            }
        }
    }
    
}
