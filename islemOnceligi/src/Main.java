import java.util.Scanner;
/*Soru: Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın. İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.

Örnek: Kullanıcıdan alınan sayılar 10, 2 ve 3 olsun. Yapılacak işlem ise 10+2*3-2 şeklinde olsun. 

İpucu 1: Kullanıcıdan veri almak için `Scanner` sınıfını kullanabilirsiniz.

İpucu 2: Sonucu ekrana yazdırmak için `System.out.println()` metodunu kullanabilirsiniz.*/
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int a=inp.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int b=inp.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        int c=inp.nextInt();
        System.out.print("Sonuç: "+ (a+b*c-b));
    }
}
