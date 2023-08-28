import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double mesafe;
       int yas,yTipi;
       Scanner inp= new Scanner(System.in);
       System.out.print("Mesafeyi km cinsinden yazınız:");
       mesafe=inp.nextDouble();
       System.out.print("Yaşınızı yazınız:");
       yas=inp.nextInt();
       System.out.print("Yolculuk tipiniz nedir? (1-Tek Yön/2-Çift Yön)");
       yTipi=inp.nextInt();
       double tutar=mesafe*0.10;
       if(mesafe>0 && yas>0){
          if(yTipi==1){
              if(yas<12){
                  tutar=tutar*0.5;
                  System.out.print("Ödenecek Tutar :"+tutar);
              }
              else if(yas>=12 && yas<=24){
                  tutar=tutar*0.9;
                  System.out.print("Ödenecek Tutar :"+tutar);
              }
              else if (yas>24 && yas<=65){
                  System.out.print("Ödenecek Tutar :"+tutar);
              }
              else if(yas>65){
                  tutar=tutar*0.7;
                  System.out.print("Ödenecek Tutar :"+tutar);

              }

          }
          else if(yTipi==2){
              if(yas<12){
                  tutar=((tutar*0.5)*0.8)*2;
                  System.out.print("Ödenecek Tutar :"+tutar);
              }
              else if(yas>=12 && yas<=24){
                  tutar=((tutar*0.9)*0.8)*2;
                  System.out.print("Ödenecek Tutar :"+tutar);
              }
              else if (yas>24 && yas<=65){
                  tutar=(tutar*0.8)*2;
                  System.out.print("Ödenecek Tutar :"+tutar);
              }
              else if(yas>65){
                  tutar=((tutar*0.7)*0.8)*2;
                  System.out.print("Ödenecek Tutar :"+tutar);

              }


          }
      }
       else{
           System.out.print("Hatalı veri girdiniz.");
       }

    }
}
