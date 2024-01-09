package coding;

public class day93 {
    
    //posedur
    public static void siswa(){
        String nama = "alex";
        int umur = 17;
        System.out.println(nama+"\t"+umur+" tahun");
    }
    //fungsi
    public static String siswi(){
        String nama = "parma";
        int umur = 19;
        return nama+"\t"+umur+" tahun";
    }
    public static void main(String[] args) {
        siswa();
        System.out.println(siswi());
    }
}
