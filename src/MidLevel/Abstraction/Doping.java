package MidLevel.Abstraction;

/*
Soyut Sınıf (Abstract Class)
"abstract" anahtar kelimesi ile tanımlanan sınıflardır. Sınıfın içinde soyut ("abstract") metotlar veya normal
fonksiyonlar tanımlanabilir. Soyut sınıflardan "new" anahtar kelimesi ile bir nesne oluşturulamaz.

Soyut Sınıf Özellikleri:

"abstract" anahtar kelimesi ile tanımlanmış olması gerekiyor.
Soyut veya soyut olmayan fonksiyonlar tanımlanabilir.
Soyut sınıflardan "new" anahtar kelimesi ile nesne oluşturulamaz.
Kurucu metodu ve static fonksiyonlar tanımlanabilir.
"final" kelimesi ile tanımlanmış fonksiyonları içerebilir. Bu final fonksiyonlar alt sınıflarda ezilemezler (override).
 */

public abstract class Doping {
    protected double price;
    protected double[] taxes;

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // soyut metot örneği
    public abstract double calculate();


    /*
    Yukarıda soyut bir sınıf tanımladık. "abstract" kelimesi ile sınıf tanımladık, ayrıca sınıfın içinde "calculate"
    isimli "abstract" metot tanımladık. Aynı zamanda soyut olmayan metotlar da tanımladık. Senaryomuzda bir e-ticaret
    sisteminde "Doping" tipinde ek ürünler olduğunu düşünelim. İlan tarihini güncelleyen bir doping çeşidimiz olsun,
    bir de üst sırada çıkmanızı sağlayan bir doping olsun. Bu iki alt sınıfta "Doping" isimli sınıftan kalıtım alarak
    belli özellikleri kendilerine alsınlar. Fakat, her dopingin ücret hesaplama yöntemi birbirinden farklı olabilir.
    Ayrıca, her dopingin mutlaka fiyat hesaplama fonksiyonu olmalıdır.

    Yukarıdaki durumda "abstract" sınıf tanımlayıp diğer doping çeşitleri bu ATA sınıftan kalıtım alacaklardır. "calculate"
    isimli "abstract" metodu, "metod ezme" (overriding) yöntemiyle ezip metodun içini kendilerine göre dolduracaklardır.
    Alt sınıflardaki diğer özellikler soyutlama tekniğiyle dış dünyadan gizlenecektir. Dış dünyadan dopingi kullanmak
    isteyen baka bir sınıf veya kod parçası doping nesnesi üzerindeki "calculate" fonksiyonunu çağırıp fiyatı hesaplacaktır.
    Diğer iç hesaplama ve çalışma detaylarını bilmeyecektir.
     */
    public class TopOfListDoping extends Doping {

        public TopOfListDoping(double price) {
            super.setPrice(price);
        }

        // "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf
        // kendi ihtiyacına göre dolduruyor.
        // "TopOfList" isimli doping tipinde vergiler olmadığı için komisyon oranı eklenip ücret hesaplanıyor.
        //  Fakat, başka doping çeşitlerinde hesaplama farklı olabilir.
        @Override
        public double calculate() {

            return super.getPrice() + super.getPrice() * 0.35;
        }
    }

    public class UptodateDoping extends Doping {

        public UptodateDoping(double price, double[] taxes) {
            super.setPrice(price);
            super.setTaxes(taxes);
        }

        // "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor.
        // "UptodateDoping" isimli doping tipinde vergiler fiyata dahil olduğu için komisyon oranı eklenip ve vergiler hesaplanıp ücret belirleniyor.
        // Görüldüğü gibi her doping çeşidinin fiyat hesaplama yöntemleri birbirinden farklıdır. Soyutlama ile sınıflara ait iç çalışma detayları gizlenmmiş oluyor.
        // Doping tiplerinde sadece "calculate" isimli fonksiyonu dış dünyaya açtık. Diğer tüm fonksiyonlar ve özellikler sınıf içinde kaldı.
        @Override
        public double calculate() {

            return calculateTaxes() + commisionRate();
        }

        private double calculateTaxes() {

            double totalTaxValue = 0;
            for(int i=0; i < super.getTaxes().length; i++) {
                totalTaxValue += super.getTaxes()[i];
            }
            return totalTaxValue;
        }

        private double commisionRate() {
            return super.getPrice() * 0.2;
        }
    }
}
