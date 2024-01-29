package MidLevel.GameProject;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Game");
        System.out.println("Who are you: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Welcome ! " + player.getName());
        player.selectChar();

        Location location;
        while (true) {
            player.printPlayerInfo();
            System.out.println("Safe Locations!");
            System.out.println("1 - Safe House");
            System.out.println("2 - Shop");
            System.out.println("-------------------------");
            System.out.println("Battlefields");
            System.out.println("3 - Enter to the Cave, The award is Food ");
            System.out.println("4 - Enter to the Forest, The award is Wood");
            System.out.println("5 - Enter to the River, The award is Water ");
            System.out.println("0 - Exit");
            System.out.println("Choose where you want to go!");
            int selectedLocation = input.nextInt();

            switch (selectedLocation) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Store(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location= new River(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if (location == null){
                System.out.println("Confirmed");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }


    }
}
