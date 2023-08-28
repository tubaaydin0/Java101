package deneme;
import java.util.Scanner;

public class taksimetre {
	public static void main(String[] args) {
		int yol;
		double ucret=10,kmBasi=2.20;
		System.out.print("Ne kadar yol gittiniz? ");
		Scanner input= new Scanner(System.in);
		yol= input.nextInt();
		ucret += (yol*kmBasi);
		ucret= (ucret<20)? 20 :ucret ;
		System.out.print("Ödenecek Tutar: "+ucret);
		
	}
}
