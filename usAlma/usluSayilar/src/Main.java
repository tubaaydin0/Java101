import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int sayi,us,sonuc=1;
       Scanner inp=new Scanner(System.in);
       System.out.println("Üssü alınacak sayıyı giriniz: ");
       sayi= inp.nextInt();
       System.out.println("üssü giriniz: ");
       us= inp.nextInt();
       
        for (int i = 1; i <= us; i++) {
            sonuc*=sayi;
        }
        System.out.println("sonuç= " + sonuc);
    }
}