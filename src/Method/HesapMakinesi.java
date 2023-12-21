package Method;

import java.util.Scanner;

public class HesapMakinesi {

    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplam= " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma= " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma= " + result);
        return result;
    }

    static int divide(int a, int b) {
        int result = a / b;
        System.out.println("Bölme= " + result);
        return result;
    }

    public static void main(String[] args) {

        String menu = "Toplama için 1\n" +
                "Çıkarma için 2\n" +
                "Çarpma için 3\n" +
                "Bölme için 4 e basınız!\n" +
                "Çıkış yapmak için 0 a basınız: ";

        Scanner input = new Scanner(System.in);
        int sec;


        do {
            System.out.println("Bir işlem seçiniz:\n" + menu);
            sec = input.nextInt();
            if (sec == 0) {
                break;
            } else {
                System.out.println("İlk sayı: ");
                int a = input.nextInt();
                System.out.println("İkinci sayı: ");
                int b = input.nextInt();
                switch (sec) {
                    case 1:
                        plus(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        times(a, b);
                        break;
                    case 4:
                        divide(a, b);
                        break;
                }
            }
        }
        while (sec != 0);


    }
}
