package board;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String YELLOW = "\033[0;33m";
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";

//    public static void main(String[] args) {
//        char[][] board = new char [8][8];
//
//        for(int i = 0; i < board.length; i++) {
//            for(int j = 0; j < board[i].length; j++) {
//                if(i%2 == 0) {
//                    if(j%2 == 0){
//                        board[i][j] = 'W';
//                    } else {
//                        board[i][j] = 'B';
//                    }
//                } else {
//                    if (j % 2 == 0) {
//                        board[i][j] = 'B';
//                    } else {
//                        board[i][j] = 'W';
//                    }
//                }
//            }
//        }
//
//        boolean start = false;
//
//        for(int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if(start) {
//                    if(j%2 == 0){
//                        board[i][j] = 'W';
//                    } else {
//                        board[i][j] = 'B';
//                    }
//                } else {
//                    if (j % 2 == 0) {
//                        board[i][j] = 'B';
//                    } else {
//                        board[i][j] = 'W';
//                    }
//                }
//            }
//            start = !start;
//
//        }
//
//
//        for(int i = 0; i < board.length; i++) {
//            for(int j = 0; j < board[i].length; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {

        //tworzenie obiektu Board
        Board board = new Board();

        //tworzenie pustych wierszy
        for (int i = 0; i < 8; i++) {
            //tworzenie obiektu BoardRow czyli wiersza (narazie pustego)
            BoardRow boardRow = new BoardRow();

            //dodanie go do Board (a dokadniej do listy wierszy w board
            board.getRows().add(boardRow);
        }

        //petla po wierszach
        for(BoardRow boardRow : board.getRows()) {

            //uzupelnianie wiersza
            for (int i = 0; i < 8; i++) {
                Figure figure = new Queen(YELLOW);

                boardRow.getFigures().add(figure);
            }

        }

//        List<BoardRow> boardRows = board.getRows();
//
//        for(int i = 0; i < boardRows.size(); i++) {
//
//            BoardRow boardRow = boardRows.get(i);
//
//            for(int j = 0; j < boardRow.getFigures().size(); j++) {
//                boardRow.getFigures().get(j);
//            }
//        }

        for(BoardRow boardRow : board.getRows()) {

            for(Figure figure : boardRow.getFigures()) {
                System.out.print(figure + " ");
            }
            System.out.println();
        }
    }
}
