package deneme;
import java.util.Scanner;
//Kilo  ve boy bilgilerine göre vücut kitle endeksini hesaplayan program
public class vucutKitleÝndeksi {
	public static void main(String[] args) {
		double boy,kilo,index;
		Scanner input=new Scanner(System.in);
		System.out.print("Boyunuzu giriniz");
		boy=input.nextDouble();
		System.out.print("Kilonuzu giriniz");
		kilo=input.nextDouble();
		index=kilo/(boy*boy);
		System.out.print("Vücut kilo indeksiniz: "+index);
		
	}

}
