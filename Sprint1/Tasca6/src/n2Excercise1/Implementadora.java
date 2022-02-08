package n2Excercise1;

public class Implementadora implements MiInterface{
    @Override
    public void method1() {
        System.out.println("Usando el método 1");
    }

    @Override
    public void method2() {
        System.out.println("Usando el método 2");
    }

    public void method3(){
        System.out.println("Usando el método 3");
    }
}
