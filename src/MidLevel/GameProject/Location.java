package MidLevel.GameProject;

import java.util.Scanner;

public abstract class  Location {
    public static Scanner input = new Scanner(System.in); //NEDENNN

    private Player player;
    private String name;

    //Constructor
    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    abstract boolean onLocation();


    //Get and Setter
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
