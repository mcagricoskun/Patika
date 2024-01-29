package MidLevel.GameProject;

import javax.sql.rowset.serial.SerialStruct;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public abstract class BattleLocation extends Location {

    private Monster monster;
    private String award;
    private int maxMonsterCount;

    public BattleLocation(Player player, String name, Monster monster, String award, int maxMonsterCount) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonsterCount = maxMonsterCount;
    }

    @Override
    public boolean onLocation() {
        int monsterCount = this.randomMonsterCount();

        System.out.println("Now, You are at " + this.getLocationName());
        System.out.println("Be careful, there are " + this.getMonster().getMonsterName() + " here!!!");
        System.out.println("There can be " + monsterCount + " Monsters!!!");
        System.out.println("Attack or Escape: <a> or <e> : ");
        String decision = input.nextLine();
        decision = decision.toLowerCase();
        if (decision.equals("a") && combat(monsterCount)) {
            System.out.println("The war begins! ");
            System.out.println(this.getMonster().getMonsterName() + " defated!");
            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getWinAward());
            this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
            return true;
        }

        if (this.getPlayer().getHealth() < 0) {
            System.out.println("You are dead!");
            return false;
        }
        return true;
    }

    public boolean combat(int maxMonsterCount) {

        for (int i = 1; i <= maxMonsterCount; i++) {
            this.getMonster().setMonsterHealth((this.getMonster().getDefaultHealth()));
            playerStats();
            monsterStats();
            while (this.getPlayer().getHealth() > 0 && getMonster().getMonsterHealth() > 0) {
                System.out.println("Attack or Escape: <a> or <e> : ");
                String selectedAction = input.nextLine();
                selectedAction = selectedAction.toLowerCase();
                if (selectedAction.equals("a")) {
                    System.out.println("You hit " + getPlayer().getDamage() + " damage!");
                    this.getMonster().setMonsterHealth(this.getMonster().getMonsterHealth() - this.getPlayer().getDamage());
                    healthAfterHit();
                    if (this.getMonster().getMonsterHealth() > 0) {
                        System.out.println();
                        System.out.println(this.getMonster().getMonsterName() + " hit " + this.getMonster().getMonsterDamage() + " damage!");
                        int blockedDamage = +this.getPlayer().getInventory().getArmor().getBlock() - this.getMonster().getMonsterDamage();
                        if (blockedDamage < 0) {
                            this.getPlayer().setHealth(this.getPlayer().getHealth() + blockedDamage);
                        }
                        healthAfterHit();
                    }
                }
            }
            //if(this.getMonster().g)
        }
        return true;
    }

    public void healthAfterHit() {
        System.out.println("Your health : " + getPlayer().getHealth());
        System.out.println(this.getMonster().getMonsterName() + " health is : " + this.getMonster().getMonsterHealth());

    }

    public void playerStats() {
        System.out.println("------------------------------");
        System.out.println("Player Info");
        System.out.println("Money : " + this.getPlayer().getMoney());
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getWeaponName());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmor().getArmorName());
        System.out.println("Block : " + this.getPlayer().getInventory().getArmor().getBlock());

    }

    public void monsterStats() {
        System.out.println("-----------------------------");
        System.out.println("Monster Info");
        System.out.println("Monster : " + this.getMonster().getMonsterName());
        System.out.println("Health : " + this.getMonster().getMonsterHealth());
        System.out.println("Damage : " + this.getMonster().getMonsterDamage());
        System.out.println("If you can kill this monster you will get " + this.getMonster().getWinAward() + " money");


    }


    public int randomMonsterCount() {

        Random r = new Random();
        return r.nextInt(this.getMaxMonsterCount()) + 1;
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
