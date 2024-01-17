package Beginner.Dongu;

import java.util.Scanner;
public class WhilePasword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }
    }
}
// while da koşul sağlandığı her aşamada çalışır. Önce koşula bakar sonra sağlanırsa çalışır
// do-while da ise önce ne olursa olsun bir kez çalışır sonra koşul sağlandıkça çalışır