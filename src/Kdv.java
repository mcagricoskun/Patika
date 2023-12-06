import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        float fiyat, kdvTutari, kdvliFiyat, kdv = 0.18f;

        //kullanıcıdan fiyat bilgisi al
        Scanner veri = new Scanner(System.in);
        System.out.println("Ürün fiyatınızı girin: ");
        fiyat = veri.nextFloat();


        //kdv ekle
        kdvliFiyat = fiyat + fiyat*kdv;
        System.out.println("Ürünün KDV li fiyatı: " + kdvliFiyat);

        //eklenen kdv miktarını bul
        kdvTutari = kdvliFiyat - fiyat;
        System.out.println("Ürüne eklenen kdv tutarı: " + kdvTutari);
    }
}
