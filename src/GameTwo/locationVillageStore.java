package GameTwo;

public class locationVillageStore extends locationVillage {
    public locationVillageStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Dükkana hoş geidin!");
        System.out.println("Silah almak için -------> 1");
        System.out.println("Zırh almak için --------> 2");
        System.out.println("Dükkandan çıkmak için --> 3");

        int decision = input.nextInt();
        while (decision < 1 || decision > 3) {
            System.out.println("Yanlış seçin yaptın, tekrar dene!");

            decision = input.nextInt();
        }

        switch (decision) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                // printArmor;
                //buyArmor;
                break;
            case 3:
                return true;
        }
        return true;
    }
    public void printWeapon() {
        System.out.println("Satın alabileceğin silahlar:");
        for (Weapon w : Weapon.weapons()) {

            int id = w.getWeaponId();
            String name = w.getWeaponName();
            int price = w.getWeaponPrice();
            int damage = w.getWeaponDamage();

            System.out.println("ID: " + id + " | " + name + " ==> Price: " + price + " Damage: " + damage);
        }
        System.out.println("Çıkmak için -> 0");
    }

    public void buyWeapon() {
        System.out.println("Almak istediğin silahın ID sini seç!");

        int selectedWeaponID = input.nextInt();
        while (selectedWeaponID < 0 || selectedWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz seçim, tekrar dene:");
            selectedWeaponID = input.nextInt();
        }
        if (selectedWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponById(selectedWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getWeaponPrice() > this.getPlayer().getPlayerMoney()) {
                    System.out.println("Altının yetersiz!");
                    System.out.println("Sahip olduğun altın: " + this.getPlayer().getPlayerMoney());
                    System.out.println("Almak istediğin silah: " + selectedWeapon.getWeaponPrice() + " altın.");
                } else {
                    System.out.println(selectedWeapon.getWeaponName() + " Satın aldın!");

                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                    int balance = this.getPlayer().getPlayerMoney() - selectedWeapon.getWeaponPrice();
                    this.getPlayer().setPlayerMoney(balance);
                    System.out.println(this.getPlayer().getPlayerMoney() + " altının kaldı");

                    System.out.println("Yeni silahın : " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                }
            }
        }
    }


}
