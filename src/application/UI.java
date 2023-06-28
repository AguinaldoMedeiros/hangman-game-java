package application;

import systemgame.HangmanGame;
import systemgame.Player;
import systemgame.WordGenerator;
import systemgame.gamemode.GameMode;

public class UI {

    public void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
        }
    }

    public void initialStatsGame(GameMode gameMode, WordGenerator wordGenerator, Player player) {

        System.out.println();
        System.out.println(gameMode.getSelectedGameMode());
        System.out.println();
        System.out.println(player.getPlayerStats());
    }

    public void statusUpdate(Player player) {

        System.out.println(player.getPlayerStats());

    }

    public void endGame(HangmanGame hangmanGame, Player player, GameMode gameMode, WordGenerator wordGenerator) {
        if (hangmanGame.gameOver(player, gameMode)) {
            System.out.println();
            System.out.println("_____________");
            System.out.println("|           |");
            System.out.println("|           O");
            System.out.println("|           |");
            System.out.println("|           \\\\");
            System.out.println("|           / ");
            System.out.println("|           \\\\");
            System.out.println("|__");

            System.out.println("GAME OVER!");
            System.out.println("The correct word was: " + wordGenerator.getRandomWord());

            if (player.getAttempts_player() <= 0) {
                System.out.println("You lost all your points. Better luck next time!");
            } else {
                System.out.println("You still have some points remaining. Keep playing!");
            }
        } else if (hangmanGame.gameWon(wordGenerator)) {
            System.out.println("You Win!");

            if (player.getAttempts_player() == 5) {
                System.out.println("Perfect score! Congratulations!");
            } else {
                System.out.println("You guessed the word with " + player.getAttempts_player() + " points remaining.");
            }
        }
    }

    public void stickMen(Player player) {
        switch (player.getAttempts_player()) {
            case 5:
                System.out.println("_____________");
                System.out.println("|           |");
                System.out.println("|           ");
                System.out.println("|          ");
                System.out.println("|         ");
                System.out.println("|        ");
                System.out.println("|__");
                break;
            case 4:
                System.out.println("Game over! Você perdeu.");
                System.out.println("_____________");
                System.out.println("|           |");
                System.out.println("|           O");
                System.out.println("|           |");
                System.out.println("|           ");
                System.out.println("|        ");
                System.out.println("|__");
                break;
            case 3:
                System.out.println("Game over! Você perdeu.");
                System.out.println("_____________");
                System.out.println("|           |");
                System.out.println("|           O");
                System.out.println("|          \\|");
                System.out.println("|           ");
                System.out.println("|        ");
                System.out.println("|__");
                break;
            case 2:
                System.out.println("Game over! Você perdeu.");
                System.out.println("_____________");
                System.out.println("|           |");
                System.out.println("|           O");
                System.out.println("|          \\|/");
                System.out.println("|           |");
                System.out.println("|        ");
                System.out.println("|__");
                break;
            case 1:
                System.out.println("Game over! Você perdeu.");
                System.out.println("_____________");
                System.out.println("|           |");
                System.out.println("|           O");
                System.out.println("|          \\|/");
                System.out.println("|           |");
                System.out.println("|          / ");
                System.out.println("|__");
                break;
            case 0:
                System.out.println("_____________");
                System.out.println("|           |");
                System.out.println("|           O");
                System.out.println("|          \\|/");
                System.out.println("|           |");
                System.out.println("|          / \\");
                System.out.println("|__");
                break;
        }
    }
}


