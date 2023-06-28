package systemgame;

import systemgame.gamemode.GameMode;
import systemgame.gamemode.PlayerMode;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    private String name_player1;
    private String name_player2;
    private int attempts_player;

    public Player setPlayer(GameMode gameMode) {

        attempts_player = 5;

        if (gameMode.getPlayerMode() == PlayerMode.SINGLE_PLAYER) {
            System.out.print("Type your name: ");
            name_player1 = scanner.next();
        } else if (gameMode.getPlayerMode() == PlayerMode.TWO_PLAYERS) {
            System.out.print("Enter the name of player number one: ");
            name_player1 = scanner.next();
            System.out.print("Enter the name of player number two: ");
            name_player2 = scanner.next();
        } else {
            System.out.println("Invalid number of players!");
            return null;
        }

        return this;
    }

    public String getPlayerStats() {
        String playerStats = "Player name: " + name_player1 + " chances: " + getAttempts_player();

        if (name_player2 != null) {
            String playerStats2 = "Player two name: " + name_player2 + " chances: " + getAttempts_player();

            return playerStats + "\n" + playerStats2;
        }

        return playerStats;
    }

    public String getName_player1() {
        return name_player1;
    }

    public String getName_player2() {
        return name_player2;
    }

    public int getAttempts_player() {
        return attempts_player;
    }

    public void removeAttemptsPlayer() {
        if (attempts_player >= 1) {
            attempts_player = attempts_player - 1;
        }
    }
}
