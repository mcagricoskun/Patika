package GameTwo;

import java.nio.file.LinkPermission;
import java.util.Random;

public abstract class locationBattle extends Location {
    private Monster monster;
    private String award;
    private int maxMonsterCount;
    private String decision;

    public locationBattle(Player player, String locationName, Monster monster, String award, int maxMonsterCount) {
        super(player, locationName);
        this.monster = monster;
        this.award = award;
        this.maxMonsterCount = maxMonsterCount;
    }

    public boolean onLocation(){

        // Determining the monster count and telling the player that count

        int monsterCount = randomMonsterCount();

        System.out.println(getLocationName() + " Alanına Hoş geldin!" + this.getPlayer().getPlayerName());
        System.out.println("Bu " + getLocationName() + " da" + monsterCount + "" + getMonster().getMonsterName() + " var");

        // Choice of run or fight
        System.out.println("Savaşmak için <a>, kaçmak için <k> bas!");
        decision = input.nextLine();

        // I have changed the option entered by the player to lower case
        decision = decision.toLowerCase();

        //
        if (decision.equals("a")){
            combat(monsterCount);
            System.out.println("Savaş bitti!");
            System.out.println(monsterCount + " " + this.getMonster().getMonsterName() + " " + " Adet öldürdün!");
           //this.getPlayer().setPlayerHealth(this.getPlayer().getDefaultHealth());
            this.getPlayer().setPlayerMoney(this.getPlayer().getPlayerMoney() + this.getMonster().getWinAward());
            return true;
        }

        if(this.getPlayer().getPlayerHealth() < 0 ){
            System.out.println("ÖLDÜN!!!");
            return false;
        }

        return true;
    }


    public boolean combat(int monsterCount){

        // I wrote as many loops as monsters to fight all the monsters
        for(int i = 1; i <=monsterCount; i++){
            this.getMonster().setMonsterHealth((this.getMonster().getDefaultMonsterHealth()));
            warStats();
            while (this.getPlayer().getPlayerHealth() > 0 && this.getMonster().getMonsterHealth() > 0){
                // Player hit
                if (decision.equals("a")){
                    System.out.println(getMonster().getMonsterName() + " a " + getPlayer().getPlayerDamage() + " hasar vurdunuz!");
                    this.getMonster().setMonsterHealth(this.getMonster().getMonsterHealth()-this.getPlayer().getPlayerDamage());
                    System.out.println(getMonster() .getMonsterName() + " un " + getMonster().getMonsterHealth() + " canı kaldı!");
                    // Monster hit
                    if (this.getMonster().getMonsterHealth() > 0){
                        System.out.println();
                        System.out.println(this.getMonster().getMonsterName() + " " + getMonster().getMonsterDamage() + " hasar vurdu!");
                        int blockedDamage = this.getPlayer().getInventory().getArmor().getArmorBlock() - this.getMonster().getMonsterDamage();
                        if (blockedDamage < 0){
                            this.getPlayer().setPlayerHealth(getPlayer().getPlayerHealth() + blockedDamage);
                        }
                        System.out.println(this.getPlayer().getPlayerHealth() + " canınız kaldı");
                    }
                }
            }
        }
        return true;
    }

    public int randomMonsterCount(){
        Random randomNumber = new Random();

        //+1 because monster count cant be 0
        return randomNumber.nextInt(getMaxMonsterCount()+1);
    }

    public void warStats(){
        System.out.println("--- Hero ---- Canavar");
        System.out.println("Can " + getPlayer().getPlayerHealth() + "----" + getMonster().getMonsterHealth());
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
