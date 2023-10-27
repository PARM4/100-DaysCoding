package percabangan1;
public class Main {
	public static void main(String[] args) {
		// percabangan dengan 1 kondisi
		int harga = 100000;
		System.out.println("Total Belanja : Rp." + harga);
			if (harga >=100000){
			System.out.println("Anda Dapat Diskon 10%");
			int diskon = 10 * harga / 100;
			harga -= diskon;
		}
		System.out.println("Total yang Dibayar : Rp." + harga);
	}
}
