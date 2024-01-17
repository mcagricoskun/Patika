package Beginner.Method;

public class Temel {
    /*metod buraya yaz main içinde çağır

        veriTipi metotAdi(parametre1, parametre2, ....) {
        // kod bloğu
        }
        veriTipi : Metotlar geriye bir değer döndürebilir, bu değerin veri tipini metot tanımlanırken belirtilir. Örneğin metot geriye "integer" veri tipinde bir değer döndürecekse "veriTipi" kısmına "int" anahtar sözcüğü yazılmalıdır. Eğer metotlar geriye bir değer döndürmeyecekse "void" anahtar sözcüğü kullanılır.
        metotAdi : Metodumuzun benzersiz ismidir ve bu isimlendirme ile metotlar çağrılır.
        kod bloğu : Bu kısım metot çağrıldığı zaman, program tarafından çalışacak kod bloğudur.
        parametre1/parametre2 : Bu kısım metot içerisine aktarma istediğimiz verilerdir ve parametre olarak adlandırılır.

        METODLARDA AŞIRI YÜKLEME OVERLODAING
        void func() { ... }
        void func(int a) { ... }
        float func(double a) { ... }
        float func(int a, float b) { ... }
    */
    static void hello() {
        System.out.println("Merhaba");
    }

    static int toplama(int a, int b) {
        int result = a + b;
        return result;
        //return de ki sonuç dönsün
    }

    public static void main(String[] args) {

        int x = toplama(3, 5);
        System.out.println(x);
        hello();
        // System.out.println(hello);
        // Sout çalışmaz çünkü void tanımladık çıktı üretmiyor ama metod üstteki gibi çağrılabilir


    }
}
