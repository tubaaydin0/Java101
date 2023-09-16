import java.util.Scanner;
/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı
Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
kendisine eşit olan sayıya mükemmel sayı denir.*/
public class Main {
    public static void main(String[] args) {
        int sayi,top=0;
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi=inp.nextInt();
        for (int i=1; i<sayi; i++){ // girilen sayının bölenlerini bulup bunları topluyoruz.
            if (sayi%i==0){
                top+=i;
            }
        }

        if(sayi==top && sayi!=1){ //Bölenlerin toplamı sayıya eşit ve sayı 1 değilse
            System.out.println("Mükemmel sayıdır.");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}