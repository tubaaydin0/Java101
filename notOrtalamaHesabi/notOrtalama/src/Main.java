import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int m,t,f,k,mu;
       double ort;
       Scanner inp=new Scanner(System.in);
       System.out.print("Matematik notunuzu giriniz:");
       m=inp.nextInt();
       System.out.print("Türkçe notunuzu giriniz:");
       t=inp.nextInt();
       System.out.print("Fizik notunuzu giriniz:");
       f=inp.nextInt();
       System.out.print("Kimya notunuzu giriniz:");
       k=inp.nextInt();
       System.out.print("Müzik notunuzu giriniz:");
       mu=inp.nextInt();
      if((m>=0 && m<=100)&&(t>=0 && t<=100)&&(f>=0 && f<=100)&&(k>=0 && k<=100)&&(mu>=0 && mu<=100)){
         ort=(m+t+f+k+mu)/5;
         if(ort<=55){
             System.out.print("Sınıfta kaldınız!");
         }
         else{
             System.out.print("Tebrikler sınıfı geçtiniz!");
         }
          System.out.print("Ortalamanız: "+ort);
      }
      else{
          System.out.print("Notlarınız 0-100 aralığında olmadığından ortlama hesabı yapılamamıştır.");
      }
        }
    }
