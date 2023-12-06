import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double x, y, z;

        Scanner veri = new Scanner(System.in);
        System.out.println("1. kenarı girin: ");
        x = veri.nextFloat();

        Scanner veri2 = new Scanner(System.in);
        System.out.println("2. kenarı girin: ");
        y = veri.nextFloat();

        z = Math.sqrt(x*x+y*y);

        System.out.println("Hiponetüs = " + z);
    }
}
