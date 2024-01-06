package coding;
import java.util.Scanner;
public class day90 {
    public static void main(String[]args){
        int b=0;
        while(b==0){
            Scanner s = new Scanner(System.in);
            System.out.print("username : ");
            String user = s.nextLine();
            System.out.print("pasword : ");
            String pas = s.nextLine();
            if(user.equals("Parma") && pas.equals("1234")){
                System.out.println("berhasil");
                b=1;
            }else{
                System.out.println("gagal");
                b=0;
            }
        }
    }
}
