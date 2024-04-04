package Service;

import Model.Game;
import Model.GameStatus;
import Model.Player;

public class GameService {
    public void makeMove(Game game, int count){
        Player currPlayer=game.getPlayers().get(count);
        int num=(int)((Math.random()*10)%6)+1;
        System.out.println("Dice rolled by "+currPlayer.getName()+" is "+num);
        int temp=game.getPlayerStartingPoints().get(count);
        temp+=num;
        //int let=game.getPlayers();
        if(temp>100){
            return;
        }
        int nextPosition=game.getBoard().getBoard().get(temp).getCellChangeValue();
        game.getBoard().getBoard().get(nextPosition).getPlayers().add(currPlayer);
        game.getBoard().getBoard().get(temp-num).getPlayers().remove(currPlayer);
        temp=nextPosition;
        game.getPlayerStartingPoints().set(count,temp);
        if(temp==100){
            game.setGameStatus(GameStatus.FINISHED);
            game.setWinnerPLayer(currPlayer);
        }
        return;
    }
}
