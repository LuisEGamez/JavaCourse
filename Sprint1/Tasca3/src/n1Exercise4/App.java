package n1Exercise4;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Luis", 25));
        clientes.add(new Cliente("Marta", 27));
        clientes.add(new Cliente("Juan", 20));

        List<Cliente> clientes1 = new LinkedList<>(clientes);

        /* clientes1.add(new Cliente("Pepe", 27));
        clientes1.add(new Cliente("Laura", 28));
        clientes1.add(new Cliente("Pau", 20));*/

        Set<Cliente> clientes2 = new HashSet<>(clientes);
        Set<Cliente> clientes3 = new LinkedHashSet<>(clientes);
        Set<Cliente> clientes4 = new TreeSet<>(clientes);


        System.out.println("ArrayList");
        mostrarObjetos(clientes);
        System.out.println("======================");
        System.out.println("LinkedList");
        mostrarObjetos(clientes1);
        System.out.println("======================");
        System.out.println("HashSet");
        mostrarObjetos(clientes2);
        System.out.println("======================");
        System.out.println("LinkedHashSet");
        mostrarObjetos(clientes3);
        System.out.println("======================");
        System.out.println("TreeSet");
        mostrarObjetos(clientes4);
        System.out.println("======================");

    }


    public static void mostrarObjetos(Collection<Cliente> clientes) {
        Iterator<Cliente> it = clientes.iterator();

        while(it.hasNext()){
            System.out.println(it.next().toString());
        }


    }
}


