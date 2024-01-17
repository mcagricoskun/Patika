package MidLevel.GameProject;

public abstract class HomeLand extends Location{


    //Constructor
    public HomeLand(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true; // ölme ihtimalim yok
    }
}
