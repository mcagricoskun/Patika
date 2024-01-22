package MidLevel.GameProject;

public class Armor {
    private int id;
    private int block;
    private int price;
    private String armorName;

    public Armor(int id,String armorName, int block, int price) {
        this.id = id;
        this.block = block;
        this.price = price;
        this.armorName = armorName;
    }

    public static Armor[] armors(){
        Armor [] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Beginner", 1, 15 );
        armorList[1] = new Armor(2, "Mid livel", 3 ,25);
        armorList[2] = new Armor(3, "Advanced", 5 ,40);
        return armorList;
    }

    public static Armor getArmorObjById(int id){
        for (Armor a : Armor.armors()){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }
}
