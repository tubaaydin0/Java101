import java.util.Scanner;
public class Main {
    /*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart*/
    public static void main(String[] args) {
       int month,day;
       String burc="";
       boolean isError=false;
       Scanner inp=new Scanner(System.in);
       System.out.printf("Doğduğunuz ay:");
       month=inp.nextInt();
       System.out.printf("Doğduğunuz gün:");
       day=inp.nextInt();
       if(month==1){
           if(day>=1 && day <=28) {
               if (day <= 21) {
                   burc = "Oğlak";

               } else {
                   burc="Kova";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==2){
               if(day>=1 && day <=31) {
                   if (day <= 19) {
                       burc = "Kova";

                   } else {
                       burc="Balık";
                   }
               }
               else{
                   isError=true;
               }
       }
       else if(month==3){
           if(day>=1 && day <=31) {
               if (day <= 20) {
                   burc = "Balık";

               } else {
                   burc="Koç";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==4){
           if(day>=1 && day <=30) {
               if (day <= 20) {
                   burc = "Koç";

               } else {
                   burc="Boğa";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==5){
           if(day>=1 && day <=31) {
               if (day <= 21) {
                   burc = "Boğa";

               } else {
                   burc="İkizler";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==6){
           if(day>=1 && day <=30) {
               if (day <= 22) {
                   burc = "İkizler";

               } else {
                   burc="Yengeç";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==7){
           if(day>=1 && day<=31) {
               if (day<= 22) {
                   burc = "Yengeç";

               } else {
                   burc="Aslan";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==8){
           if(day>=1 && day <=31) {
               if (day <= 22) {
                   burc = "Aslan";

               } else {
                   burc="Başak";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==9){
           if(day>=1 && day <=30) {
               if (day <= 22) {
                   burc = "Başak";

               } else {
                   burc="Terazi";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==10){
           if(day>=1 && day <=31) {
               if (day <= 22) {
                   burc = "Terazi";

               } else {
                   burc="Akrep";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==11){
           if(day>=1 && day <=30) {
               if (day <= 21) {
                   burc = "Akrep";

               } else {
                   burc="Yay";
               }
           }
           else{
               isError=true;
           }
       }
       else if(month==12){
           if(day>=1 && day <=31) {
               if (day <= 21) {
                   burc = "Yay";

               } else {
                   burc="Oğlak";
               }
           }
           else{
               isError=true;
           }
       }
       if(isError){
           System.out.printf("Hatalı giriş yaptınız, tekrar deneyiniz.");
       }
       else {
           System.out.printf("Burcunuz:"+burc);
       }




    }
}



