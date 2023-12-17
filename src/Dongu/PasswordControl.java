package Dongu;

import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {
        String password = "admin", newPassword = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Şifreniz: ");
        String passwordTry = input.nextLine();

        if (passwordTry.equals(password)){
            System.out.println("Hoş geldiniz");
        }
        else{
            System.out.println("Şifre sıfırlamak ister misiniz? Evet/Hayır");
            String karar = input.nextLine();

            if (karar.equals("Evet")){
                System.out.println("Yeni şifre girin: ");
                newPassword = input.nextLine();
                if (passwordTry.equals(password)){
                    System.out.println("Önceki şifre ile aynı şifre kullanılamaz!");
                }
                else {
                    password=newPassword;
                    System.out.println("Şifre oluşturuldu");
                    System.out.println("Yeni şifreniz: " + password);
                }
            }
            else {
                System.out.println("Şifre değitirmek istemediniz!");
            }


        }


    }

}
