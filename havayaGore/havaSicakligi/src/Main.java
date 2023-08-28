import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
S       ıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
        int sicaklik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık derecesini giriniz:");
        sicaklik=inp.nextInt();
        if(sicaklik<5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(sicaklik>=5 && sicaklik<=15){
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        else if (sicaklik>15 && sicaklik<=25) {
            System.out.print("Pikniğe gidebilirsiniz.");

        }
        else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
    }
