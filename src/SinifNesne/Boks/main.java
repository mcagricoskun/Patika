package SinifNesne.Boks;

public class main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 70);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();
    }
}
