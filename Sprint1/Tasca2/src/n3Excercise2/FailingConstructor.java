package n3Excercise2;

public class FailingConstructor {

    private int x;
    private int y;
    private int z;

    public FailingConstructor(int x, int y) throws ArithmeticException{
        this.x = x;
        this.y = y;
        z = x/y;
    }

    public int getZ() {
        return z;
    }
}
