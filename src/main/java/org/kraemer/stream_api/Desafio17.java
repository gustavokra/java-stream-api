package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Desafio17 {

//    Desafio 17 - Filtrar os números primos da lista:
//    Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

    public static boolean isPrime(Integer number) {
        return IntStream
                .rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(num -> number % num == 0);
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> primos = numeros.stream()
                .filter(Desafio17::isPrime)
                .toList();

        System.out.println(primos);
    }


}
