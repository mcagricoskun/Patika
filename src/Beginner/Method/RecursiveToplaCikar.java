package Beginner.Method;

import java.util.Scanner;

public class RecursiveToplaCikar {
    static int b = 0;
    static boolean temp = true;

    static boolean garip(int a) {

        if (temp) {
            a = a - 5;
            if (a <= 0) {
                temp = false;
            }
        } else {
            a = a + 5;
            if (a == b) {
                return true;
            }
        }
        System.out.println(a);
        return garip(a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı gir: ");
        b = input.nextInt();
        if (b <= 0) {
            temp = false;
        }
        boolean result = garip(b);

    }
}
