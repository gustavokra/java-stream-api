package org.kraemer.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Function<Integer, String> dobrar = numero -> {
            Integer dobro = numero * 2;
            return dobro.toString();
        };

        List<String> numerosDobradosString = numeros.stream()
                .map(numero -> {
                    int dobro = numero * 2;
                    return Integer.toString(dobro);
                })
                .toList();

        numerosDobradosString.forEach(System.out::println);

//        List<String> numerosDobradosString = numeros.stream()
//                .map(
//                    new Function<Integer, String>() {
//                        public String apply(Integer numero) {
//                            int dobro = numero * 2;
//                            return Integer.toString(dobro);
//                        }
//                    }
//                )
//                .toList();
    }

}
