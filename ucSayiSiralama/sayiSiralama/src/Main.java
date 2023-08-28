import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner inp= new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz:");
        sayi1=inp.nextInt();
        System.out.print("2. Sayıyı giriniz:");
        sayi2=inp.nextInt();
        System.out.print("3. Sayıyı giriniz:");
        sayi3=inp.nextInt();
        if((sayi1<sayi2) && (sayi1< sayi3)){
            if(sayi2<sayi3){
            System.out.print("Sıralama:sayi1<sayi2<sayi3: "+sayi1+"< "+sayi2+"< "+sayi3);}
            else{
                System.out.print("Sıralama:sayi1<sayi3<sayi2: "+sayi1+"< "+sayi3+"< "+sayi2);
            }

        }
        else if ((sayi2<sayi1)&& (sayi2<sayi3)) {
            if (sayi1<sayi3){
                System.out.print("Sıralama:sayi1<sayi1<sayi3: "+sayi2+"< "+sayi1+"< "+sayi3);
            }
            else {
                System.out.print("Sıralama:sayi2<sayi3<sayi1: "+sayi2+"< "+sayi3+"< "+sayi1);
            }

        }
        else {
            if(sayi2<sayi1){
                System.out.print("Sıralama:sayi3<sayi2<sayi1:"+sayi3+"< "+sayi2+"< "+sayi1);
            }
            else {
                System.out.print("Sıralama:sayi3<sayi1<sayi: "+sayi3+"< "+sayi1+"< "+sayi2);
            }
        }


    }
}