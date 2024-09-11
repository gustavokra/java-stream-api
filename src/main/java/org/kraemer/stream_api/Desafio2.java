package org.kraemer.stream_api;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Desafio 2 - Imprima a soma dos números pares da lista:
//Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
public class Desafio2 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaNumPares = numeros
                .stream()
                .filter(num -> num % 2 == 0)
                .reduce(Integer::sum)
                .orElseThrow();

        System.out.println(somaNumPares);
    }

}
