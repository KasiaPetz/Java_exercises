package board;

public class Pawn extends Figure{

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return getColor() + "P" + "\033[0m";
    }

}
