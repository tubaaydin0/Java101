import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program. Eleman sayısını kullanıcıdan alın.
        /*eleman1 eleman2     nextE
           0        1        1
           1        1        2
           1        2        3
           2        3        5
           3        5        8
            şeklinde devam ediyor. */
        int n,eleman1=0,eleman2=1,nextE;
        Scanner inp= new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        n= inp.nextInt();
        System.out.print("Fibonacci dizisi: ");
        for (int i = 1; i <=n; i++) {
            System.out.print(eleman1+","); // En başa 0 yazması için ilk olarak eleman1'i yazdırıyoruz.
            nextE=eleman1+eleman2;
            eleman1=eleman2;
            eleman2=nextE;

        }
    }
}