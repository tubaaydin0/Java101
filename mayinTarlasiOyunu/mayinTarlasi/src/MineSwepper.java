import java.util.Scanner;
import java.util.Random;
public class MineSwepper {
    int satir;
    int sutun;
    int sa, su; // kullanıcının gireceği değerler
    String[][] mayin;
    String[][] oyun;
    int mayinSayisi;
    int boyut;


    Random r = new Random();
    Scanner inp = new Scanner(System.in);

    MineSwepper(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
        this.mayin = new String[satir][sutun];
        this.oyun = new String[satir][sutun];
        boyut = satir * sutun;
        mayinSayisi = boyut / 4;

    }

    public void mayinBoard() {
        System.out.println("Mayınların konumu: ");

        for (int i = 0; i < mayin.length; i++) {
            for (int j = 0; j < mayin[i].length; j++) {
                mayin[i][j] = ". ";
                oyun[i][j] = ". ";
            }
        }
        //Mayın yerleştirme
        int a = 0;
        while (a != mayinSayisi) {
            int rsatir = r.nextInt(satir);
            int rsutun = r.nextInt(sutun);

            if (!(this.mayin[rsatir][rsutun].equals("* "))) {
                this.mayin[rsatir][rsutun] = "* ";
                a++;
            }


        }

        for (int i = 0; i < this.mayin.length; i++) {
            for (int j = 0; j < this.mayin[i].length; j++) {
                System.out.print(this.mayin[i][j]);
            }
            System.out.println();
        }
        System.out.println("=========================================");


    }

    public void oyunBoard() {

        mayinBoard();
        System.out.println("Mayın tarlasına hoşgeldiniz...");
        for (int i = 0; i < oyun.length; i++) {
            for (int j = 0; j < oyun[i].length; j++) {
                if (!(mayin[i][j].equals("* "))) { // Burayya gerek var mı incele.

                    this.oyun[i][j] = ". ";
                }
                System.out.print(this.oyun[i][j]);
            }
            System.out.println();
        }

        System.out.println("=========================================");

    }

    public void indisSecme() {


        while (true) {
            System.out.print("Satır numarasını giriniz: ");
            sa = inp.nextInt();
            System.out.print("Sütun numarasını giriniz: ");
            su = inp.nextInt();
            //Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli
            // ve koşul sağlanmazsa tekrar nokta istenmeli.

            if ((sa >= this.satir) || (su >= this.sutun) || (sa < 0) || (su < 0)) {
                System.out.println("Yanlış değerler girdiniz.Tekrar giriniz.");
                continue;
            }

            //Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.

            if (mayin[sa][su].equals("* ")) {
                System.out.println("Game Over...");
                break;
            }
            //Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı
            // (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz)
            // ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı.
            // Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
            else {  //seçilen kutunun etrafında kaç tane mayın varsa onu sayıyor.
                int sayac = 0;

                for (int i = (sa - 1); i <= (sa + 1); i++) {
                    for (int j = (su - 1); j <= (su + 1); j++) {
                        if (i < 0 || j < 0 || i >= satir || j >= sutun) {
                            continue;
                        }
                        if (mayin[i][j].equals("* ")) {
                            sayac++;
                        }
                    }
                }
                oyun[sa][su] = Integer.toString(sayac) + " ";
            }
            for (int i = 0; i < oyun.length; i++) {
                for (int j = 0; j < oyun[i].length; j++) {
                    System.out.print(oyun[i][j]);
                }
                System.out.println();
            }

            if (isFinish()) {

                System.out.println("Tebrikler kazandiniz :)))))");
                break;
            }


        }
    }


    //Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
    public boolean isFinish() {
        int count = 0;
        for (int i = 0; i < oyun.length; i++) {
            for (int j = 0; j < oyun[i].length; j++) {
                if (oyun[i][j].equals(". ")) { // oyun dizisi içinde açılmayan kaç tane . var say
                    count++;

                }
            }
        }

        if(count==mayinSayisi){ //Sayılan nokta sayısı mayın sayısıyla aynıysa geriye mayınlar kalır ve oyun biter.
            return true;
        }
        return false;


    }


}









