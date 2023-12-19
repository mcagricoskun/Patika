package Method;

public class Recursive {

    public static void main(String[] args) {
        // Faktöriyel hesaplama örneği
        int sayi = 5;
        long faktoriyelSonucu = faktoriyelHesapla(sayi);

        System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyelSonucu);
    }

    // Recursive olarak faktöriyel hesaplayan fonksiyon
    static long faktoriyelHesapla(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // n! = n * (n-1)!
            return n * faktoriyelHesapla(n - 1);
        }

    }
}
