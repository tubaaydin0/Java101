// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       double sum=0.0;
       double avarage=0.0;
       for (int i=0; i<5;i++){
           sum+=(1.0/arr[i]);
       }
      avarage=5.0/sum;

        System.out.println("Dizideki elemanların harmonik ortalaması: "+avarage);
    }
}