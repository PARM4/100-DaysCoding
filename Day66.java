package coding;

public class day66 {
    public static void main(String[]args){
        System.out.println("Kilogram ke pound");
        for(int kg = 1; kg <= 100; kg++){
            double pound = kg*2.20462;
            System.out.println(kg+" kg = "+pound+" pound");
        }
    }
}
