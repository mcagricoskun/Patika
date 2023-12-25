package Method;

import java.util.Scanner;

public class RecursiveUsluSayi {
     static int uslusayi(int taban, int us) {
        if (us == 0) {
            return 1;
        }
        else {
            return taban * uslusayi(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri: ");
        int taban = input.nextInt();
        System.out.println("Üs değeri: ");
        int us = input.nextInt();
        //int result = uslusayi(taban, us);
        System.out.println(taban + " üzeri " + us + " eşittir= " + uslusayi(taban, us));
    }
}

