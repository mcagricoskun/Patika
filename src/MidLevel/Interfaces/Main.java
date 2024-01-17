package MidLevel.Interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tutar girin: ");
        double price = input.nextDouble();

        System.out.println("Card No giriniz: ");
        String cardNumber = input.next();

        System.out.println("Son kullanım tarihi: ");
        String expireDate = input.next();

        System.out.println("Güvenlik KOdu giriniz: ");
        String cvc = input.next();

        System.out.println("Banka seçiniz:  ");
        System.out.println("A bankası için 1 ");
        System.out.println("B bankası için 2 ");
        System.out.println("C bankası için 3 ");
        int selectedBank = input.nextInt();

        switch (selectedBank){
            case 1:
                ABankasi aPos = new ABankasi ("ABankasi", "6556461", "668461");
                aPos.connect("127.12.54");
                aPos.payment(price,cardNumber,expireDate,cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi ("BBankasi", "6556461", "668461");
                bPos.connect("127.12.54");
                bPos.payment(price,cardNumber,expireDate,cvc);
                break;

            default:
        }




    }
}
