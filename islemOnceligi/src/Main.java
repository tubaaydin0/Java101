import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int a=inp.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int b=inp.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        int c=inp.nextInt();
        System.out.print("Sonuç: "+ (a+b*c-b));
    }
}