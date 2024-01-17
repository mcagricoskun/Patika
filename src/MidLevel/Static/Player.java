package MidLevel.Static;

/*
Static Kullanımı

Java'da Static deyimi, sınıf değişkenlerini ve ya sınıf metotlarını tanımlarken kullanılır.
Eğer bir sınıfa ait değişkenlerin başına "static" yazılırsa, o değişkenler artık sınıf değişkeni olurlar.
Sınıf değişkeni olarak tanımlanan değişkenler, her nesne oluşturduğumuzda ayrı ayrı oluşmazlar.
Sınıfa ait ne kadar nesne olursa olsun, sınıf değişkenleri 1 tanedir. Sınıfa ait herhangi bir nesne üzerinden bu değişkene ulaşılabilir.
Sınıf değişkenlerinin bir diğer özelliği ise, ilgili sınıfa ait hiç nesne oluşturulmasa bile bellekte yer kaplarlar.
 */

public class Player {
    // static dediğimiz için onlinePlayer nesne üretmese de hafızada saklanır
    // yani aşağıda p1 p2 p3 üretmeden de değişken hafızada yer alır
    static int onlinePlayers;

    Player() {
        onlinePlayers++;
    }

    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        System.out.println("Online oyuncular : " + Player.onlinePlayers);
    }
}
