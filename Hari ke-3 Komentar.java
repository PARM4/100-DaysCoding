package komentar;

public class Komentar {
    public static void main(String[] args) {
        
    //1. End Of Line Comment
    //isi komentar program hanya dapat baris saja
    // deklarasi variabel
        int a, b, c;        
    // memberikan nilai
        a = 5;
        b = 7;
    // proses
        c = a + b;
    // cetak varibel
        System.out.println("Hasilnya = "+c);
 
        
    /*2. Multiple Line Comment
      isi komentar program bisa lebih dari satu baris
    */

    
    /**
     * 3. Javadoc Coment
     * semua komentar program pada saat program java dicompile tidak ikut serta dicompile, karena tidak dianggap sebagai suatu barisa program
     */
    }
    /**
     * Ini adaalah metode contoh yang mengambil dua parameter.
     *
     * @param parameterPertama Deskripsi parameter pertama.
     * @param parameterKedua Deskripsi parameter kedua.
     * @return Deskripsi nilai yang dikembalikan oleh metode.
     */ 
      public int contohMetode(int parameterPertama, String parameterKedua) {
        // Implementasi metode di sini.
        return 42;
    }
    
}
