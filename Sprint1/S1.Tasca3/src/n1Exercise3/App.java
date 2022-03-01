package n1Exercise3;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Generadora generadora = new Generadora();
        List<String> personajes = new ArrayList<>();
        List<String> personajes2 = new LinkedList<>();
        Set<String> personajes3 = new HashSet<>();
        Set<String> personajes4 = new LinkedHashSet<>();
        Set<String> personajes5 = new TreeSet<>();

        for (int i =0  ; i < generadora.getPersonajes().size(); i++){
            System.out.println(generadora.siguientePersonaje());
        }

        for (int i =0  ; i < generadora.getPersonajes().size(); i++){
            personajes.add(generadora.siguientePersonaje());
        }

        for (int i =0  ; i < generadora.getPersonajes().size(); i++){
            personajes2.add(generadora.siguientePersonaje());
        }

        for (int i =0  ; i < generadora.getPersonajes().size(); i++){
            personajes3.add(generadora.siguientePersonaje());
        }

        for (int i =0  ; i < generadora.getPersonajes().size(); i++){
            personajes4.add(generadora.siguientePersonaje());
        }

        for (int i =0  ; i < generadora.getPersonajes().size(); i++){
            personajes5.add(generadora.siguientePersonaje());
        }


        System.out.println("personajes (ArrayList)= " + personajes);
        System.out.println("personajes2 (LinkedList)= " + personajes2);
        System.out.println("personajes3 (HashSet)= " + personajes3);
        System.out.println("personajes4 (LinkedHashSet)= " + personajes4);
        System.out.println("personajes5 (TreeSet)= " + personajes5);



    }
}
