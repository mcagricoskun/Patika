package MidLevel.GameProject;

public class SafeHouse extends HomeLand {


    //Constructor
    public SafeHouse(Player player) {
        super(player, "Safe House!");
    }
    @Override
    public boolean onLocation(){
        System.out.println("You are at home!");
        System.out.println("Your life has been renewed");
        return true;
    }
}
