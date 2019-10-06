package board;

public class Game {

    public static final String YELLOW = "\033[0;33m";
    public static final String RED = "\033[0;31m";

    public static int PAWN_ROWS = 3;

    public void printGameBoard(Board board) {
        //TODO wydrukowanie planszy na konsole
    }

    public Board generateGameBoard(int size) {
        if(size < 8 || size > 10) {                     //dlaczego nie jest wpisane po prostu size!=9 ???
            throw new IllegalArgumentException();
        }

        Board board = new Board();

        for(int i = 0; i < size; i++) {
            BoardRow boardRow = new BoardRow();

            for(int j = 0; j < size; j++) {
                Figure figure = generateStartingFigure(i, size);
                boardRow.getFigures().add(figure);
            }

            board.getRows().add(boardRow);
        }

        return board;
    }

    private Figure generateStartingFigure(int rowNum, int size) {
        if(rowNum < PAWN_ROWS) {
            return new Pawn(YELLOW);
        } else if (rowNum >= size - PAWN_ROWS){
            return new Pawn(RED);
        }

        return new None();
    }

}
