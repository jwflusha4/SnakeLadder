package Controller;

import Model.Game;
import Model.GameStatus;
import Model.Pair;
import Model.Player;
import Service.BoardService;
import Service.GameService;

import java.util.List;

public class GameController {
    BoardService boardService=new BoardService();
    GameService gameService=new GameService();
    public Game createGame(List<Player> playerList, List<Pair>snakeList,List<Pair>ladderList){
        return Game.getBuilder().
                setPlayerList(playerList).
                setSnakeList(snakeList).
                setLadderList(ladderList).
                build();
    }
    public void displayBoard(Game game){
        boardService.displayBoard(game);
    }
    public List<Integer> getPLayersPosition(Game game){
        return game.getPlayerStartingPoints();
    }
    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }
    public String getWinner(Game game){
        return game.getWinnerPLayer().getName();
    }
    public void makeMove(Game game,int count){
        gameService.makeMove(game,count);
    }
    public void addSnakeInBoard(Game game,List<Pair> snakeList){
        boardService.addSnake(game,snakeList);
    }
    public void addLadderInBoard(Game game,List<Pair> ladderList){
        boardService.addLadder(game,ladderList);
    }
}
