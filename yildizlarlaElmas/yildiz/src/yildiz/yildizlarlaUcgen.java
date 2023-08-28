package yildiz;
import java.util.Scanner;
public class yildizlarlaUcgen {
	 public static void main(String[] args) {
		/* int yildiz,bosluk,satir;
		 Scanner inp=new Scanner(System.in);
		 System.out.print("Satýr sayýsýný giriniz.");
		 satir=inp.nextInt();
		 bosluk=satir-1;
		 yildiz=1;
		 for(int i=0;i<satir;i++) { //kaç satýr ise o kadar çalýþýr.
			 for(int j=0; j<bosluk;j++) { // Satýrýn içi boþlukla dolduruluyor.
				 System.out.print(" ");
				 }
			 for(int k=0; k<yildiz;k++) {// Satýr yýldýzla dolduruluyor.
				 System.out.print("*"); 
			 }
			 System.out.println();
			 bosluk--; // her satýrda boþluk azalýrken
			 yildiz+=2;// yýldýz artýyor.
			 
		 }
		 yildiz-=4;// üstteki üçgenin alt kýsmýný tekrar etmemesi için 2 daha çýkardýk.
		 bosluk=1;// ters üçgenin baþlangýçta 1 boþluðu olduðu için 1 diyoruz.
		 
		 for(int i=0;i<satir-1;i++) { //bir satýr eksilttik.
			 for(int j=0; j<bosluk;j++) { // Satýrýn içi boþlukla dolduruluyor.
				 System.out.print(" ");
				 }
			 for(int k=0; k<yildiz;k++) {// Satýr yýldýzla dolduruluyor.
				 System.out.print("*"); 
			 }
			 System.out.println();
			 bosluk++; // her satýrda boþluk artarken
			 yildiz-=2;// azalýyor.
			 
		 }*/
		 int satir;
		 Scanner inp = new Scanner(System.in);
		 System.out.print("Satýr sayýsý giriniz: ");
		 satir=inp.nextInt();
		 for(int i=0; i<satir;i++) {
			 for(int j=0; j<satir-i;j++) {
				 System.out.print(" "); 
				 
			 }
			 for(int k=0;k<(2*i)+1;k++) {
				 System.out.print("*"); 
			 }
			 System.out.println(); 
			 			 			 		
		 }
		 
		 for(int i=satir-1; i>=0;i--) {
			 for(int j=satir-i; j>=0 ;j--) {
				 System.out.print(" "); 
				 
			 }
			 for(int k=(2*i-1);k>=1;k--) {
				 System.out.print("*"); 
			 }
			 System.out.println();
	 }
	 }}


