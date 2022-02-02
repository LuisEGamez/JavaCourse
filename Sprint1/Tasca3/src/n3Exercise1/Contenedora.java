package n3Exercise1;

import java.util.Arrays;

public class Contenedora {
    private String[] cadenas;


    public Contenedora() {

        cadenas = new String[0];
    }

    public void addString (String str){
        int pos;
        cadenas = Arrays.copyOf(cadenas, cadenas.length + 1);
        if(cadenas.length == 1){
            cadenas[0] = str;
        }else {
            pos = cadenas.length - 1;
            cadenas[pos] = str;
        }

    }

    @Override
    public String toString() {
        return "" + Arrays.toString(cadenas) ;
    }
}
