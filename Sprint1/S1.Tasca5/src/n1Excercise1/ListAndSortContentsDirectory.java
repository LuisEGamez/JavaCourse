package n1Excercise1;

import java.io.File;
import java.util.Arrays;

public class ListAndSortContentsDirectory {

    static void listAndSotAlphabetic(File ruta){

        String[] lista = ruta.list();

        Arrays.sort(lista);

        for (String str : lista){
            System.out.println(str);
        }
    }

}