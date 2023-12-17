package Temel;

import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        //Değişkenleri oluşturduk
        int mat, fizik, kimya, turkce;

        //Scanner nesnemizi oluşturduk
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan veri istedik
        System.out.println("Matematik Notunuzu: ");
        mat =inp.nextInt();

        System.out.println("Fizik Notunuzu: ");
        fizik =inp.nextInt();

        System.out.println("Kimya Notunuzu: ");
        kimya =inp.nextInt();

        System.out.println("Turkçe Notunuzu: ");
        turkce =inp.nextInt();

        float ortalama = (mat+fizik+kimya+turkce)/4f;
        System.out.println("Ortalamanız: " + ortalama);

        //Geçme kalma durumu belitme
        boolean kosul = ortalama>=60;
        String gecme = (kosul)? "Geçtiniz" : "Kaldınız";

        System.out.println(gecme);

    }
}
