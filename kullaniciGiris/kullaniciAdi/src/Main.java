import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,u="patika",p="123";
        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password=input.nextLine();

        if(userName.equals(u) && password.equals(p)){
            System.out.print(("Giriş yaptınız"));
        }
        else if (userName.equals(u)) {

                System.out.print(("Şifrenizi sıfırlamak ister misiniz? (evet/hayır)"));
                String cevap = input.nextLine();
                if (cevap.equals("evet")) {
                    System.out.print(("Yeni şifrenizi giriniz:"));
                    String password2 = input.nextLine();
                    if (password2.equals("123")) {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.print("Şifre oluşturuldu");
                    }
                } else {
                    System.out.println(("Bilgileriniz yanlış"));
                }

            }
            else{
                System.out.print("Kullanıcı adınızı kontrol ediniz.");}
        }
        }





