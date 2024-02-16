package GameTwo;

import MidLevel.GameProject.Weapon;

public class Inventory {
    private Armor armor;
    private Weapon weapon;

    public Inventory(){
        this.weapon = new Weapon(0,"Yumruk", 2,0);
        this.armor = new Armor(0, "Paçavra", 2,0);
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
