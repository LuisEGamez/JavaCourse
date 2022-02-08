package n1Excercise4;

public class GenericMethods {

    public static <T> void f(T[] a){

        for(T b: a){
            System.out.println(b);
        }
    }
}
