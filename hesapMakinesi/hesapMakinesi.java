package deneme;
import java.util.Scanner;

public class hesapMakinesi {
	
	    public static void main(String[] args) {
	        int n1,n2,select;
	        Scanner x= new Scanner(System.in);
	        System.out.print("Ýlk sayiyi giriniz");
	        n1= x.nextInt();
	        System.out.print("Diðer  sayiyi giriniz");
	        n2=x.nextInt();
	        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
	        System.out.print("Seciminiz:");
	        select=x.nextInt();
	       
	        switch (select) {
	            case 1:
	                System.out.print("Toplam Sonucu:"+(n1+n2));
	                break;
	            case 2:
	                System.out.print("Cikarma Sonucu:"+(n1-n2));
	                break;
	            case 3:
	                System.out.print("Carpma Sonucu:"+(n1*n2));
	                break;
	            case 4:
	                System.out.print((n2!=0) ? ("Bolme Sonucu:"+ (n1/n2)) : "Sayi sifira bolunemez");
	                break;
	            default:
	                System.out.print("Yanlis secim yaptiniz.");
	                break;
	        }
	           
	               
	           
	        }
	       
	    }


