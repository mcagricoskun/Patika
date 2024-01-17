package Beginner.SinifNesne;

// Nesneyi oluşturuken bazı varsayılan ayarlar yapmak gerekebilir.
// Sınıf adı ile aynı olmalı
//
public class CarConstructor {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    //Cons genelde nitelik ve etod arasına tanımlanır
    // Constructor (Kurucu) Metot
    // this sınıfa ait değikeni belirtir, metoda ait olan değil yani
    // nitelik kısmındaki isim ile metoddaki aynı olması daha iyi gibi
    CarConstructor(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 180;
    }
    CarConstructor(){
        System.out.println("Boş kurucu !!!");
    }


    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Speed : " + this.speed);
    }

    public static void main(String[] args) {
        CarConstructor audi = new CarConstructor("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        CarConstructor bmw = new CarConstructor("Sports", "BMW", "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        CarConstructor mercedes = new CarConstructor();
        mercedes.speed = 20;
        mercedes.printInfo();

    }
}


