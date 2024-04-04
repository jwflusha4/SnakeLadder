package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> board;

    public List<Cell> getBoard() {
        return board;
    }

    public void setBoard(List<Cell> board) {
        this.board = board;
    }

    public Board(int dimension) {
        board=new ArrayList<>();
        for(int i=0;i<=dimension;i++){
            this.board.add(new Cell(i,i));
        }
    }
    public Board(){

    }
}

