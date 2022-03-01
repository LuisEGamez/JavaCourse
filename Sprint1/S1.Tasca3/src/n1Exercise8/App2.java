package n1Exercise8;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        Map<String, Persona> personas = new LinkedHashMap<>();

        personas.put("Madre", new Persona("Lola", 55));
        personas.put("Padre", new Persona("Pepe", 55));
        personas.put("Abuelo", new Persona("Juan", 87));
        personas.put("Abuela", new Persona("Maria", 85));

        System.out.println("personas = " + personas);

        List<String> ordenaKeysPersonas = new ArrayList<>(personas.keySet());
        Collections.sort(ordenaKeysPersonas, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        List<Persona> ordenaValuePersonas = new ArrayList<>();

        for ( String key : ordenaKeysPersonas){
            ordenaValuePersonas.add(personas.get(key));
        }
        System.out.println("ordenaKeysPersonas = " + ordenaKeysPersonas);
        System.out.println("ordenaValuePersona = " + ordenaValuePersonas);
        personas.clear();
        for (int i = 0; i< ordenaKeysPersonas.size(); i++){
            personas.put(ordenaKeysPersonas.get(i), ordenaValuePersonas.get(i));
        }

        System.out.println("personas = " + personas);













    }
}
