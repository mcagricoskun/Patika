package GameTwo;

public abstract class  Hero {
    int heroID;
    String heroName;
    int heroDamage;
    int heroHealth;
    int heroGold;

    public Hero(int heroID, String heroName, int heroDamage, int heroHealth, int heroGold) {
        this.heroID = heroID;
        this.heroName = heroName;
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
        this.heroGold = heroGold;
    }
    public Hero(){

    }
}
