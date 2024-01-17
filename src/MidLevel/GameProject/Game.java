package MidLevel.GameProject;

import java.util.Scanner;

public class Game {

    Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Welcome to the Game");
        System.out.println("Who are you: " );
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Welcome ! "+ player.getName());
        player.selectChar();



    }
}
