package Beginner.Temel;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double r, alan, cevre, pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı girin: ");
        r = input.nextDouble();

        alan = pi*r*r;
        cevre = 2 * pi * r;

        System.out.println("Alan= " + alan);
        System.out.println("Çevre= " + cevre);
    }
}
