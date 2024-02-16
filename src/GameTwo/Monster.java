package GameTwo;

public class Monster {
    private int monsterId;
    private String monsterName;
    private int monsterDamage;
    private int monsterHealth;
    private String winAward;

    public Monster(int monsterId, String monsterName, int monsterDamage, int monsterHealth, String winAward) {
        this.monsterId = monsterId;
        this.monsterName = monsterName;
        this.monsterDamage = monsterDamage;
        this.monsterHealth = monsterHealth;
        this.winAward = winAward;
    }

    public int getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(int monsterId) {
        this.monsterId = monsterId;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public void setMonsterHealth(int monsterHealth) {
        this.monsterHealth = monsterHealth;
    }

    public String getWinAward() {
        return winAward;
    }

    public void setWinAward(String winAward) {
        this.winAward = winAward;
    }
}
