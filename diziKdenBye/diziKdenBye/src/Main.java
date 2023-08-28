import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz:");
        int boyut=inp.nextInt();
        int[] dizi= new int[boyut];
        int a;
        System.out.println("Dizinin elemanları:");
        for (int i=0; i< boyut;i++ ) {
            System.out.println((i + 1) + ". elemanı: ");
            a = inp.nextInt();
            dizi[i] = a;
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama: "+ Arrays.toString(dizi));

    }
}