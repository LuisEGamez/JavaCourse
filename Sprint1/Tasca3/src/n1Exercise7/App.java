package n1Exercise7;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Map<Empleado, String> empleados = new HashMap<>();
        Map<Empleado, String> empleados2 = new TreeMap<>(new Comparator<Empleado>() {

            @Override
            public int compare(Empleado o1, Empleado o2) {
                int hashCode1 = o1.hashCode();
                int hashCode2 = o2.hashCode();
                return hashCode1-hashCode2;
            }
        });
        Empleado empleado1 = new Empleado("Luis");
        Empleado empleado2 = new Empleado("Ana");
        Empleado empleado3 = new Empleado("Maria");
        Empleado empleado4 = new Empleado("Lucas");
        Empleado empleado5 = new Empleado("Diego");

        empleados.put(empleado1, "Ingeniero");
        empleados.put(empleado2, "Contable");
        empleados.put(empleado3, "Directora");
        empleados.put(empleado4, "Informático");
        empleados.put(empleado5, "Administrativo");

        System.out.println("HashCode= " + empleado1.hashCode() + " " + empleado1.getName());
        System.out.println("HashCode= " + empleado2.hashCode() + " " + empleado2.getName());
        System.out.println("HashCode= " + empleado3.hashCode() + " " + empleado3.getName());
        System.out.println("HashCode= " + empleado4.hashCode() + " " + empleado4.getName());
        System.out.println("HashCode= " + empleado5.hashCode() + " " + empleado5.getName());

        System.out.println("empleados = " + empleados);

        empleados2.put(empleado1, "H");
        empleados2.put(empleado2, "J");
        empleados2.put(empleado3, "S");
        empleados2.put(empleado4, "E");
        empleados2.put(empleado5, "R");

        System.out.println("empleados2 = " + empleados2);

        Map<Empleado, String> empleados3 = new LinkedHashMap<>(empleados2);

        System.out.println("empleados3 = " + empleados3);

        System.out.println("=============================");

        Set<Empleado> empleados4 = new HashSet<>(empleados2.keySet());

        System.out.println("empleados4 = " + empleados4); // No se mantiene el orden
        
        Set<Empleado> empleados5 = new LinkedHashSet<>(empleados2.keySet());

        System.out.println("empleados5 = " + empleados5); // Se mantiene el orden

    }
}
