package Arrays;

/*Dizilerin Genel Mantıkları
        Java'da Diziler (Arrays) , her değer için ayrı değişkenler oluşturmak yerine, birden çok değeri tek bir
        değişkende depolamak için kullanılır. Değişkenler hafızada tek bir değer tutmamızı sağlar. Fakat bazı
        durumlarda, birden çok veriyi bir arada bulundurmak isteriz. Örneğin, bir sınıfta okuyan 20 öğrenci olsun.
        Bu 20 öğrenci için hafızada ayrı ayrı 20 tane değişken oluşturmak yerine, tek bir değişken kullanarak 20
        öğrencinin koleksiyonunu tutmak isteyebiliriz.

        Bu gibi durumlarda dizileri kullanırız. Dizi, aynı türden birden fazla değişkeni tutmamızı sağlayan hafıza
        birimidir. Kısaca, dizileri aynı türden elemanları gruplamak için kullanırız. Dizi oluşturduktan sonra
        dizinin içerisindeki elemanlara indeks numarasıyla ulaşır ve değiştiririz. Ayrıca, çok boyutlu diziler
        oluşturmak da mümkündür. Tek boyutlu dizi kullanabileceğimiz gibi 2 veya 3 boyutlu diziler de oluşturabiliriz.
        2 boyutlu dizilere matris denir.

        Dizi (Array) kavramı programlama dillerinde bir veri tipini ifade eder. Bu veri tipi liste halindeki ardışık
        verileri bir arada tutan yapıya denilir. Bu ardışık yapıya ait elemanlara indis yoluyla erişim sağlanabilir.
        Diziler sabit boyutludur ve tanımlanırken boyutları belirtilir.
*/


public class Temel {

      /*Dizinin hafızada bir başlangıç adresi olur ve ardışık olan diğer elemanlar sırayla hafızaya yerleştirilir.
        Diziler "new" anahtar sözcüğüyle oluşturulur. Böylece, Heap Hafıza bölgesinde yer kaplarlar.
        */

    //double[] myList;                            // tercih edilen yol
    //veya
    // double myList2[];                           // başka türlü tanımlama biçimi

    static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {


        //Maksimum 10 eleman alabilen "double" veri tipinde olan bir dizi oluşturulmuştur.
        double[] myList = {1.9, 2.9, 3.4, 3.5, 1.9, 2.9, 3.4, 3.5, 1.9, 2.9};


        // tüm dizi elemanlarını arada boşuk bırakarak sırayla ekrana yazdırır.
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        //boyutu yazdırılır
        System.out.println(myList.length);

        //değere yazdırdık
        int[] mylist3 = new int[15];
        for (int i = 0; i < mylist3.length; i++) {
            mylist3[i] = i * 10;
            System.out.println(mylist3[i] + " ");
        }

        // Fonk iiçne array attık parametre olarak
        printArray(myList);
    }

}
