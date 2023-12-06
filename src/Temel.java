import java.util.Scanner;


public class Temel {
    public static void main(String[] args) {
        System.out.println("naber");

        int yas = 30;
        System.out.println("yaş: " + yas);

        float kilo = 78.8f;
        System.out.println(kilo);

        char wGetirir = 87;
        System.out.println(wGetirir);

        int a = 5, b=3;
        boolean kosul1 = a==b;
        boolean kosul2 = a<=b;
        boolean kosul3 = a>=b;
        System.out.println(kosul1);

        boolean sonuc1 = kosul1 && kosul2;
        boolean sonuc2 = kosul2 || kosul3;
        System.out.println(sonuc1);

        //Kulannıcıdan veri almak için x tanımladık, scanner sınıfı ile nesne oluşturarak aldık
        int x;
        Scanner inputum = new Scanner(System.in);
        System.out.print("x sayısını giriniz: ");
        x = inputum.nextInt();
        System.out.println("sayınız: "+ x);

    }
}
