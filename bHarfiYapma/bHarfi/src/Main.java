// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void bHarfi(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == 0 || i == 3 || i == 6) && (j == 1 || j == 2)) {
                    arr[i][j] = " * ";
                } else if((i==1 || i==2 || i==4 || i==5) && j==3){
                    arr[i][j] = " * ";
                }
                else if(j==0){
                    arr[i][j] = " * ";
                }
                else {
                    arr[i][j] = "  ";
                }
            }
        }

        for (int satir = 0; satir < arr.length; satir++) {
            for (int sutun = 0; sutun < arr[satir].length; sutun++) {
                System.out.print(arr[satir][sutun]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
      String[][] letter=new String[7][4];
      bHarfi(letter);

    }
}