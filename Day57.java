package coding;

public class day57 {
    public static void main(String[] args) {
        int jumlah = 0;
        int[] nilai = {70,90,86,95,78};
        System.out.println("Nilai Mahasiswa");
        for(int i = 0; i < nilai.length; i++){
            System.out.print(nilai[i]+" ");
            jumlah += nilai[i];
        }
        System.out.println();
        System.out.println("Jumlah : "+jumlah);

    }
}
