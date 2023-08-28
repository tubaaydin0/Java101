package deneme;
import java.util.Scanner;

public class ucgenAlan {
	public static void main(String[] args) {
		int k1,k2,k3;
		double u,alan;
		Scanner input= new Scanner(System.in);
		System.out.print("1. kenarý giriniz:");
		k1=input.nextInt();
		System.out.print("2. kenarý giriniz:");
		k2=input.nextInt();
		System.out.print("3. kenarý giriniz:");
		k3=input.nextInt();
		u=(k1+k2+k3)/2;
		alan=Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
		System.out.print("Üçgenin Alaný: "+alan);
				
				
				
	}
	
	
}
