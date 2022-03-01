package n1Excercise4;

import java.io.File;
import java.io.IOException;


public class App {
    public static void main(String[] args) {
        String nameDir = args[0];
        String nameFileTxt = args[1];
        File ruta = new File(nameDir);
        File rutaTxt = new File(nameFileTxt);

        try {

            ListAndSortContentsDirectory list = new ListAndSortContentsDirectory(rutaTxt);
            list.listAndSotAlphabeticTxt(ruta);

        } catch (IOException e) {
            System.out.println("Error en la creación del archivo Txt");
            e.printStackTrace();
        }

    }
}