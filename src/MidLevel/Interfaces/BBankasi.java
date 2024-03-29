package MidLevel.Interfaces;

public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;
    private String password;

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip " + ipAddress);
        System.out.println("Makina ip " + this.hostIpAddress);
        System.out.println(this.bankaAdi + " Bağlanıldı");
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expireDate, String CVC) {
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem başarılı");
        return false;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BBankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }


}


