package Beginner.Dongu;

public class DonguArmstronV2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 500000; i++) {
            int b=i;
            int basamakSayisi=0;
            int temp=i;
            int toplam=0;
            while (b != 0) {
                b = b / 10;
                basamakSayisi++;
            }
            for(int y =1; y<=basamakSayisi; y++){
                int c = temp % 10;
                temp /= 10;
                toplam = (int) (toplam + Math.pow(c,basamakSayisi));
            }
            if(toplam == i){
                System.out.println(i);
            }
        }
    }
}