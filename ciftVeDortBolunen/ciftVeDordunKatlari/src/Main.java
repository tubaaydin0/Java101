import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
       
        int sayi=0,top=0;
        Scanner inp=new Scanner(System.in);
        while(sayi%2==0){
            System.out.printf("Sayı giriniz: ");
            sayi=inp.nextInt();
            if(sayi%2==0 || sayi%4==0){
                top+=sayi;
            }

        }
        System.out.printf("Girilen sayılardan çift ve 4'ün katlarının toplamı: "+top);

    }
}