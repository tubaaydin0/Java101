import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Random rand= new Random();
       int r= rand.nextInt(100); // 0-100 arası random sayı üretildi.
        Scanner inp=new Scanner(System.in);
        int sayi;
        int hak=0;
        int[] yanlisTahmin=new int[5];
        boolean isWin=false;
        boolean isWrong=false;
        while (hak<5){
            System.out.println("Bir sayı giriniz: ");
            sayi=inp.nextInt();
            if (sayi<0  || sayi>99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz: ");
                if (isWrong){
                    hak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: "+(5-hak));

                } else{
                    isWrong=true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;

            }
            if (sayi==r){
                System.out.println("Tebrikler, doğru bildiniz. Tahmin ettiğiniz sayı: "+r);
                isWin=true;
                break;
            }else {
                yanlisTahmin[hak]=sayi;
                hak++;
                System.out.println("Hatalı bir sayı girdiniz.");
                if (sayi<r){
                    System.out.println("Girdiğiniz değer üretilen sayıdan küçük.");
                } else{
                    System.out.println("Girdiğiniz değer üretilen sayıdan büyük.");
                }
                System.out.println("Kalan hakkınız: "+(5-hak));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz...");
            if (!isWrong) {
                System.out.println("Tahmin ettikleriniz: " + Arrays.toString(yanlisTahmin));

            }
        }


        }

    }
