package SinifNesne.MaasHesabi;

public class main {
    public static void main(String[] args) {
        Employee Yavuz = new Employee("Yavuz", 50000, 45, 2022);
        Employee Cagri = new Employee("Cagri", 500000, 45, 2022);
        Yavuz.printEmployee();
        Cagri.printEmployee();

    }
}
