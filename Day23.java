package ganjilgenap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner angka = new Scanner (System.in);
			System.out.print("Masukkan angka = ");
			int bilangan = angka.nextInt();
			if (bilangan % 2 == 0){
			System.out.println(bilangan + " Bilangan Genap");
			}else{
			System.out.println(bilangan + " Bilangan Ganjil");
			}
			
	}
}
