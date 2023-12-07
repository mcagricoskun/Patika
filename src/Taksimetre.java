import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int mesafe, minTutar = 20, acilis=10;
        double kmBasina = 2.20, ucret;

        Scanner input= new Scanner(System.in);
        System.out.println("Kat edilen mesafeyi giriniz: ");
        mesafe =input.nextInt();
        System.out.println("Kat edilen mesafe = " + mesafe);
        ucret = acilis + mesafe*kmBasina;

        Double result = (ucret > 20)? ucret : minTutar;

        System.out.println("Ödemmeniz gereken tutar: " + result);
    }
}
