package n3Excercise3;

public class FailingConstructor {

    private int x;
    private int y;
    private int z;
    private ClaseFinaliza a, b;

    public FailingConstructor(int x, int y) throws ArithmeticException{
        this.x = x;
        this.y = y;
        a = new ClaseFinaliza();
        z = x/y;
        b = new ClaseFinaliza();

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public ClaseFinaliza getA() {
        return a;
    }

    public void setA(ClaseFinaliza a) {
        this.a = a;
    }

    public ClaseFinaliza getB() {
        return b;
    }

    public void setB(ClaseFinaliza b) {
        this.b = b;
    }
}
