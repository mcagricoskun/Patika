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
            System.out.println("Locations!");
            System.out.println("1 - Safe House");
            System.out.println("2 - Shop");
            System.out.println("Choose where you want to go!");
            int selectedLocation = input.nextInt();

            switch (selectedLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Store(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }


    }
}
