package Beginner.Temel;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double x, y, z;

        Scanner input = new Scanner(System.in);
        System.out.println("1. kenarı girin: ");
        x = input.nextDouble();

        System.out.println("2. kenarı girin: ");
        y = input.nextDouble();

        z = Math.sqrt(x*x+y*y);

        System.out.println("Hiponetüs = " + z);
    }
}
