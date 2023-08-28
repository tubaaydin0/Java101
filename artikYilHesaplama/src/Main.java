import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int yuzlerBas,binlerBas,sayi,sonIki;
        Scanner inp=new Scanner(System.in);
        System.out.print("Yılı giriniz:");
        sayi=inp.nextInt();//1985
        binlerBas=sayi/1000;//binler basamağındaki sayı
        yuzlerBas=(sayi-(binlerBas*1000))/100;//yüzler basamağındaki sayı
        sonIki=sayi-(binlerBas*1000)-(yuzlerBas*100);//son iki hanesi
        if(sayi%100==0) {
            if (sayi % 400 == 0) {
                System.out.print("artık yıldır.");
            }
            else{
                System.out.print("artık yıl değildir.");
            }
        }
        else {
            if (sonIki % 4 == 0)
            {
                System.out.print("artık yıldır.");
            }
            else{
                System.out.print("artık yıl değildir.");
            }
        }


    }



}


