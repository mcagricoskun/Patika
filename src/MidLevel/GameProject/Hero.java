package MidLevel.GameProject;

//Abstact aptık çünkü bu sınıftan nesne üretmeyeceğim
public abstract class Hero {

    //Attributes
    private int heroId;



    private int damage;
    private int health;
    private int money;
    private String heroName;


    // Constructor
    public Hero(int heroId, String heroName, int damage, int health, int money) {
        this.heroId = heroId;
        this.heroName = heroName;
        this.damage = damage;
        this.health = health;
        this.money = money;


    }


    //Getter and Setter
    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
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
}
