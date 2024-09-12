package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio16 {

    //    Desafio 16 - Agrupe os números em pares e ímpares:
//    Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> groupedNumbers = numeros.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> pares = groupedNumbers.get(true);
        List<Integer> impares = groupedNumbers.get(false);

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
