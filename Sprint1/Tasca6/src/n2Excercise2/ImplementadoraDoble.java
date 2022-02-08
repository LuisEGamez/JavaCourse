package n2Excercise2;

public class ImplementadoraDoble implements Interface1, Interface2{
    @Override
    public void method1() {
        System.out.println("Utilizando el método de la interface 1");
    }

    @Override
    public void method2() {
        System.out.println("Utilizando el método de la interface 2");
    }
}
