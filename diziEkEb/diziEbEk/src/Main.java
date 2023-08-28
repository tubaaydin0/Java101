import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı
        // ve en büyük en yakın sayıyı bulan programı yazınız.
        int[] arr={15,12,788,1,-1,-778,2,0};
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int aranan=inp.nextInt();
        Arrays.sort(arr);
        int max=0,min=0;
        for(int i: arr){
            if ((aranan-i)>0){
                min=aranan;

                if ((aranan-i)<min){
                    min=i;
                }
            }
            else if ((aranan-i)<0){
                max=i;
                break;

            }
        }
        System.out.println("Girilen sayı: "+aranan);
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+max);



        }

        }

