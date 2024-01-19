package MidLevel.GameProject;

public class Weapon {
    String weaponName;
    private int id;
    private int damage;
    private int price;

    public Weapon(int id, String weaponName, int damage, int price) {
        this.weaponName = weaponName;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] waeponList = new Weapon[3];
        waeponList[0] = new Weapon(1, "Pistol", 2, 5);
        waeponList[1] = new Weapon(2, "Sword", 3, 35);
        waeponList[2] = new Weapon(3, "Rifle", 7, 45);
        return waeponList;
    }

    public static Weapon getWeaponById(int id){
        for (Weapon w : Weapon.weapons()){
            if(w.getId() == id){
                return w;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
