package n1Exercise8;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Persona> personas = new LinkedHashMap<>();

        personas.put("Madre", new Persona("Lola", 55));
        personas.put("Padre", new Persona("Pepe", 55));
        personas.put("Abuelo", new Persona("Juan", 87));
        personas.put("Abuela", new Persona("Maria", 85));

        System.out.println("personas = " + personas);
        
        Map<String, Persona> ordenaPersona = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        
        ordenaPersona.putAll(personas);
        personas.clear();
        personas.putAll(ordenaPersona);

        System.out.println("ordenaPersona = " + ordenaPersona);

        System.out.println("personas = " + personas);


    }
}
