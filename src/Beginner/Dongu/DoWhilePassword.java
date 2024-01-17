package Beginner.Dongu;

import java.util.Scanner;
public class DoWhilePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.println("Hesap şifrenizi giriniz: ");
            pass = scanner.nextInt();
            if (pass == 12345) {
                System.out.println("Doğru");
                askPassword = false;
            } else {
                System.out.println("Yanlış");
            }
        }
        while (askPassword);
    }
}

// while da koşul sağlandığı her aşamada çalışır. Önce koşula bakar sonra sağlanırsa çalışır
// do-while da ise önce ne olursa olsun bir kez çalışır sonra koşul sağlandıkça çalışır