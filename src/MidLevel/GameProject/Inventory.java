package MidLevel.GameProject;

public class Inventory {
    // private boolean water;
    //private boolean food;
    // private boolean firewood;
    private Weapon weapon;
    private Armor armor;

    public Inventory() {
        this.weapon = new Weapon(0, "Punch", 0, 0);
        this.armor = new Armor(0, "Rag", 0, 0);
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
