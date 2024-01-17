package Beginner.SinifNesne;

public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

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
    // ...

    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        Car bmw = new Car();
        bmw.speed = 25;
        System.out.println("Bmw Hızı : " + bmw.speed);

        Car mercedes = new Car();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);

        //. ile sınıf metoduna erişilir

        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printSpeed();

        mercedes.speed = 20;
        mercedes.printSpeed();

    }
}
