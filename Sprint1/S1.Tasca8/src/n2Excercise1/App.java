package n2Excercise1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        String[] alphaNum= {"ase548ad", "45f8g4", "8a7f4e596", "7ghj8j", "45821"};

        Comparator<String> byLengthAsc = (str1, str2) -> str1.length() - str2.length();

        List<String> order =  Arrays.stream(alphaNum).sorted(byLengthAsc).collect(Collectors.toList());

        System.out.println(order);

        Comparator<String> byLengthDes = (str1, str2) -> str2.length() - str1.length();

        List<String> order2 =  Arrays.stream(alphaNum).sorted(byLengthDes).collect(Collectors.toList());

        System.out.println(order2);

        Comparator<String> byAphabet= (str1, str2) -> str1.compareTo(str2);

        List<String> order3 =  Arrays.stream(alphaNum).sorted(byAphabet).collect(Collectors.toList());

        System.out.println(order3);

        Comparator<String> byE= (str1, str2) -> {
            int s1,s2;
                if (str1.contains("e")){
                    s1 = 0;
                }else {
                    s1 = 1;
                }
                if (str2.contains("e")){
                    s2 = 0;
                }else {
                    s2 = 1;
                }
                return s1-s2;
        };

        List<String> order4 =  Arrays.stream(alphaNum).sorted(byE).collect(Collectors.toList());

        System.out.println(order4);

        List<String> replaceABy4 =  Arrays.stream(alphaNum).map(str1 -> str1.replace("a", "4")).collect(Collectors.toList());

        System.out.println(replaceABy4);

        List<String> showOnlyNumbers =  Arrays.stream(alphaNum).filter(str -> {
                                                                    boolean result;
                                                                    try{
                                                                        Integer.parseInt(str);
                                                                        result = true;
                                                                    }catch (NumberFormatException e){
                                                                        result = false;
                                                                    }
                                                                    return result;
                                                                    }).collect(Collectors.toList());

        System.out.println(showOnlyNumbers);

        Operation op = (float x, String operation, float y) -> {
            float result = 0;
            switch (operation){
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    if(y == 0){
                        result = x / y;
                    }else {
                        System.out.println("Y no puede ser 0");
                    }
                    break;
                default:
                    System.out.println("Operación no soportada");
                    break;
            }
            return result;
        };


        System.out.println(op.operation(4,"*", 8));



    }


}
