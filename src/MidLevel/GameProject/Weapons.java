package MidLevel.GameProject;

public class Weapons extends GameTwo.Weapon {
    String weaponName;
    private int weaponId;
    private int weaponDamage;
    private int weaponPrice;

    public Weapons(int weaponId, String weaponName, int weaponDamage, int weaponPrice) {
        this.weaponName = weaponName;
        this.weaponId = weaponId;
        this.weaponDamage = weaponDamage;
        this.weaponPrice = weaponPrice;
    }

    public static Weapons[] weapons() {
        Weapons[] waeponList = new Weapons[3];
        waeponList[0] = new Weapons(1, "Pistol", 2, 5);
        waeponList[1] = new Weapons(2, "Sword", 3, 35);
        waeponList[2] = new Weapons(3, "Rifle", 7, 45);
        return waeponList;
    }

    public static Weapons getWeaponById(int id){
        for (Weapons w : Weapons.weapons()){
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

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
