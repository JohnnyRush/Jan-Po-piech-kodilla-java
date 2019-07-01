package checkers;

public class Pawn extends Figure {

    public Pawn(String color, String name){
        super(color, name);
    }

    @Override
    public String toString(){
        return "-" ;
    }
}
