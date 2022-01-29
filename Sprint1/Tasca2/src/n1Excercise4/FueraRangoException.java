package n1Excercise4;

public class FueraRangoException extends Exception{

    public FueraRangoException() {
        super("Los valores introducidos están fuera del rango min=0 max=5");
    }
}
