package n2n3Excercise1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;


@FileDestinationAnnotation(fileDestination = "EjemploJsonAnnotation.json")
public class MyJson {
    static Gson gson;


    static {
        gson = new GsonBuilder().setPrettyPrinting().create(); // Instanciamos el objeto GsonBuilder para crear una impresión legible
    }

    static <T> String createJson(T o){
        return gson.toJson(o);
    }

    static void createJsonFile(String json) throws IOException, NoSuchMethodException {

        Class aClass = MyJson.class; // Guardamos la clase
        Annotation annotation = aClass.getAnnotation(FileDestinationAnnotation.class); // Tomamos las annotation que nos interesa

        if (annotation instanceof FileDestinationAnnotation){

            FileDestinationAnnotation myAnnotation = (FileDestinationAnnotation) annotation;
            String rutaArchivo = myAnnotation.fileDestination();// Guardamos el nombre y la ruta del archivo de la annotation

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(rutaArchivo));
            bufferedWriter.write(json);
            bufferedWriter.newLine();
            bufferedWriter.flush();


        }

    }
}
