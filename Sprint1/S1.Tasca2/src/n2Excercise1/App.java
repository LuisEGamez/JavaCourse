package n2Excercise1;

public class App {
    public static void main(String[] args) {
        ThrowException throwException = new ThrowException();

        double result = throwException.f(5,0);
        System.out.println("result = " + result);

    }
}
