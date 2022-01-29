package n1Excercise3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        int [] nums = {5,8,7};
        int suma = 0;

        try{
            for (int i = 0; i<= nums.length; i++){
                suma += nums[i];
            }
            System.out.println("suma = " + suma);
        }catch (ArrayIndexOutOfBoundsException iobe){
            System.err.println("ArrayIndexOutOfBoundsException: " + iobe.getMessage());

        }
    }
}
