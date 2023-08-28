package deneme;
import java.util.Scanner;

public class daire {
	public static void main(String[] args) {
		int r,aci;
		double pi=3.14,alan;
		System.out.print("Dairenin yarý çapýný giriniz: ");
		Scanner input= new Scanner(System.in);
		r=input.nextInt();
		System.out.print("Dairenin merkez açýsýnýn ölçüsünü giriniz: ");
		aci=input.nextInt();
		alan=(pi*r*r*aci)/360;
		System.out.print("Daire diliminin alaný: "+ alan);
		
	}

}
