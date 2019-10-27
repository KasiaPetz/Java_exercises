package iterations;

//Zaincjalizuj tablice charow dwuwymiarowa 10x10
//Uzupelnij ja naprzemian znakami X i O.
//Wyswietl ja w taki sposob aby prezentowala prostokat.
//
//XOXOXOXOXO
//XOXOXOXOXO
//XOXOXOXOXO
//XOXOXOXOXO
//XOXOXOXOXO
//XOXOXOXOXO
//XOXOXOXOXO
//XOXOXOXOXO
//XOXOXOXOXO


import java.util.Random;

public class Zadanie6 {
    public static void main(String[] args) {

        char[][] table = new char[10][10];

        for (int i = 0; i < table.length; i++) {               // po wierszach
            for (int j = 0; j < table[i].length; j++) {
                // table[i][j] = charGeneator('X','O');
                if (j % 2 == 0) {
                    table[i][j] = 'X';
                } else {
                    table[i][j] = 'O';
                }
            }
        }

        for (int i = 0; i < table.length; i++) {                      // po wierszach
            for (int j = 0; j < table[i].length; j++) {               // po kolumnach
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

    }

    private static char charGeneator(char firstChar, char secondChar) {
        Random rd = new Random();
        int random = rd.nextInt(2);

        if (random == 0) {
            return firstChar;
        }
        return secondChar;
    }

}
