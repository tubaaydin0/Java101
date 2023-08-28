import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int satir,sutun;
        Scanner inp=new Scanner(System.in);
        System.out.print("Oyunun başlangıç satır sütun bilgilerini yazınız: \nSatır: ");
        satir=inp.nextInt();
        System.out.print("Sütun: ");
        sutun=inp.nextInt();


        MineSwepper m= new MineSwepper(satir,sutun);
        m.oyunBoard();
        m.indisSecme();


    }
}