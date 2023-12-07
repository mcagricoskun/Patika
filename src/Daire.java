import java.sql.SQLOutput;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double yariCap, alan, cevre, pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı girin: ");
        yariCap = input.nextDouble();

        alan = pi*yariCap*yariCap;
        cevre = 2 * pi * yariCap;

        System.out.println("Alan= " + alan);
        System.out.println("Çevre= " + cevre);
    }
}
