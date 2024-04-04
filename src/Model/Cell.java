package Model;

import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.objects.annotations.Getter;
//import lombok.Getter;


//@Getter
public class Cell {
    private int cellCurrentValue;
    private List<Player> players;
    private SnakeStatus isSnakePresent;
    private LadderStatus isLadderPresent;
    private int cellChangeValue;

    public Cell(int cellCurrentValue, int cellChangeValue) {
        this.cellCurrentValue = cellCurrentValue;
        this.cellChangeValue = cellChangeValue;
        this.players=new ArrayList<>();
        this.isSnakePresent=SnakeStatus.ABSENT;
        this.isLadderPresent=LadderStatus.ABSENT;
    }

    public Cell(int cellCurrentValue, List<Player> players, SnakeStatus isSnakePresent,
                LadderStatus isLadderPresent,
                int cellChangeValue) {
        this.cellCurrentValue = cellCurrentValue;
        this.players = players;
        this.isSnakePresent = isSnakePresent;
        this.isLadderPresent = isLadderPresent;
        this.cellChangeValue = cellChangeValue;
    }

    public int getCellCurrentValue() {
        return cellCurrentValue;
    }

    public void setCellCurrentValue(int cellCurrentValue) {
        this.cellCurrentValue = cellCurrentValue;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public SnakeStatus getIsSnakePresent() {
        return isSnakePresent;
    }

    public void setIsSnakePresent(SnakeStatus isSnakePresent) {
        this.isSnakePresent = isSnakePresent;
    }

    public LadderStatus getIsLadderPresent() {
        return isLadderPresent;
    }

    public void setIsLadderPresent(LadderStatus isLadderPresent) {
        this.isLadderPresent = isLadderPresent;
    }

    public int getCellChangeValue() {
        return cellChangeValue;
    }

    public void setCellChangeValue(int cellChangeValue) {
        this.cellChangeValue = cellChangeValue;
    }
}
