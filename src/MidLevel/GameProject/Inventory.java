package MidLevel.GameProject;

public class Inventory {
    // private boolean water;
    //private boolean food;
    // private boolean firewood;
    private Weapons weapons;
    private Armor armor;

    public Inventory() {
        this.weapons = new Weapons(0, "Punch", 0, 0);
        this.armor = new Armor(0, "Rag", 0, 0);
    }


    public Weapons getWeapon() {
        return weapons;
    }

    public void setWeapon(Weapons weapons) {
        this.weapons = weapons;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
