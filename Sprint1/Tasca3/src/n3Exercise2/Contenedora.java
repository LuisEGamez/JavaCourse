package n3Exercise2;

import java.util.Arrays;

public class Contenedora {
    private Integer[] cadenas;


    public Contenedora() {

        cadenas = new Integer[0];
    }

    public void addInteger(Integer integer){
        int pos;
        cadenas = Arrays.copyOf(cadenas, cadenas.length + 1);
        if(cadenas.length == 1){
            cadenas[0] = integer;
        }else {
            pos = cadenas.length - 1;
            cadenas[pos] = integer;
        }

    }

    @Override
    public String toString() {
        return "" + Arrays.toString(cadenas) ;
    }
}
