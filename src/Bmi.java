import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuz kaç metre: ");
        double boy = input.nextDouble();
        System.out.println("Kilonuz kaç kg: ");
        double kilo = input.nextDouble();

        double vki = kilo/(boy*boy);

        System.out.println("Vki = " + vki);
    }
}
