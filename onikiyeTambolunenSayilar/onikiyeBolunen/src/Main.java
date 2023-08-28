import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,sayac=0,top=0;
        double ort;
        Scanner inp=new Scanner(System.in);
        System.out.printf("Bir sayı giriniz:");
        sayi=inp.nextInt();
        for(int i=0;i<=sayi;i++){
            if(i%12==0 && i!=0){
                sayac+=1;
                top+=i;
            }
        }
        ort=top/sayac;
        System.out.printf("3'e ve 4'e tam bölünen sayıların ortalaması: "+ort);

        }
    }
