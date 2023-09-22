import java.util.Scanner;
//Girilen tam sayı değerini ondalıklı sayıya, girilen ondalıklı sayıyı tam sayıya çevirme.
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int tam=inp.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalik= inp.nextDouble();

        System.out.println((double)tam+"-"+(int)ondalik);


        }
    }
