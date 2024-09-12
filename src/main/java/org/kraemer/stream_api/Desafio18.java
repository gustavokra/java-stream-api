package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Desafio18 {

    //    Desafio 18 - Verifique se todos os números da lista são iguais:
//    Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                numeros.stream().allMatch(num -> Objects.equals(num, numeros.getFirst())) ?
                        "Todos itens da lista são iguais."
                        : "Todos itens da lista não são iguais.");
    }
}


