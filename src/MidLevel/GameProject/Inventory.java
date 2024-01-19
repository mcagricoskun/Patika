package MidLevel.GameProject;

public class Inventory {
   // private boolean water;
   //private boolean food;
   // private boolean firewood;
    private Weapon weapon;

    public Inventory() {
        this.weapon = new Weapon(0, "Punch", 0, 0);
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
