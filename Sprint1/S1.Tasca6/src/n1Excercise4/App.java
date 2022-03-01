package n1Excercise4;

public class App {
    public static void main(String[] args) {

        String palabras[] = {"Hola", "Hijo", "Gato"};

        GenericMethods.f(palabras);

        Integer numeros[] = {4, 5, 8, 78, 89};

        GenericMethods.f(numeros);

        Persona[] personas = {new Persona("Juan", 55), new Persona("Ana", 77)};

        GenericMethods.f(personas);

    }
}
