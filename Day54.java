package day54;

public class Main {
    
    public static void main(String[] args) {
        int[] a ={2,6,0,9,5};
        int jml = a.length;
        int maks = 0, min = 0;
        System.out.println("Deret Angka");
        for(int i = 0; i < jml; i++){
            System.out.print(a[i]+" ");
            if(a[i] > maks){
                maks = a[i];
            }if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println();
        System.out.println("Maks : "+maks);
        System.out.println("Min  : "+min);
    }
    
}
