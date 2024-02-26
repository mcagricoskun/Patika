package GameTwo;

public class Armor {
    private int armorId;
    private String armorName;
    private int armorBlock;
    private int armorPrice;

    public Armor(int armorId, String armorName, int armorBlock, int armorPrice) {
        this.armorId = armorId;
        this.armorName = armorName;
        this.armorBlock = armorBlock;
        this.armorPrice = armorPrice;
    }

    //Armor nesneleri oluşturuldu
    public static Armor [] armors(){
        Armor[] armorList = new Armor[3];
        armorList [0]= new Armor (2,"Tahta Zırh",3,5);
        armorList [1]= new Armor (3,"Demir Zırh",7,10);
        armorList [2]= new Armor (4,"Çelik Zırh",15,20);
        return armorList;
    }

    public static Armor getArmorById(int id){
        for (Armor a: Armor.armors()) {
            if(a.getArmorId() == id){
                return a;
            }
        }
        return null;
    }




    public int getArmorId() {
        return armorId;
    }

    public void setArmorId(int armorId) {
        this.armorId = armorId;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getArmorBlock() {
        return armorBlock;
    }

    public void setArmorBlock(int armorBlock) {
        this.armorBlock = armorBlock;
    }

    public int getArmorPrice() {
        return armorPrice;
    }

    public void setArmorPrice(int armorPrice) {
        this.armorPrice = armorPrice;
    }
}
