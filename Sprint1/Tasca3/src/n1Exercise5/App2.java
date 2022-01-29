package n1Exercise5;

import java.util.*;

public class App2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        System.out.println("list = " + list);
        System.out.println("list1 = " + list1);
        System.out.println("=============");

        ListIterator<Integer> listIterator= list.listIterator();
        ListIterator<Integer> listIterator1= list1.listIterator();

        for(int i = 0; i < list.size(); i++){
            listIterator.next();
        }

        for(int i = 0; i < list.size(); i++){
            listIterator1.next();
            listIterator1.add(listIterator.previous());
        }

        System.out.println("list1 = " + list1);
    }
}
