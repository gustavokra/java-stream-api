package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio15 {
//    Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean possuiNegativo = numeros.stream().anyMatch(num -> num < 0);

        if(possuiNegativo) {
            System.out.println("A lista possui um número negativo.");
        } else {
            System.out.println("A lista não possui um número negativo.");
        }
    }

}
