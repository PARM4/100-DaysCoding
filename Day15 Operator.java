package operatorpenugasan;
public class OperatorPenugasan {

    public static void main(String[] args) {
        int a;
        int b;

        // Pengisian nilai
        a = 5;
        b = 10;

        // penambahan
        b += a;
        // sekarang b = 15
        System.out.println("Penambahan : " + b);

        // pengurangan
        b -= a;
        // sekarang b = 10 (karena 15-5)
        System.out.println("Pengurangan : " + b);

        // perkalian
        b *= a;
        // sekarang b = 50 (karena 10*5)
        System.out.println("Perkalian : " + b);

        // Pembagian
        b /= a;
        // sekarang b=10
        System.out.println("Pembagian : " + b);

        // Sisa bagi
        b %= a;
        // sekarang b=0
        System.out.println("Sisa Bagi: " + b);

    }

}
