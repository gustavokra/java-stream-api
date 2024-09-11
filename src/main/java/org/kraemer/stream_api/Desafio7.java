package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//Desafio 7 - Encontrar o segundo número maior da lista:
//Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
public class Desafio7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted((n1, n2) -> n2 - n1)
                .skip(1)
                .findFirst();

        segundoMaior.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Não existe segundo número maior.")
        );
    }

}
