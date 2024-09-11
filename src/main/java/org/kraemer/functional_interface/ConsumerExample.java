package org.kraemer.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.forEach(numero -> {
                    if (numero % 2 == 0) {
                        System.out.println(numero);
                    }
                }
        );

//        numeros.forEach(
//                new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer numero) {
//                        System.out.println(numero);
//                    }
//                }
//        );

    }
}
