package MidLevel.Interfaces;

public interface IBanka {

    //değişken tanımlanamaz final tanımlanabilir
    final String hostIpAddress = "127.0.0.1";

    boolean connect (String ipAddress);
    boolean payment(double price, String cardNumber, String expireDate, String CVC);


}
