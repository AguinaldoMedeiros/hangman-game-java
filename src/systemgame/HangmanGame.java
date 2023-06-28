package systemgame;

import systemgame.gamemode.GameMode;
import systemgame.gamemode.PlayerMode;

import java.util.ArrayList;
import java.util.List;

public class HangmanGame {

    private List<Character> wrong_letters = new ArrayList<>();
    private int wonPoints = 0;

    private char[] letters;

    public boolean letters_compare(char letter_of_player, WordGenerator wordGenerator, Player player, HangmanGame hangmanGame) {
        boolean isCorrect = false;
        for (int i = 0; i < wordGenerator.getRandomWord().length(); i++) {
            char randomLetter = wordGenerator.getRandomWord().charAt(i);

            if (letter_of_player == randomLetter) {
                isCorrect = true;
                wonPoints++;
                break;
            }
        }

        if (!isCorrect) {
            wrong_letters.add(letter_of_player);
            player.removeAttemptsPlayer();
        }

        return isCorrect;
    }

    public List<Character> getWrongLetters() {
        return wrong_letters;
    }

    public boolean gameOver(Player player, GameMode gameMode) {
            if (player.getAttempts_player() != 0) {
                return false;
            } else {
                return true;
            }
    }
    public boolean gameWon(WordGenerator wordGenerator) {
        return wonPoints == wordGenerator.getRandomWord().replaceAll(" ", "").length();
    }

    public void hiddenWord(WordGenerator wordGenerator, char letter_of_player) {
        if (letters == null) {
            letters = new char[wordGenerator.getRandomWord().length()];

            for (int i = 0; i < letters.length; i++) {
                if (wordGenerator.getRandomWord().charAt(i) == ' ') {
                    letters[i] = ' ';
                } else {
                    letters[i] = '_';
                }
            }
        } else {
            for (int i = 0; i < letters.length; i++) {
                if (wordGenerator.getRandomWord().charAt(i) == letter_of_player) {
                    letters[i] = letter_of_player;
                }
            }
        }

        StringBuilder wordDisplay = new StringBuilder();
        for (char c : letters) {
            wordDisplay.append(c).append(' ');
        }

        System.out.println("Word: " + wordDisplay.toString());
    }
}
