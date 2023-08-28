
public class Main {
    static boolean isFind(int[] arr, int aranan){
        for (int i : arr){
            if (i==aranan){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] dizi={1,5,4,3,2,12,8,4,13,20,2,8};
        int[] tekrar = new int[dizi.length];
        int indis=0;

        for (int i=0; i< dizi.length;i++){
            for (int j=0; j< dizi.length;j++){
                if (dizi[i]==dizi[j] && dizi[i]%2==0 && i!=j ){
                    if (!(isFind(tekrar,dizi[i]))) {
                        tekrar[indis++] = dizi[i];
                        break;
                    }
                }
            }
        }
        for (int i : tekrar){
            System.out.println(i);
        }

    }
}