//Dizinin transpozunu bulan program.
public class Main {
    public static void main(String[] args) {
        int[][] dizi={
                {1,2,3},
                {4,5,6},
        };
        int [][] tDizi=new int[3][2];

        System.out.println("Matris:");

        for (int i=0; i<dizi.length; i++){
            for (int j=0; j< dizi[i].length; j++){
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0; i<tDizi.length; i++){
            for (int j=0; j< tDizi[i].length; j++){
                tDizi[i][j]=dizi[j][i];
            }
        }
        System.out.println("Transpoze:");

        for (int i=0; i< tDizi.length;i++){
            for (int j=0; j<tDizi[i].length;j++){
                System.out.print(tDizi[i][j]+" ");
            }
            System.out.println();
        }

    }
}
