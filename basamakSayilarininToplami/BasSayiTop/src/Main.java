import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        int number,basValue,sum=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        number= inp.nextInt();
        int tempNumber=number;
        while(tempNumber!=0){//basamak sayısındaki rakamları toplayan
            basValue=tempNumber%10;
            sum+=basValue;
            tempNumber/=10;

        }
        System.out.printf("Basamak sayılarının toplamı: "+sum);
    }
}