package systemgame;

import systemgame.gamemode.GameMode;
import systemgame.gamemode.PlayerMode;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    private String name_player1;
    private String name_player2;
    private int points_player1;
    private int points_player2;

    public Player setPlayer(GameMode gameMode) {

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

    public String getName_player1() {
        return name_player1;
    }

    public String getName_player2() {
        return name_player2;
    }

    public int getPoints_player1(WordGenerator wordGenerator) {
        return points_player1 = wordGenerator.getRandomWord().length();
    }

    public int getPoints_player2(WordGenerator wordGenerator) {
        return points_player2 = wordGenerator.getRandomWord().length();
    }

    public void removePointsPlayer1() {

        if (points_player1 >= 1) {
            points_player1 = points_player1 - 1;
        }
    }

    public void removePointsPlayer2() {
        if (points_player2 >= 1) {
            points_player2 = points_player2 - 1;
        }
    }
}
