package systemgame.gamemode;

public class GameMode {

    private Lenguage lenguage;
    private PlayerMode playerMode;
    private WordCategory wordCategory;

    public GameMode() {
        this.lenguage = Lenguage.ENGLISH;
        this.playerMode = PlayerMode.SINGLE_PLAYER;
        this.wordCategory = WordCategory.ALL;
    }

    public void setGameMode(Lenguage lenguage, PlayerMode playerMode, WordCategory wordCategory) {
        this.lenguage = lenguage;
        this.playerMode = playerMode;
        this.wordCategory = wordCategory;
    }

    public String getSelectedGameMode() {
        String mode = "Selected Game Mode: " + lenguage + " - " + playerMode + " - " + wordCategory;
        return mode;
    }

}
