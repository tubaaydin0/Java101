import java.util.Scanner;
/*Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

 Artık Yıl Nedir?

 Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün),
 normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

  Artık Yıl Nasıl Hesaplanır?

  Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

  1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
  100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

     Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.*/

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


