package zodiak;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("~Saya Dapat Memberitahukan Zodiak yang anda Miliki~");
        System.out.print("Masukkan Tanggal Lahir Anda (1-31) : ");
        int tanggal = input.nextInt();
        System.out.print("Masukkan Bulan Lahir Anda (1-12)   : ");
        int bulan = input.nextInt();
        String zodiac ="";
        if((tanggal>=21 && tanggal<=31 && bulan==3)||(tanggal>=1 && tanggal<=19 && bulan==4)){
            zodiac = "Aries";
        }else if((tanggal>=20 && tanggal<=31 && bulan==4)||(tanggal>=1 && tanggal>=20 && bulan==5)){
            zodiac = "Taurus";
        }else if((tanggal>=21 && tanggal<=31 && bulan==5)||(tanggal>=1 && tanggal<=20 && bulan==6)){
            zodiac = "Gemini";
        }else if((tanggal>=21 && tanggal<=31 && bulan==6)||(tanggal>=1 && tanggal<=22 && bulan==7)){
            zodiac = "Cancer";
        }else if((tanggal>=23 && tanggal<=31 && bulan==7)||(tanggal>=1 && tanggal<=22 && bulan==8)){
            zodiac = "Leo";
        }else if((tanggal>=23 && tanggal<=31 && bulan==8)||(tanggal>=1 && tanggal<=22 && bulan==9)){
            zodiac = "Virgo";
        }else if((tanggal>=23 && tanggal<=31 && bulan==9)||(tanggal>=1 && tanggal<=22 && bulan==10)){
            zodiac = "Libra";
        }else if((tanggal>=23 && tanggal<=31 && bulan==10)||(tanggal>=1 && tanggal<=21 && bulan==11)){
            zodiac = "Scorpio";
        }else if((tanggal>=22 && tanggal<=31 && bulan==11)||(tanggal>=1 && tanggal<=21 && bulan==12)){
            zodiac = "Sagittarius";
        }else if((tanggal>=22 && tanggal<=31 && bulan==12)||(tanggal>=1 && tanggal<=19 && bulan==1)){
            zodiac = "Capricorn";
        }else if((tanggal>=20 && tanggal<=31 && bulan==1)||(tanggal>=1 && tanggal<=18 && bulan==2)){
            zodiac = "Aquarius";
        }else if((tanggal>=19 && tanggal<=31 && bulan==2)||(tanggal>=1 && tanggal<=1 && bulan==3)){
            zodiac = "Pisces";
        }
        System.out.println("Zodiac Anda adalah : "+zodiac);
    }
    
}
