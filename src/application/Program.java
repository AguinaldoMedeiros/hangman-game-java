package application;

import systemgame.gamemode.GameMode;
import systemgame.gamemode.Lenguage;
import systemgame.gamemode.PlayerMode;
import systemgame.gamemode.WordCategory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GameMode gameMode = new GameMode();

        System.out.println("Select your game mode preference: ");
        System.out.println("Lenguages: ");
        System.out.println();
        for (Lenguage lenguage : Lenguage.values()) {
            System.out.println(lenguage);
        }
        System.out.println();
        System.out.print("Enter to lenguage: ");
        Lenguage lenguage = Lenguage.valueOf(sc.next());
        System.out.println();

        System.out.println("Modes: ");
        System.out.println();
        for (PlayerMode playerMode : PlayerMode.values()) {
            System.out.println(playerMode);
        }
        System.out.println();
        System.out.print("Enter to Player Mode: ");
        PlayerMode playerMode = PlayerMode.valueOf(sc.next());
        System.out.println();

        System.out.println("Modes: ");
        System.out.println();
        for (WordCategory wordCategory : WordCategory.values()) {
            System.out.println(wordCategory);
        }
        System.out.println();
        System.out.print("Enter to Player Mode: ");
        WordCategory wordCategory = WordCategory.valueOf(sc.next());
        System.out.println();

        gameMode.setGameMode(lenguage, playerMode, wordCategory);

        System.out.println(gameMode.getSelectedGameMode());


    }
}
