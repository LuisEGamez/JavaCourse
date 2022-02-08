package n2Excercise1;

public class Generic {

    public static <T extends MiInterface> void genericMethod(T a){

        a.method1();
        a.method2();
    }
}
