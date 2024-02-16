package GameTwo;

public class locationBattle extends Location {
    private Monster monster;
    private String award;
    private int maxMonsterCount;

    public locationBattle(Player player, String locationName, Monster monster, String award, int maxMonsterCount) {
        super(player, locationName);
        this.monster = monster;
        this.award = award;
        this.maxMonsterCount = maxMonsterCount;
    }




    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonsterCount() {
        return maxMonsterCount;
    }

    public void setMaxMonsterCount(int maxMonsterCount) {
        this.maxMonsterCount = maxMonsterCount;
    }
}
