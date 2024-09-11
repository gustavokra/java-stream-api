package org.kraemer.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
public class Desafio6 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaiores10  = numeros.stream().filter(num -> num > 10).toList();

        if(numerosMaiores10.isEmpty()) {
            System.out.println("Não existem números maiores que 10.");
        } else {
            numerosMaiores10.forEach(System.out::println);
        }
    }

}
