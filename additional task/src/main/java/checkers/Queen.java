package checkers;

public class Queen extends Figure {

    public Queen(String color, String name){
        super(color, name);
    }

    @Override
    public String toString(){
        return "=" ;
    }
}
