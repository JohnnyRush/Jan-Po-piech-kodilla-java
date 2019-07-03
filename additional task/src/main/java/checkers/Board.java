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
    public void move(int row1, int col1, int row2, int col2){
        Figure movedFig = boardRow.get(row1).getFigures().get(col1);
        if (col1 != col2 && row2 != row1){
            if(col2 == (col1 +1) || col2 == (col1 - 1)){
                if (row2 == (row1 +1) || row2 == (row1-1)){
                    if (boardRow.get(row2).getFigures().get(col2).getColor() == "none"){
                    boardRow.get(row2).getFigures().add(col2, movedFig);
                    boardRow.get(row2).getFigures().remove(col2 + 1);
                    None none = new None("none", "none");
                    boardRow.get(row1).getFigures().add(col1, none);
                    boardRow.get(row1).getFigures().remove(col1 + 1);
                    }else{
                        System.out.println("You cant move here - field is not empty");
                    }
                }else{
                    System.out.println("You cant move here - you can not move pawn more than one row");
                }
            }else{
                System.out.println("You cant move here - you can not move pawn more than one column");
            }
        }else{
            System.out.println("You cant move here - you can not move pawn straight, only on slant");
        }
    }

    @Override
    public String toString(){
        String s = "";
        for (Row row : boardRow) {
            s += row.toString() + "\n";
        }
        return s;
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
        System.out.println("    BLACK HALF" + "\n");
        System.out.println(board.toString());
        System.out.println("    WHITE HALF");

        board.move(5,0,4,1);
        System.out.println();
        System.out.println(board.toString());
        board.move(6,1,5,2);
        board.move(6,1,5,1);
        board.move(6,1,4,2);
        board.move(6,1,5,3);
        board.move(6,7,5,8);
        }
}