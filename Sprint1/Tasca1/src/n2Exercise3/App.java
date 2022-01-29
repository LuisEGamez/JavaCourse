package n2Exercise3;


import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Cycle> cycles = new ArrayList<Cycle>();

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        cycles.add(unicycle);
        cycles.add(bicycle);
        cycles.add(tricycle);



        /*for (int i = 0; i < cycles.size(); i++){
            cycles.get(i).balance();  No podemos invocar al método balance directamente a cada elemento del array.
                                      Ya que la clase Cycle no tiene creado un método balance().

        }*/

        for (int i = 0; i < cycles.size(); i++){
            if (cycles.get(i) instanceof Unicycle){
                ((Unicycle) cycles.get(i)).balance();
            }else if(cycles.get(i) instanceof Bicycle){
                ((Bicycle) cycles.get(i)).balance();
            }else if(cycles.get(i) instanceof Tricycle){
                //((Tricycle) cycles.get(i)).balance(); Esta llamada da error, ya que el método balance no está implementado en la clase Tricycle
            }
        }

    }
}
