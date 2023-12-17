package Dongu;

import java.util.Scanner;

public class HackerRankIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a number:");
        int N = input.nextInt();

        if (1<=N && N<=100 ){
            if (N % 2 == 0 && 2<=N && N<= 5){
                System.out.println("Not Weird");
            }
            else if (N % 2 == 0 && 6<=N && N<= 20) {
                System.out.println("Weird");
            }
            else if (N % 2 == 0 && 20<=N) {
                System.out.println("Not Weird");
            }
            else if (N % 2 == 1){
                System.out.println("Weird");
            }
        }
        else {
            System.out.println("Error");
        }
    }
}
