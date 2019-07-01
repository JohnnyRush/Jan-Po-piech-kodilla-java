package checkers;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Row> boardRow = new ArrayList<>();

    public Board(){
        int i;
        Row row = new Row();
        for(i = 0; i<8; i++){
            boardRow.add(i, row);
        }
    }

    public void setFigure(int row, int col, Figure figure){
        boardRow.get(row).getFigures().remove(col);
        boardRow.get(row).getFigures().add(col, figure);
    }

    public Figure getFigure(int row, int col) {
        return boardRow.get(row).getFigures().get(col);
    }

    @Override
    public String toString(){

        return boardRow.get(0).toString() + "\n" +
               boardRow.get(1).toString() + "\n" +
               boardRow.get(2).toString() + "\n" +
               boardRow.get(3).toString() + "\n" +
               boardRow.get(4).toString() + "\n" +
               boardRow.get(5).toString() + "\n" +
               boardRow.get(6).toString() + "\n" +
               boardRow.get(7).toString();

    }


    public static void main(String[] args) {
        Board board = new Board();
        None none = new None("none");
        Pawn pawnW = new Pawn("White");
        Queen queenW = new Queen("White");
        Pawn pawnB = new Pawn("Black");
        Queen queenB = new Queen("Black");

        board.setFigure(0, 1, pawnB);

        board.setFigure(7, 4, pawnW);

        System.out.println(board.getFigure(0, 1 ).getColor());
        System.out.println(board.getFigure(0, 4 ).getColor());
        System.out.println(board.toString());

    }
}