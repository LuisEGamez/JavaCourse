package n1Exercise8;

public class Frog extends Amphibian {

    public Frog(){

    }

    public void jump(){
        System.out.println("La rana está saltando");
    }

    @Override
    public void move() {
        System.out.println("La rana se está moviendo");
    }

    @Override
    public void breathe() {
        System.out.println("La rana está respirando");
    }

    @Override
    public void eat() {
        System.out.println("La rana está comiendo");
    }
}
