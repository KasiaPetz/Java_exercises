package exceptionsExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {

        //Wyjatki checked to takie wyjatki ktore musismy obsluzyc, czyli napisac try catch lub rzucic wyjatkiem dalej.

        File file = new File("plik.txt");

        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
