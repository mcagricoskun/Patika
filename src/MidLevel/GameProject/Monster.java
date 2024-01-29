package MidLevel.GameProject;

public class Monster {
    private int monsterId;
    private String monsterName;
    private int monsterDamage;
    private int monsterHealth;
    private int winAward;
    private int defaultHealth;

    public Monster(int monsterId, String monsterName, int monsterDamage, int monsterHealth, int winAward) {
        this.monsterId = monsterId;
        this.monsterName = monsterName;
        this.monsterDamage = monsterDamage;
        this.monsterHealth = monsterHealth;
        this.defaultHealth = monsterHealth;
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

    public int getWinAward() {
        return winAward;
    }

    public void setWinAward(int winAward) {
        this.winAward = winAward;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }
}
