package n1Exercise6;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(1);//Insertamos el primer valor de la lista
        list.add(2);// Insertamos el último valor de la lista

        System.out.println(list);

        ListIterator<Integer> iterator = list.listIterator();

        while(iterator.hasNext()){
            iterator.next();
            if (iterator.hasPrevious()){
                iterator.add((int) (Math.random()*10));
            }

        }

        System.out.println(list);




    }
}
