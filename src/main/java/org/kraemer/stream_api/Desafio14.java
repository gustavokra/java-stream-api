package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Desafio14 {

//    Desafio 14 - Encontre o maior número primo da lista:
//    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.


    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter(Desafio14::isPrime)
                .mapToInt(Integer::intValue)
                .max()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Não foi possível encontrar maior número primo.")
                );
    }

}
