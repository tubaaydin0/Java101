import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
        int a,b,ekok=1,ebob=1;
        Scanner inp= new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        a=inp.nextInt();
        System.out.println("Diğer sayıyı giriniz: ");
        b=inp.nextInt();
        int j= 1;
        while(j<=a*b){
            if(j%a==0 && j%b==0){
                ekok=j;
                break;
            }
            j++;
        }
        System.out.println("Ekok: "+ekok);
        if (a<b){
            int i=a;
            while(i>=1){
               if(a%i==0 && b%i==0){
                   ebob=i;
                   break;
               }
               i--;
            }
            System.out.println("Ebob: "+i);
        }
        else {
            int i=b;
            while(i>=1){
                if(a%i==0 && b%i==0){
                    ebob=i;
                    break;
                }
                i--;
        }
            System.out.println("Ebob: "+i);
        }


    }
}