package zodiak;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner hewan = new Scanner(System.in);
        int tanggal, bulan;
        
        System.out.print("Masukkan tanggal lahir anda(1-31): ");
        tanggal = hewan.nextInt();
        
        System.out.print("Masukkan bulan lahir anda(1-12):");
        bulan = hewan.nextInt();
        
        String zodiak =" ";
        
        if ((bulan == 3 && tanggal >=21) || (bulan == 4 && tanggal <=19 )) {
           zodiak = "Aries";
        } else if ((bulan == 4 && tanggal >=20) || (bulan == 5 && tanggal <=20)) {
           zodiak = "Taurus";
        } else if ((bulan == 5 && tanggal >=21) || (bulan == 6 && tanggal <=20)) {
           zodiak = "Gemini";
        } else if ((bulan == 6 && tanggal >=21) || (bulan == 7 && tanggal <=22)) {
      	 zodiak = "Cancer";
        } else if ((bulan == 7 && tanggal >=23) || (bulan == 8 && tanggal <=22)) {
          zodiak = "Leo";
        } else if ((bulan == 8 && tanggal >=23) || (bulan == 9 && tanggal <=22)) {
        zodiak = "Virgo";
        } else if ((bulan == 9 && tanggal >=23) || (bulan == 10 && tanggal <=22)) {
        zodiak = "Libra";
        } else if ((bulan == 10 && tanggal >=23)|| (bulan == 11 && tanggal <=21)) {
         zodiak = "Scorpio";
        } else if ((bulan == 11 && tanggal >=22)|| (bulan == 12 && tanggal <=21)) {
        zodiak = "Sagittarius";
        } else if ((bulan == 12 && tanggal >=22)|| (bulan 
