package deneme;
import java.util.Scanner;

public class kdvHesap {
	public static void main(String[] args) {
		double fiyat,kdvOran,kdv;
		System.out.print("Ürünün fiyatını giriniz:");
		Scanner in= new Scanner(System.in);
		fiyat=in.nextDouble();
		kdvOran=(fiyat>=0 && fiyat<=1000) ? 0.18 : 0.08;
		kdv=(fiyat*kdvOran);
		double kdvli=(fiyat+kdv);
		System.out.println("KDV'siz fiyat="+fiyat+"\nKDV'li fiyat="+kdvli+"\nKDV fiyatı="+kdv);
		
		
		
		
	}

}
