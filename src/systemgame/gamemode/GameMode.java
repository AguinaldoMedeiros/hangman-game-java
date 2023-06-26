package systemgame.gamemode;

public class GameMode {

    private Language language;
    private PlayerMode playerMode;
    private WordCategory wordCategory;

    public GameMode() {
        this.language = Language.ENGLISH;
        this.playerMode = PlayerMode.SINGLE_PLAYER;
        this.wordCategory = WordCategory.ALL;
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
