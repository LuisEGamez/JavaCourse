package n1Exercise7;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Map<Integer, Empleado> empleados = new HashMap<>();
        Map<Integer, Empleado> empleados2 = new TreeMap<>();

        empleados.put(1, new Empleado("Luis"));
        empleados.put(2, new Empleado("Ana"));
        empleados.put(3, new Empleado("Maria"));
        empleados.put(4, new Empleado("Lucas"));
        empleados.put(5, new Empleado("Diego"));

        System.out.println(empleados.get(1).hashCode());
        System.out.println(empleados.get(2).hashCode());
        System.out.println(empleados.get(3).hashCode());
        System.out.println(empleados.get(4).hashCode());
        System.out.println(empleados.get(5).hashCode());

        empleados2.put(1, new Empleado("Luis"));
        empleados2.put(2, new Empleado("Ana"));
        empleados2.put(3, new Empleado("Maria"));
        empleados2.put(4, new Empleado("Lucas"));
        empleados2.put(5, new Empleado("Diego"));

        System.out.println("empleados2 = " + empleados2);


    }
}
