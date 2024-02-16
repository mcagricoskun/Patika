package GameTwo;

import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerDamage;
    private int playerMoney;
    private String heroName;
    private int heroId;
    private Inventory inventory;
    Scanner input= new Scanner(System.in);

    public Player(String playerName, Inventory inventory) {
        this.playerName = playerName;
        this.inventory = inventory;
    }
    public void selectHero(){

    }
}
