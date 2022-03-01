package n2Excercise2;

public class Generic {

    public static <T extends Interface1> void method1(T a){
        a.method1();
    }

    public static <T extends Interface2> void method2(T a){
        a.method2();
    }
}
