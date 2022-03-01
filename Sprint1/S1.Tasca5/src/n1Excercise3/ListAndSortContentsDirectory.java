package n1Excercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class ListAndSortContentsDirectory {

    private FileWriter writer;
    private BufferedWriter myBufferedWriter;

    public ListAndSortContentsDirectory(File rutaTxt) throws IOException {
        writer = new FileWriter(rutaTxt);
        myBufferedWriter = new BufferedWriter(writer);
    }

    public void listAndSotAlphabetic(File ruta) throws IOException {

        Date date;
        String[] lista = createSortArray(ruta);

        for (String str : lista){

            File file = new File(ruta,str);

            if (file.isFile()){
                date = new Date(file.lastModified());
                System.out.println("Fichero: " + str +" ultima modificación: " + date);
                writeTxt("Fichero: " + str +" ultima modificación: " + date);
            }else {
                System.out.println("Directorio: " + str);
                writeTxt("Directorio: " + str);
                listAndSotAlphabetic(file);
            }
        }
    }

    public void writeTxt(String linea) throws IOException { // Creamos un Buffer que va escribiendo línea por línea el contenido
        myBufferedWriter.write(linea);
        myBufferedWriter.newLine();
        myBufferedWriter.flush();
    }

    public String[] createSortArray(File ruta){ // Ordenamos la Array de String que nos devuelve el método list
        String[] lista = ruta.list();
        Arrays.sort(lista);
        return lista;
    }

}