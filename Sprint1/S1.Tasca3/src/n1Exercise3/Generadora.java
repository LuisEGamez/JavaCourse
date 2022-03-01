package n1Exercise3;


import java.util.*;

public class Generadora {

    private List<String> personajes;

    private Iterator<String> it;


    public Generadora() {
        personajes = new ArrayList<>();
        personajes.add("Luis");
        personajes.add("Maria");
        personajes.add("Juan");
        personajes.add("Ana");
        personajes.add("Lucas");
        personajes.add("Pepe");
        it = personajes.iterator();
    }

    public List<String> getPersonajes() {
        return personajes;
    }

    public String siguientePersonaje(){

        if(!it.hasNext()){
            it = personajes.iterator();
        }

        return it.next();
    }






}
