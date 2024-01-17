package MidLevel.GameProject;


import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);


    // Class Attributes
    private int damage;
    private int health;
    private int money = 35;
    private int heroId;

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

        heroId = input.nextInt();

        switch (heroId){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
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


    public void  selectLocation(){


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
