import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
        int n,sayi,ilkSayi,enBuyuk,enKucuk;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz?");
        n= inp.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        ilkSayi=inp.nextInt();
        enBuyuk=ilkSayi;
        enKucuk=ilkSayi;//Kullanıcının ilk girdiği sayıyı, hem buyuk sayıyı hem de küçük sayıyı tutan değişkene eşitledik.
        for(int i =2; i<=n;i++){   // Kullanıcıdan n adet sayı girmesini istedik.İlk sayı yukarda girildiği için i'yi 2 den başlattık.
            System.out.print(i+". sayıyı giriniz: ");
            sayi= inp.nextInt();
            if(enBuyuk<sayi){  // sayi değeri enBuyuk değişkeninin değerinden büyükse enBuyuk sayi'ya eşit olur.
                enBuyuk=sayi;
            }
            if(enKucuk>sayi){ //sayi değeri enKucuk değişkeninin değerinden küçükse enKucuk sayi'ya eşit olur.
                enKucuk=sayi;
            }
        }

        System.out.println("En küçük olan: "+enKucuk);
        System.out.println("En büyük olan: "+enBuyuk);



    }
}