package MidLevel.GameProject;

public class Store extends HomeLand {

    public Store(Player player) {

        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to Store!");
        System.out.println("1 - Weapons");
        System.out.println("2 - Armors");
        System.out.println("3 - Exit from Store");
        System.out.println("Choose where you want to go: ");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.println("Invalide choice!");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                return true;
        }
        return true;
    }


    public void printWeapon() {
        System.out.println("-----Weapons-----");
        for (Weapons w : Weapons.weapons()) {
            System.out.println("ID: " + w.getWeaponId() + " | " + w.getWeaponName() + " ==> Price: " + w.getWeaponPrice() + " Damage: " + w.getWeaponDamage());
        }
        System.out.println("0 - Exit from store");
    }

    public void buyWeapon() {
        System.out.println("Choose weapon that you want: ");
        int selectedWeaponID2 = input.nextInt();
        while (selectedWeaponID2 < 0 || selectedWeaponID2 > Weapons.weapons().length) {
            System.out.println("Invalide choice!");
            selectedWeaponID2 = input.nextInt();
        }
        if (selectedWeaponID2 != 0) {
            Weapons selectedWeapons = Weapons.getWeaponById(selectedWeaponID2);
            if (selectedWeapons != null) {
                if (selectedWeapons.getWeaponPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Not Enough MONEY!");
                    System.out.println(this.getPlayer().getMoney());
                    System.out.println(selectedWeapons.getWeaponPrice());
                } else {
                    System.out.println("You bought: " + selectedWeapons.getWeaponName());
                    int balance = this.getPlayer().getMoney() - selectedWeapons.getWeaponPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Balance: " + this.getPlayer().getMoney());
                    System.out.println("You had: " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapons);
                    System.out.println("Your new weapon is ==>" + this.getPlayer().getInventory().getWeapon().getWeaponName());
                }

            }
        }

    }

    public void printArmor() {
        System.out.println("-----Armors-----");
        for (Armor a : Armor.armors()) {
            System.out.println("ID: " + a.getId() + " | " + a.getArmorName() + " ==> Price: " + a.getPrice() + " Damage: " + a.getBlock());
        }
        System.out.println("0 - Exit");
    }
    public void buyArmor() {
        System.out.println("Choose armor that you want: ");
        int selectedArmorID = input.nextInt();
        while (selectedArmorID < 0 || selectedArmorID > Armor.armors().length) {
            System.out.println("Invalide choice!");
            selectedArmorID = input.nextInt();
        }
        Armor selectedArmor = Armor.getArmorObjById(selectedArmorID);
        if (selectedArmorID != 0) {
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Not Enough MONEY!");
                    System.out.println(this.getPlayer().getMoney());
                    System.out.println(selectedArmor.getPrice());
                } else {
                    System.out.println("You bought: " + selectedArmor.getArmorName());
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Balance: " + this.getPlayer().getMoney());
                    System.out.println("You had: " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your new armor is ==>" + this.getPlayer().getInventory().getWeapon().getWeaponName());
                }

            }

        }
    }
}
