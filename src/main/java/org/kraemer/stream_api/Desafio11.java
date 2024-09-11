package org.kraemer.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio11 {

//    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//    Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> potenciacao = new ArrayList<>();
        int somaDosNumeros = 0;
        for(Integer num : numeros) {
            somaDosNumeros = somaDosNumeros + (num * num);
        }
        System.out.println(somaDosNumeros);

        numeros.stream()
                .map(num -> num * num)
                .reduce(Integer::sum)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("NÃO FOI POSSÍVEL SOMAR TUDO")
                );

    }
}
