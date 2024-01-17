package MidLevel.GameProject;


import java.util.Scanner;

public class Player {


    // Class Attributes
    private int damage;
    private int health;
    private int money;
    private int heroId;
    private static final int samuraiId = 1;
    private static final int archerId = 2;
    private static final int paladinId = 3;
    private String name;
    private String heroName;
    Inventory inventory;

    //Constructor
    public Player(String name) {
        this.name = name;
    }

    // Methods
    public void selectChar() {

        //Hero sınıfından herolist adında liste oluşturup içine nesneleri attım
        Hero[] heroList = {new Samurai(), new Archer(), new Paladin()};
        System.out.println("Heros! ");
        System.out.println("------------------");
        for (Hero hero : heroList) {
            System.out.println("Hero ID: " + hero.getHeroId()+
                    "\t Hero: " + hero.getHeroName() +
                    "\t Damage: " + hero.getDamage() +
                    "\t Health: " + hero.getHealth() +
                    "\t Money: " + hero.getMoney()
            );
        }
        System.out.println("------------------");

        System.out.println("Choose your hero id: ");
        Scanner input = new Scanner(System.in);
        heroId = input.nextInt();

        switch (heroId){
            case samuraiId:
                initPlayer(new Samurai());
                break;
            case archerId:
                initPlayer(new Archer());
                break;
            case paladinId:
                initPlayer(new Paladin());
                break;
            default:
                initPlayer(new Samurai());
                break;

        }
        System.out.println("You selected " + this.getHeroName());

    }
    //kullanıcının seçtiği hero nun özellikleri playera basıyorum
    public void initPlayer(Hero hero){
        this.setDamage(hero.getDamage());
        this.setHealth(hero.getHealth());
        this.setMoney(hero.getMoney());
        this.setHeroName(hero.getHeroName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


}
