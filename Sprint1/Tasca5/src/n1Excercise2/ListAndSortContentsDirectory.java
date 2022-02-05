package n1Excercise2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class ListAndSortContentsDirectory {

    static void listAndSotAlphabetic(File ruta){
        Date date;
        String[] lista = ruta.list();
        Arrays.sort(lista);

        for (String str : lista){
            File file = new File(ruta,str);
            if (file.isFile()){
                date = new Date(file.lastModified());
                System.out.println("Fichero: " + str +" ultima modificación: " + date);
            }else {
                System.out.println("Directorio: " + str);
                listAndSotAlphabetic(file);
            }


        }
    }

}