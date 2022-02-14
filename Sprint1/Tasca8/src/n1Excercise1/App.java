package n1Excercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Luis", "Juana", "Omar", "Antonio", "Mario");

        List<String> nombres1 = nombres.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .collect(Collectors.toList());


        System.out.println(nombres1);

        List<Integer> numeros = Arrays.asList(1, 45, 58, 11, 74, 52);
        System.out.println(listToString(numeros));

        System.out.println(wordsWithO(nombres));
        System.out.println(wordsOAnd5(nombres));

        List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo",
                "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        meses.forEach(mese -> System.out.println(mese));

        meses.forEach(System.out::println);


        PiValue funInter = () -> 3.1415;

        System.out.println(funInter.getPiValue());

        ReverseString reveStr = (str) -> new StringBuilder(str).reverse().toString();

        System.out.println(reveStr.reverse("Hola"));

    }

    static String listToString(List<Integer> numeros){

            String numerosEdit = numeros.stream()
                                        .map(n -> {
                                            String result;
                                            if(n % 2 == 0){
                                                result = "e" + n;
                                            }else {
                                                result = "o" + n;
                                            }
                                            return result;
                                        })
                    .collect(Collectors.joining(","));


        return  numerosEdit ;
    }

    static List<String> wordsWithO(List<String> list){

        List<String> listWithO = list.stream()
                                        .filter(str -> str.contains("o") || str.contains("O"))
                                        .collect(Collectors.toList());
        return listWithO;
    }

    static List<String> wordsOAnd5(List<String> list){

        List<String> listWithOAnd5 = list.stream()
                                        .filter(str -> str.contains("o") || str.contains("O"))
                                        .filter(str -> str.length() > 5 )
                                        .collect(Collectors.toList());
        return listWithOAnd5;
    }


}
