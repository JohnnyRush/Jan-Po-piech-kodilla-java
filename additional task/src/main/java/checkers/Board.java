package checkers;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Row> boardRow = new ArrayList<>();

    public Board(){
        int i;
        for(i = 0; i<8; i++){
            boardRow.add(i, new Row());
        }
    }

    public void setFigure(int row, int col, Figure figure){
        boardRow.get(row).getFigures().remove(col);
        boardRow.get(row).getFigures().add(col, figure);
    }

    public Figure getFigure(int row, int col){
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

    public static void main(String[] args){
        Board board = new Board();

        Pawn pawnW = new Pawn("White", "Pawn");
        Queen queenW = new Queen("White", "Queen");
        Pawn pawnB = new Pawn("Black", "Pawn");
        Queen queenB = new Queen("Black", "Queen");

        board.setFigure(0, 1, pawnB);
        board.setFigure(0, 3, pawnB);
        board.setFigure(0, 5, pawnB);
        board.setFigure(0, 7, pawnB);
        board.setFigure(1, 0, pawnB);
        board.setFigure(1, 2, pawnB);
        board.setFigure(1, 4, pawnB);
        board.setFigure(1, 6, pawnB);
        board.setFigure(2, 1, pawnB);
        board.setFigure(2, 3, pawnB);
        board.setFigure(2, 5, pawnB);
        board.setFigure(2, 7, pawnB);

        board.setFigure(5, 0, pawnW);
        board.setFigure(5, 2, pawnW);
        board.setFigure(5, 4, pawnW);
        board.setFigure(5, 6, pawnW);
        board.setFigure(6, 1, pawnW);
        board.setFigure(6, 3, pawnW);
        board.setFigure(6, 5, pawnW);
        board.setFigure(6, 7, pawnW);
        board.setFigure(7, 0, pawnW);
        board.setFigure(7, 2, pawnW);
        board.setFigure(7, 4, pawnW);
        board.setFigure(7, 6, pawnW);

        System.out.println();
        System.out.println("Let's play a game!!!");
        System.out.println();
        System.out.println("    BLACK HALF");
        System.out.println(board.toString());
        System.out.println("    WHITE HALF");
    }
}