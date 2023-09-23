import java.util.Scanner;
/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan
bir "Recursive" metot yazın.
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/
public class Main {
    /* //TEK METOT İLE YAPILMIŞ HALİ.
    static int desen(int deger,int temp){ //15 15, 10 15, 5 15, 0 15

       if (deger<=0){ //false, false, false, true
           System.out.print(deger+ " "); // 0
           deger+=5; //5

           if (deger>=0){ //true
               for (int i=deger;i<=temp;i=i+5) {
                   System.out.print(deger+ " "); //0, 5, 10, 15
                   deger += 5; //5, 10, 15, 20 olunca döngüden çıktı.

               }
               return deger; //Son olarak 15 değerini döndürdü ve metot bitti
           }

           return desen(deger,temp);
       }
       else {
           System.out.print(deger+ " "); //15, 10, 5
           deger-=5;//10, 5, 0

           return desen(deger,temp);//10 15, 5 15, 0 15
       }

        } */

    static int azalanDesen(int deger, int temp){ // 15 15, 10 15, 5 15, 0 15
        System.out.print(deger+" "); // 15 , 10, 5, 0
        if (deger>0){  // true, true, true, false döngüden çıktı.
            deger-=5;  //10  , 5, 0
            return azalanDesen(deger,temp); //10 15 , 5 15, 0 15
        }

        return artanDesen(deger,temp); // 0 15

    }
    static int artanDesen(int deger, int temp){ // 0 15, 5 15, 10 15, 15 15
        if (deger==temp ){ //false, false, false, true

            return deger; // 15 değerini döndürerek metot sona erdi.

        }
        deger+=5; //5, 10,15
        System.out.print(deger+ " "); //5, 10,15
        return artanDesen(deger,temp); //5 15, 10 15, 15 15

    }


    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: "); // 15 olsun
        int sayi=inp.nextInt();
        //desen(sayi,sayi);
        azalanDesen(sayi,sayi); //15 15 değerini metoda gönderdik


    }
}