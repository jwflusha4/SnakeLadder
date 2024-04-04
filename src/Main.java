import Controller.GameController;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GameController gameController=new GameController();
        List<Pair> ladderList=new ArrayList<>();
        ladderList.add(new Pair(2,37));
        ladderList.add(new Pair(27,46));
        ladderList.add(new Pair(10,32));
        ladderList.add(new Pair(51,68));
        ladderList.add(new Pair(61,79));
        ladderList.add(new Pair(65,84));
        ladderList.add(new Pair(71,91));
        ladderList.add(new Pair(81,100));
        List<Pair> snakeList=new ArrayList<>();
        snakeList.add(new Pair(62,5));
        snakeList.add(new Pair(33,6));
        snakeList.add(new Pair(49,9));
        snakeList.add(new Pair(88,16));
        snakeList.add(new Pair(41,20));
        snakeList.add(new Pair(56,53));
        snakeList.add(new Pair(98,64));
        snakeList.add(new Pair(93,73));
        snakeList.add(new Pair(95,75));
        List<Player> playerList=new ArrayList<>();
        int numOfPlayers;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of player");
        numOfPlayers=sc.nextInt();
        for(int i=0;i<numOfPlayers;i++){
            String name,symbol;
            System.out.println("Enter name of the player ");
            name=sc.next();
            System.out.println("Enter the symbol of the player");
            symbol=sc.next();
            playerList.add(new Player(name,symbol,i+1));
        }
        Game game=gameController.createGame(playerList,snakeList,ladderList);
        gameController.addSnakeInBoard(game,snakeList);
        gameController.addLadderInBoard(game,ladderList);
        int i=0;
        while(game.getGameStatus().equals(GameStatus.NEW)){
            for(int j=0;j<game.getPlayers().size();j++){
                gameController.makeMove(game,j);
                if(gameController.getGameStatus(game).equals(GameStatus.FINISHED)){
                    break;
                }
            }
            System.out.println("After "+(i+1)+" times all the players position are");
            gameController.displayBoard(game);
            i++;
        }
        System.out.println("Finished!!!");
        System.out.println("The Winner is "+gameController.getWinner(game));
    }
}