package application;

import systemgame.HangmanGame;
import systemgame.Player;
import systemgame.WordGenerator;
import systemgame.gamemode.GameMode;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangmanGame hangmanGame = new HangmanGame();

        GameMode gameMode = new GameMode();
        gameMode.selectGameMode();

        WordGenerator wordGenerator = new WordGenerator();
        wordGenerator.generateRandomWord(gameMode.getLanguage(), gameMode.getWordCategory());

        Player player = new Player();
        player.setPlayer(gameMode);

        UI ui = new UI();
        ui.initialStatsGame(gameMode, wordGenerator, player);

        char letter_of_player = ' ';

        while (!hangmanGame.gameOver(player, gameMode) && !hangmanGame.gameWon(wordGenerator)) {

            ui.clearConsole();

            ui.stickMen(player);
            hangmanGame.hiddenWord(wordGenerator, letter_of_player);
            System.out.println("Wrong lyrics: " + hangmanGame.getWrongLetters());

            System.out.println("Type a letter: ");
            letter_of_player = scanner.next().charAt(0);
            letter_of_player = Character.toUpperCase(letter_of_player);
            hangmanGame.letters_compare(letter_of_player, wordGenerator, player, hangmanGame);

            ui.statusUpdate(player);
        }

        ui.endGame(hangmanGame, player, gameMode, wordGenerator);
    }
}
