package coding;
import java.util.Scanner;
public class day92 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("banyak data : "); 
        int byk = s.nextInt();
        String[][] data = new String[byk][3];
        for(int i=0; i<byk; i++){
            System.out.println("Biodata "+(i+1));
            for(int j=0; j<data[i].length; j++){
                if(j==0){
                    System.out.print("Nama : ");
                }else if(j==1){
                    System.out.print("Nim : ");
                }else{
                    System.out.print("Prodi : ");
                }
                data[i][j] = s.next();
            }
            System.out.println();
        }
        System.out.println("Nama \tNim \tProdi");
        for(int i=0; i<byk; i++){
            for(int j=0; j<data[i].length; j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();      

        }
    }
    
}
