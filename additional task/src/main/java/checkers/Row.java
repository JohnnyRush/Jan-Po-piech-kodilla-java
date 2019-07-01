package checkers;

import java.util.ArrayList;
import java.util.List;

public class Row {

    private List<Figure> listFigure = new ArrayList<>();

    public Row(){
        int i;
        for (i = 0; i<8 ; i++){
            listFigure.add(i, new None("none", "none"));
        }
    }

    public List<Figure> getFigures(){
        return listFigure;
    }

    @Override
    public String toString(){
        return  '|' + listFigure.get(0).toString() + '|' + listFigure.get(1).toString()
                + '|' + listFigure.get(2).toString() + '|' + listFigure.get(3).toString()
                + '|' + listFigure.get(4).toString() + '|' + listFigure.get(5).toString()
                + '|' + listFigure.get(6).toString() + '|' + listFigure.get(7).toString() + '|';
    }
}
