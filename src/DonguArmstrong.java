import java.util.Scanner;

public class DonguArmstrong {
    public static void main(String[] args) {
        int number= 0, tempNumber=number;
        int basamakSayisi=0;
        int toplam= 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        number = input.nextInt();
        tempNumber=number;

        for(int y =1; y<=500000; y++){
            while(tempNumber !=0){
                tempNumber = tempNumber/10;
                basamakSayisi++;
            }
            System.out.println("Basamak sayısı= " + basamakSayisi);

            for(int i =1; i<=basamakSayisi; i++){
                int c = number % 10;
                number /= 10;
                System.out.println(c);
                toplam = (int) (toplam + Math.pow(c,basamakSayisi));
            }
            System.out.println(toplam);
            if (toplam==number){
                System.out.println("Armstron sayısı");
            }
            else{
                System.out.println("Arm değildir");
            }
        }
        System.out.println(number);
    }

}
