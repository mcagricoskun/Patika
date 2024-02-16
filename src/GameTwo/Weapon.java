package GameTwo;

public class Weapon {
    private int weaponId;
    private String weaponName;
    private int weaponDamage;
    private int weaponPrice;

    public Weapon(int weaponId, String weaponName, int weaponDamage, int weaponPrice) {
        this.weaponId = weaponId;
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponPrice = weaponPrice;
    }

    //weapons adında metod oluşturdum
    public static Weapon [] weapons(){
        // dizi oluşturdum
        Weapon [] weaponList = new Weapon[3];
        //dizi içine elemanaları yerleştirdim
        weaponList [0] = new Weapon(1,"kılıç",5, 0);
        weaponList [1] = new Weapon(2,"tabanca",5, 0);
        weaponList [2] = new Weapon(3,"tüfek",5, 0);
        //dizi elemanlarını dönderdim
        return weaponList;
    }

   public static Weapon getWeaponById(int id){
        for(Weapon w: Weapon.weapons()){
            if(w.getWeaponId() == id){
                return w;
            }
        }
        return null;
   }


    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponBlock() {
        return weaponDamage;
    }

    public void setWeaponBlock(int weaponBlock) {
        this.weaponDamage = weaponBlock;
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }
}
