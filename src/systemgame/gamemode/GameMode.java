package systemgame.gamemode;

import java.util.Scanner;

public class GameMode {
    private Scanner scanner = new Scanner(System.in);
    private Language language;
    private PlayerMode playerMode;
    private WordCategory wordCategory;

    public GameMode selectGameMode() {
        selectLanguage();
        selectPlayerMode();
        selectWordCategory();

        GameMode gameMode = new GameMode();
        gameMode.setGameMode(language, playerMode, wordCategory);

        return gameMode;
    }

    private void selectLanguage() {
        System.out.println("Select your preferred language:");
        for (Language language : Language.values()) {
            System.out.println(language);
        }
        System.out.println();
        System.out.print("Enter the language: ");
        String languageInput = scanner.next().toUpperCase();
        System.out.println();

        try {
            language = Language.valueOf(languageInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid language. Using default language: " + Language.ENGLISH);
            language = Language.ENGLISH;
        }
    }

    private void selectPlayerMode() {
        System.out.println("Select the player mode:");
        for (PlayerMode playerMode : PlayerMode.values()) {
            System.out.println(playerMode);
        }
        System.out.println();
        System.out.print("Enter the player mode: ");
        String playerModeInput = scanner.next().toUpperCase();
        System.out.println();

        try {
            playerMode = PlayerMode.valueOf(playerModeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid player mode. Using default player mode: " + PlayerMode.SINGLE_PLAYER);
            playerMode = PlayerMode.SINGLE_PLAYER;
        }
    }

    private void selectWordCategory() {
        System.out.println("Select the word category:");
        for (WordCategory wordCategory : WordCategory.values()) {
            System.out.println(wordCategory);
        }
        System.out.println();
        System.out.print("Enter the word category: ");
        String wordCategoryInput = scanner.next().toUpperCase();
        System.out.println();

        try {
            wordCategory = WordCategory.valueOf(wordCategoryInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid word category. Using default word category: " + WordCategory.ALL);
            wordCategory = WordCategory.ALL;
        }
    }

    public Language getLanguage() {
        return language;
    }

    public PlayerMode getPlayerMode() {
        return playerMode;
    }

    public WordCategory getWordCategory() {
        return wordCategory;
    }

    public void setGameMode(Language language, PlayerMode playerMode, WordCategory wordCategory) {
        this.language = language;
        this.playerMode = playerMode;
        this.wordCategory = wordCategory;
    }

    public String getSelectedGameMode() {
        String mode = "Selected Game Mode: " + language + " - " + playerMode + " - " + wordCategory;
        return mode;
    }
}
