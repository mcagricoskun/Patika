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
                break;
            case 2:
                printArmor();
                break;
            case 3:
                return true;
        }
        return true;
    }



    public void printWeapon(){
        System.out.println("-----Weapons-----");
        for (Weapon w: Weapon.weapons()) {
            System.out.println("ID: " + w.getId() + " | " + w.getWeaponName() + " ==> Price: " + w.getPrice() + " Damage: " + w.getDamage());
        }
        System.out.println("Choose weapon that you want: ");
        int selectedWeaponID = input.nextInt();
        while (selectedWeaponID < 1 || selectedWeaponID > Weapon.weapons().length) {
            System.out.println("Invalide choice!");
            selectedWeaponID = input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponById(selectedWeaponID);
        if(selectedWeapon != null){
            if(selectedWeapon.getPrice()>this.getPlayer().getHealth()){
                System.out.println("Not Enough MONEY!");
            }
            else{
                System.out.println("You bouhght: " + selectedWeapon.getWeaponName());
                int balance = this.getPlayer().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Balance: " + this.getPlayer().getMoney());
            }

        }

    }
    public void printArmor(){

    }
}