package Dongu;//Negatif sayı girilene kadar girilen tek sayıların toplamı

import java.util.Scanner;

public class DonguToplama {
    public static void main(String[] args) {
        int number, toplam = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bir sayı giriniz: ");
            number = input.nextInt();
            if (number % 2 == 1) {
                toplam = number + toplam;

            }
        }
        while (number > 0) ;
        System.out.println("Girdiğiniz tek sayıların toplamı= " + toplam);


    }
}

