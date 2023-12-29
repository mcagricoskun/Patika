package SinifNesne.MaasHesabi;

import java.util.SortedMap;

public class Employee {
    String name;
    double maas = 5000;
    int workHours;
    int hireYear;

    //Constructor

    public Employee(String name, double maas, int workHours, int hireYear) {
        this.name = name;
        this.maas = maas;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (maas >= 10000) {
           return maas * 0.03;
        }
        return 0;
    }

    public double bonus() {
        if (workHours > 40) {
            return  (workHours - 40) * 30;
        }
        return 0;
    }

    public double raise() {
        int yearsWorked = 2023 - hireYear;
        if (yearsWorked >= 20) {
            return maas * 0.65;
        } else if (9<=yearsWorked) {
            return  maas * 0.55;
        } else {
            return maas * 0.50;
        }
    }
    public double sum(){
       return maas + bonus() + raise() - tax();
    }
    public void printEmployee(){

        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + maas);
        System.out.println("Çalışma saati :" + workHours);
        System.out.println("Başlangıç yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Maaş artışı :" + raise());
        System.out.println("Bonus : " + bonus());
        System.out.println("Toplam maaş : " + sum());
    }
}
