package Service;

import Model.*;

import java.util.List;

public class BoardService {
    public void displayBoard(Game game){
        Board board=game.getBoard();
        int len= board.getBoard().size()-1;
        int count=0;
        while(len>0){
            if(len%2==0){
                int i;
                for(i=len;i>len-10;i--){
                    //System.out.print(board.get(i).getCellCurrentValue()+" ");
                    if(board.getBoard().get(i).getPlayers().size()==0){
                        System.out.print(board.getBoard().get(i).getCellCurrentValue()+" ");
                    }
                    else if(board.getBoard().get(i).getPlayers().size()==1){
                        System.out.print(board.getBoard().get(i).getPlayers().get(0).getSymbol().charAt(0)+" ");
                    }
                    else{
                        System.out.print("*"+" ");
                    }
                }
                System.out.println("");
                len-=19;
            }
            else{
                int i;
                for(i=len;i<len+10;i++){
                    if(board.getBoard().get(i).getPlayers().size()==0){
                        System.out.print(board.getBoard().get(i).getCellCurrentValue()+" ");
                    }
                    else{
                        System.out.print(board.getBoard().get(i).getPlayers().get(0).getSymbol().charAt(0)+" ");
                    }
                }
                System.out.println("");
                len-=1;
            }
        }
    }
    public void addSnake(Game game,List<Pair> pairs){
        Board board=game.getBoard();
        for(int i=0;i<pairs.size();i++){
            board.getBoard().get(pairs.get(i).getFirst()+1).setCellChangeValue(pairs.get(i).getSecond());
            board.getBoard().get(pairs.get(i).getFirst()+1).setIsSnakePresent(SnakeStatus.PRESENT);
        }

    }
    public void addLadder(Game game,List<Pair>pairs){
        Board board=game.getBoard();
        for(int i=0;i<pairs.size();i++){
            board.getBoard().get(pairs.get(i).getFirst()+1).setCellChangeValue(pairs.get(i).getSecond());
            board.getBoard().get(pairs.get(i).getFirst()+1).setIsLadderPresent(LadderStatus.PRESENT);
        }

    }
}
