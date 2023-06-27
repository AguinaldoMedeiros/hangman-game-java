package application;

import systemgame.Player;
import systemgame.WordGenerator;
import systemgame.gamemode.GameMode;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GameMode gameMode = new GameMode();
        gameMode.selectGameMode();

        Player player = new Player();
        player.setPlayer(gameMode);

        WordGenerator wordGenerator = new WordGenerator();
        wordGenerator.generateRandomWord(gameMode.getLanguage(), gameMode.getWordCategory());
        String randomWord = wordGenerator.getRandomWord();
        System.out.println("Random Word: " + randomWord);

        System.out.println();
        System.out.println(gameMode.getSelectedGameMode());

        boolean gameOver = false;

      }
}
