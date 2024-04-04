package Model;

public class Player {
    private String name;
    private String symbol;
    private int playerId;
    private PlayerType playerType;

    public Player(String name, String symbol, int playerId) {
        this.name = name;
        this.symbol = symbol;
        this.playerId = playerId;
        this.playerType=PlayerType.HUMAN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
