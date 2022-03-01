package n2Excercise2;

public class ThrowException {

    public double f(int numerador, int denominador){

        try {
            return g(numerador, denominador);
        }catch (RuntimeException re){
            throw new NullPointerException();
        }

    }

    public double g(int numerador, int denominador) throws ArithmeticException{

        return numerador/denominador;
    }
}
