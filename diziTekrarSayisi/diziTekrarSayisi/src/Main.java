import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
       //Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
        //Tekrar Sayıları
        //10 sayısı 3 kere tekrar edildi.
        //20 sayısı 4 kere tekrar edildi.
        //5 sayısı 1 kere tekrar edildi.

        int[] dizi= {10,20,20,10,10,20,5,20};
        Arrays.sort(dizi);
        int sayac=0;
        System.out.println("Tekrar Sayıları: ");
        for (int i=0; i< dizi.length; i++){
            sayac=0;
            if (i==0) {

                for (int j = 0; j < dizi.length; j++) {
                    if (dizi[i] == dizi[j]) {
                        sayac++;
                    }
                }
                System.out.println(dizi[i]+ " sayısı "+sayac+" kez tekrar etti");
            }


            else if (dizi[i] != dizi[i-1]){
                for (int j=0; j< dizi.length;j++){
                    if (dizi[i] == dizi[j]) {
                        sayac++;
                    }
                }
                System.out.println(dizi[i]+ " sayısı "+sayac+" kez tekrar etti");
            }



        }
    }
}