package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio12 {
//    Desafio 12 - Encontre o produto de todos os números da lista:
//    Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .reduce((num1, num2) -> num1 * num2)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Não foi possível obter o produto dos números.")
                );
    }

}
