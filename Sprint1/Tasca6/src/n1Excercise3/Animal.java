package n1Excercise3;

public class Animal {

    private String raza, color;

    public Animal(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

    public String toString(){
        return "La raza es " + raza + ". Es de color " + color;
    }
}
