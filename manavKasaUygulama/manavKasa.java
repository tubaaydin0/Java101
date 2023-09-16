package deneme;
import java.util.Scanner;
/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/

public class manavKasa {
	public static void main(String[] args) {
		double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,aFiyat=2.14,eFiyat=3.67,dFiyat=1.11,mFiyat=0.95,pFiyat=5.00,toplamTutar;
		Scanner input=new Scanner(System.in);
		System.out.print("Armutun kilosu: ");
		armutKg=input.nextDouble();
		System.out.print("Elmanýn kilosu: ");
		elmaKg=input.nextDouble();
		System.out.print("Domatesin kilosu: ");
		domatesKg=input.nextDouble();
		System.out.print("Muzun kilosu: ");
		muzKg=input.nextDouble();
		System.out.print("Patlýcanýn kilosu: ");
		patlicanKg=input.nextDouble();
		
		toplamTutar=((armutKg*aFiyat)+(elmaKg*eFiyat)+(domatesKg*dFiyat)+(muzKg*mFiyat)+(patlicanKg*pFiyat));
		System.out.print("Toplam Tutar: "+toplamTutar);
	}

}
