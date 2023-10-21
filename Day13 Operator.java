package operator;

public class Main {
     public static void main(String[] args) {
		
	// Mendefinisikan dua angka yang akan dibagi

      byte angka1 = 9;
      float angka2 = 4.2f;

        // Melakukan operasi pembagian

      byte hasilByte = (byte)(angka1 / angka2);
      float hasilFloat = (float)(angka1 / angka2);
      double hasilDouble = angka1 / angka2;
        
        // Menampilkan hasil pembagian

     System.out.println("Hasil pembagian (byte)   : " + hasilByte);
     System.out.println("Hasil pembagian (float)  : " + hasilFloat);
     System.out.println("Hasil pembagian (double) : " + hasilDouble);

    }
}
