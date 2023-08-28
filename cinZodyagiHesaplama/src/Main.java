import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int dogumYili;
       String burc;
       Scanner inp= new Scanner(System.in);
       System.out.print("Doğum yılınızı giriniz:");
       dogumYili=inp.nextInt();
       if((dogumYili%12)==11) {
           burc="Koyun";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }
       else if ((dogumYili%12)==10) {
           burc="At";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }
       else if ((dogumYili%12)==9) {
           burc="Yılan";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }
       else if ((dogumYili%12)==8) {
           burc="Ejderha";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }

       else if ((dogumYili%12)==7) {
        burc="Tavşan";
        System.out.print("Çin Zodyağı Burcunuz:"+burc);
    }

       else if ((dogumYili%12)==6) {
           burc="Kaplan";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);}
       else if ((dogumYili%12)==5) {
               burc="Öküz";
               System.out.print("Çin Zodyağı Burcunuz:"+burc);
           }
       else if ((dogumYili%12)==4) {
           burc="Fare";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }
       else if ((dogumYili%12)==3) {
           burc="Domuz";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }
       else if ((dogumYili%12)==2) {
           burc="Köpek";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }
       else if ((dogumYili%12)==1) {
           burc="Horoz";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }

       else {
           burc="Maymun";
           System.out.print("Çin Zodyağı Burcunuz:"+burc);
       }
    }
    }
