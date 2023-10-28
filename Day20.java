package percabangan2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int bilangan = input.nextInt();
		if (bilangan<0){
		System.out.println(bilangan+" bilangan negatif" );
		}else{
	  System.out.println(bilangan+" adalah bilangan positif");
		}	
	
	}
}
