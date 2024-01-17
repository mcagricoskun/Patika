package Beginner.Method;

import java.util.Scanner;

public class RecursiveAsalSayi {
    static boolean isASal(int a, int i) {
        if (a < 2) {
            return false;
        }
        if (a == i) {
            return true;
        }
        if (a % i == 0) {
            return false;
        }
        return isASal(a, i + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:  ");
        int a = input.nextInt();

        boolean result = isASal(a, 2);
        if (result) {
            System.out.println(a + " Asaldır");
        } else {
            System.out.println(a + " Asal sayı değildir");
        }

    }
}
