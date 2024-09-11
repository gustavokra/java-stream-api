package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio10 {
//    Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//    Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> imparesMultiplos3ou5 = numeros.stream()
                .filter(num -> num % 2 != 0)
                .filter(num -> (num % 3 == 0) || (num % 5 == 0 ))
                .toList();

        System.out.println("Ímpares múltiplos de 3 ou de 5: " + imparesMultiplos3ou5);
    }

}
