package collections.boardGame;

import java.util.List;

public class Board {
    private List<BoardRow> rows;

    public Figure getFigure(int row, int col) {    // zwraca figure z danego miejsca planszy
        BoardRow boardRow = rows.get(row);
        return boardRow.getFigures().get(col);
    }



    public void setFigure(int row, int col, Figure figure) {
        //ustawia figure na konkretnym polu planszy
    //    BoardRow boardRow = rows.set(row, figure);

    }


}
