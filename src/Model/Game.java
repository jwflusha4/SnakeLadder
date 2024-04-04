package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Integer> playerStartingPoints;
    private List<Pair> snakeList;
    private List<Pair> ladderList;
    private GameStatus gameStatus;
    private Player winnerPLayer;

    public Game(List<Player> players, List<Pair> snakeList, List<Pair> ladderList) {
        board=new Board(100);
        this.players = players;
        this.snakeList = snakeList;
        this.ladderList = ladderList;
        this.playerStartingPoints=new ArrayList<>();
        for(int i=0;i<players.size();i++){
            playerStartingPoints.add(Integer.valueOf(0));
        }
        //this.currentMove=new Move();
        this.gameStatus=GameStatus.NEW;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{
        private List<Player> playerList;
        private List<Pair> snakeList;
        private List<Pair> ladderList;
        public Builder(){

        }
        public Builder setPlayerList(List<Player> pl){
            this.playerList=pl;
            return this;
        }
        public Builder setSnakeList(List<Pair>sl){
            this.snakeList=sl;
            return this;
        }
        public Builder  setLadderList(List<Pair>ll){
            this.ladderList=ll;
            return this;
        }
        public Game build(){
            return new Game(playerList,snakeList,ladderList);
        }

    }
    public List<Integer> getPlayerStartingPoints() {
        return playerStartingPoints;
    }

    public void setPlayerStartingPoints(List<Integer> playerStartingPoints) {
        this.playerStartingPoints = playerStartingPoints;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Pair> getSnakeList() {
        return snakeList;
    }

    public void setSnakeList(List<Pair> snakeList) {
        this.snakeList = snakeList;
    }

    public List<Pair> getLadderList() {
        return ladderList;
    }

    public void setLadderList(List<Pair> ladderList) {
        this.ladderList = ladderList;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinnerPLayer() {
        return winnerPLayer;
    }

    public void setWinnerPLayer(Player winnerPLayer) {
        this.winnerPLayer = winnerPLayer;
    }
}
