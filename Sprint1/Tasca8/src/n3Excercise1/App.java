package n3Excercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Ana", 24, "PHP", 7));
        alumnos.add(new Alumno("Maria", 28, "Python", 9));
        alumnos.add(new Alumno("Juan", 34, "PHP", 5));
        alumnos.add(new Alumno("Luis", 44, "Python", 7));
        alumnos.add(new Alumno("Alba", 24, "Java", 8));
        alumnos.add(new Alumno("Mario", 22, "PHP", 4));
        alumnos.add(new Alumno("Laura", 29, "Java", 6));
        alumnos.add(new Alumno("Antonio", 45, "PHP", 7));
        alumnos.add(new Alumno("Marta", 24, "Java", 7));
        alumnos.add(new Alumno("Alvaro", 28, "Python", 7));



        alumnos.stream().forEach(alumno -> {
                            System.out.println(alumno.getName() + " " + alumno.getAge());
                        });

        List<Alumno> alumnosA = alumnos.stream()
                                        .filter(a -> a.getName().startsWith("A"))
                                        .collect(Collectors.toList());

        System.out.println(alumnosA);

        alumnos.stream().filter(alumno -> alumno.getNote() >= 5)
                        .forEach(System.out::println);

        alumnos.stream().filter(alumno -> alumno.getNote() >= 5 && !(alumno.getCurs().equalsIgnoreCase("PHP")))
                        .forEach(System.out::println);

        alumnos.stream().filter(alumno -> alumno.getAge() >= 18 && alumno.getCurs().equalsIgnoreCase("Java"))
                        .forEach(System.out::println);

    }


}
