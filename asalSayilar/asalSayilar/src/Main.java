import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,i;
        for ( num = 2; num <= 100; num++) {
            for( i=2 ; i<=num;i++){ // num kendine kadar olan sayılara bölünecek. ne zamanki num/i 0 olursa o zaman içteki döngüyü terk edecek.
                if (num%i ==0){
                    break;
                }
            }
            
            if(num==i) // num kendine kadar olan sayılara tam bölündüğünde num ve bölen sayı birbirine eşitse  ekrana yazdıracak. Değilse num kendinden başka sayılara bölünüyor demektir.Bu da asal sayı olmadığını gösterir.
            System.out.print(num+" ");


        }
    }
}