package Dongu;

import java.util.Scanner;

public class DonguCiftSayi {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i=1; i<=number; i++){
            if(i %2 ==0){
                System.out.println(i + ",");
            }
        }


    }
}
