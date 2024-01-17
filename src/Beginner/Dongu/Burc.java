package Beginner.Dongu;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int month, day;
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum ayı: ");
        month = input.nextInt();

        System.out.println("Doğum günü: ");
        day = input.nextInt();


        if (month>=1 && month<=12 && month==1){
            if (day >= 1 && day <= 31){
                if (day>=22){
                    System.out.println("Burcunuz Kova");
                }
                else{
                    System.out.println("Burcunuz Oğlak");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==2){
            if (day >= 1 && day <= 31){
                if (day>=20){
                    System.out.println("Burcunuz Balık");
                }
                else{
                    System.out.println("Burcunuz Kova");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==3){
            if (day >= 1 && day <= 31){
                if (day>=21){
                    System.out.println("Burcunuz Koç");
                }
                else{
                    System.out.println("Burcunuz Balık");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==4){
            if (day >= 1 && day <= 31){
                if (day>=21){
                    System.out.println("Burcunuz Boğa");
                }
                else{
                    System.out.println("Burcunuz Koç");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==5){
            if (day >= 1 && day <= 31){
                if (day>=22){
                    System.out.println("Burcunuz İkizler");
                }
                else{
                    System.out.println("Burcunuz Boğa");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==6){
            if (day >= 1 && day <= 31){
                if (day>=22){
                    System.out.println("Burcunuz Yengeç");
                }
                else{
                    System.out.println("Burcunuz İkizler");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==7){
            if (day >= 1 && day <= 31){
                if (day>=23){
                    System.out.println("Burcunuz Aslan");
                }
                else{
                    System.out.println("Burcunuz Yengeç");
                }
            }
        }
        else{
            isError = true;
        }if (month>=1 && month<=12 && month==8){
            if (day >= 1 && day <= 31){
                if (day>=23){
                    System.out.println("Burcunuz Başak");
                }
                else{
                    System.out.println("Burcunuz Aslan");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==9){
            if (day >= 1 && day <= 31){
                if (day>=23){
                    System.out.println("Burcunuz Terazi");
                }
                else{
                    System.out.println("Burcunuz Başak");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==10){
            if (day >= 1 && day <= 31){
                if (day>=23){
                    System.out.println("Burcunuz Akrep");
                }
                else{
                    System.out.println("Burcunuz Terazi");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==11){
            if (day >= 1 && day <= 31){
                if (day>=22){
                    System.out.println("Burcunuz Yay");
                }
                else{
                    System.out.println("Burcunuz Akrep");
                }
            }
        }
        else{
            isError = true;
        }
        if (month>=1 && month<=12 && month==12){
            if (day >= 1 && day <= 31){
                if (day>=22){
                    System.out.println("Burcunuz Oğlak");
                }
                else{
                    System.out.println("Burcunuz Yay");
                }
            }
        }
        else{
            isError = true;
        }

        if(isError==true){
            System.out.println("Hatalı giriş yaptınız");
        }
    }
}

