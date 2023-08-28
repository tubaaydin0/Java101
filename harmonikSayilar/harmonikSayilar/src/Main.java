import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.println("n sayısını giriniz: ");
        n=inp.nextInt();
        double sum=0;
        for (int i=1; i<=n;i++){
            sum+=(1.0/i);
        }
        System.out.printf("Harmonik sayı: "+sum);
    }
}