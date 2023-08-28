import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // n!/(n-r)!*r!
        int n,r,carpN=1,carpNr=1,carpr=1,sonuc=0;
        Scanner inp= new Scanner(System.in);
        System.out.println("Toplam sayı miktarını giriniz: ");
        n=inp.nextInt();
        System.out.println("Seçilen sayı miktarını giriniz: ");
        r=inp.nextInt();

        for (int i = 1; i <= n; i++) {
            carpN*=i;
        }
        for (int  j=1;  j<=r ;  j++) {
            carpr*=j;
        }
        for (int  k=1; k<=(n-r); k++) {
            carpNr*=k;
        }
       /* System.out.println("n!: "+carpN);
        System.out.println("n-r !: "+carpNr);
        System.out.println("r!: "+carpr);*/
        sonuc=carpN/(carpNr*carpr);
        System.out.println("Kombinasyon sonucu: "+sonuc);

    }
}