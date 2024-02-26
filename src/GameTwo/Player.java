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
    private int defaultHealth;
    Scanner input = new Scanner(System.in);

    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectHero() {
        Hero[] herolist = {new heroArcher(), new heroPaladin(), new heroCavalry()};
        System.out.println("Hero ID ---- " + "Hero İsmi ---- " + "Hero Hasarı ---- " + "Hero Sağlığı ---- " + "Hero Altın ---- ");
        for (Hero hero : herolist) {
            System.out.println("--- " + hero.getHeroID() + " --- " + hero.getHeroName() + " --- " + hero.getHeroDamage() + "---- " + hero.getHeroHealth() + "---- " + hero.getHeroGold());
        }
        System.out.println("--------------");
        System.out.println("Hero seçimini yapınız, ID = ?");
        heroId = input.nextInt();

        switch (heroId) {
            case 1:
                initPlayer(new heroArcher());
                break;
            case 2:
                initPlayer(new heroPaladin());
                break;
            case 3:
                initPlayer(new heroCavalry());
                break;
            default:
                initPlayer(new heroArcher());
                break;
        }
        System.out.println(this.heroName + " Seçtiniz");
    }

    //mapped player and hero stats
    public void initPlayer(Hero hero) {
        this.setPlayerName(hero.getHeroName());
        this.setPlayerDamage(hero.getHeroDamage());
        this.setPlayerHealth(hero.getHeroHealth());
        this.setPlayerMoney(hero.getHeroGold());
        this.setDefaultHealth(hero.getHeroHealth());
    }

    public void printPlayerInfo(){
        System.out.println("Silahınız: ");
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = playerHealth;
    }
}
